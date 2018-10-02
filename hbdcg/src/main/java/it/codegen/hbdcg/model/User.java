package it.codegen.hbdcg.model;

import it.codegen.DBUtility;
import it.codegen.Savable;
import it.codegen.SavingSQLException;

import java.sql.*;

/**
 * Created by pasindu on 2018-10-01.
 * hbdcg
 * it.codegen.hbdcg
 */
public class User extends Savable
{
	private long id;
	private String username;
	private String empNo;
	private String fName;
	private String lName;
	private String designation;
	private String image;
	private String aboutme;
	private String project;
	private String active;
	private String gender;
	private String name;
	private String token;

	public User()
	{
	}

	public void checkValidity() throws SavingSQLException
	{
		//validates before any db operations
	}

	@Override
	public void save( Connection con ) throws SavingSQLException
	{
		String action = "";
		try
		{
			if ( this.status == Savable.MODIFIED )
			{
				action = "Updating";
				checkValidity();
				update( con );
			}
			else
			{
				throw new SavingSQLException( "Incorret setting of Status flag!" );
			}
		}
		catch ( SQLException se )
		{
			se.printStackTrace();
			throw new SavingSQLException( "Error in " + action +
					se.getMessage(),
					se.getSQLState(),
					se.getErrorCode() );
		}
	}

	@Override
	public void load( ResultSet rs, Connection con, int level ) throws SQLException
	{
		this.id = rs.getLong( "id" );
		this.username = rs.getString( "username" );
		this.empNo = rs.getString( "emp_no" );
		this.fName = rs.getString( "fname" );
		this.lName = rs.getString( "lname" );
		this.designation = rs.getString( "designation" );
		this.image = rs.getString( "image" );
		this.aboutme = rs.getString( "about" );
		this.project = rs.getString( "project" );
		this.active = rs.getString( "active" );
		this.gender = rs.getString( "gender" );
		this.token = rs.getString( "token" );

		this.name = fName + " " + lName;
	}

	private void update( Connection con ) throws SQLException
	{
		PreparedStatement ps = null;
		try
		{
			String str = "UPDATE user SET "
					+ "TOKEN = ? WHERE "
					+ "ID = ? ";

			int count = 0;
			ps = con.prepareStatement( str );
			ps.setString( ++count, this.token );
			ps.setLong( ++count, this.id );

			ps.execute();

		}
		finally
		{
			DBUtility.close( ps );
		}

	}

	public long getId()
	{
		return id;
	}

	public void setId( long id )
	{
		this.id = id;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername( String username )
	{
		this.username = username;
	}

	public String getEmpNo()
	{
		return empNo;
	}

	public void setEmpNo( String empNo )
	{
		this.empNo = empNo;
	}

	public String getfName()
	{
		return fName;
	}

	public void setfName( String fName )
	{
		this.fName = fName;
	}

	public String getlName()
	{
		return lName;
	}

	public void setlName( String lName )
	{
		this.lName = lName;
	}

	public String getDesignation()
	{
		return designation;
	}

	public void setDesignation( String designation )
	{
		this.designation = designation;
	}

	public String getImage()
	{
		return image;
	}

	public void setImage( String image )
	{
		this.image = image;
	}

	public String getAboutMe()
	{
		return aboutme;
	}

	public void setAboutMe( String aboutme )
	{
		this.aboutme = aboutme;
	}

	public String getProject()
	{
		return project;
	}

	public void setProject( String project )
	{
		this.project = project;
	}

	public String getActive()
	{
		return active;
	}

	public void setActive( String active )
	{
		this.active = active;
	}

	public String getGender()
	{
		return gender;
	}

	public void setGender( String gender )
	{
		this.gender = gender;
	}

	public String getAboutme()
	{
		return aboutme;
	}

	public void setAboutme( String aboutme )
	{
		this.aboutme = aboutme;
	}

	public String getName()
	{
		return name;
	}

	public void setName( String name )
	{
		this.name = name;
	}

	public String getToken()
	{
		return token;
	}

	public void setToken( String token )
	{
		this.token = token;
	}
}
