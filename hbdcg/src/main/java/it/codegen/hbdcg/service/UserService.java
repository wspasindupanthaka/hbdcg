package it.codegen.hbdcg.service;

import it.codegen.DBUtility;
import it.codegen.Savable;
import it.codegen.hbdcg.model.User;
import it.codegen.hbdcg.util.Db;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by pasindu on 2018-10-01.
 * hbdcg
 * it.codegen.hbdcg.service
 */
@Service
public class UserService
{
	public static User getUserFromParam( String paramName, String paramValue ) throws SQLException
	{
		ResultSet rs = null;
		PreparedStatement ps = null;
		Connection con = null;

		User user = null;

		try
		{

			con = Db.getConnection();

			String getUser = "select * from user where " + paramName + " = ?";

			ps = con.prepareStatement( getUser );

			int paramCount = 0;

			ps.setString( ++paramCount, paramValue );

			rs = ps.executeQuery();
			while ( rs.next() )
			{
				user = new User();
				user.load( rs, con, 0 );
			}
		}
		finally
		{
			DBUtility.close( rs );
			DBUtility.close( ps );
			DBUtility.close( con );
		}
		return user;
	}

	public static List<User> getAllUsers() throws SQLException
	{
		ResultSet rs = null;
		PreparedStatement ps = null;
		Connection con = null;

		List<User> users = new ArrayList<>();

		try
		{

			con = Db.getConnection();

			String getUser = "select * from user";

			ps = con.prepareStatement( getUser );

			rs = ps.executeQuery();
			while ( rs.next() )
			{
				User user = new User();
				user.load( rs, con, 0 );
				users.add( user );
			}
		}
		finally
		{
			DBUtility.close( rs );
			DBUtility.close( ps );
			DBUtility.close( con );
		}
		return users;
	}

	public static void updateToken() throws SQLException
	{
		PreparedStatement ps = null;
		Connection con = null;

		User user = null;

		try
		{

			con = Db.getConnection();

			List<User> allUsers = getAllUsers();



			for ( User u : allUsers )
			{

				UUID uuid = UUID.randomUUID();
				String randomUUIDString = uuid.toString();

				String token = randomUUIDString.replace( "-", "" ).toUpperCase();

				u.setToken( token );
				u.setStatus( Savable.MODIFIED );

				u.save( con );
			}

		}
		finally
		{
			DBUtility.close( ps );
			DBUtility.close( con );
		}
	}
}
