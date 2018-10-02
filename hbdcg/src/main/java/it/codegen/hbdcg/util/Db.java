package it.codegen.hbdcg.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by pasindu on 2018-10-01.
 * hbdcg
 * it.codegen.hbdcg.hbdcg.util
 */
public class Db
{
	final static Logger logger = Logger.getLogger( Db.class.getName() );
	private static String DRIVER_NAME = "com.mysql.jdbc.Driver";
	public static final String IP = "192.168.0.171";
	public static final String DB_NAME = "hbdcg";
	public static final String DB_USER = "hris";
	public static final String DB_PASSWORD = "Hris@321";

	public static Connection getConnection()
	{
		Connection con = null;
		try
		{

			Class.forName( DRIVER_NAME );
			con = DriverManager
					.getConnection( "jdbc:mysql://192.168.0.171:3306/hbdcg",
							DB_USER, DB_PASSWORD );


			//			putToConnectionsMap( con );

			//			con = DriverManager.getConnection( "jdbc:mysql://kriyodb.cpv2srwpndoy.eu-west-1.rds.amazonaws.com:3306/" + "sltc", "sltc", "sltc#321" );
		}

		catch ( SQLException ex )
		{
			// log an exception. fro example:
			logger.log( Level.SEVERE, "Failed to create the main database connection." );
			ex.printStackTrace();
		}
		catch ( Exception e )
		{
			e.printStackTrace();
		}
		return con;
	}
}
