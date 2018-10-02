package it.codegen.hbdcg.util;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * Created by pasindu on 2018-03-27.
 * hris
 * it.codegen.hris.util
 */
public class PropertiesReader
{
	public static boolean loadFromLocal = false;
	private static Properties properties = null;
	String result = "";
	InputStream inputStream;

	private PropertiesReader() throws IOException
	{
		properties = new Properties();
		System.out.println( "Properties Inited" );
		String propFileName = "config.properties";

		File configDir = null;
		if ( loadFromLocal )
		{
			Path path = Paths.get( "src", "main", "resources" );
			configDir = new File( String.valueOf( path ) );
			System.out.println( configDir.getAbsolutePath() );
		}
		else
		{
			configDir = new File( System.getProperty( "catalina.base" ), "conf" );
		}
		File configFile = new File( configDir, propFileName );

		inputStream = new FileInputStream( configFile );

		if ( inputStream != null )
		{
			properties.load( inputStream );
		}
		else
		{
			throw new FileNotFoundException( "property file '" + propFileName + "' not found in the classpath" );
		}

	}

	public static Properties getInstance() throws IOException
	{
		if ( properties == null )
		{
			reInitProperties();
		}

		return properties;
	}

	public static void reInitProperties() throws IOException
	{
		new PropertiesReader();
	}

	public String getPropValues( String propName ) throws IOException
	{

		String result = properties.getProperty( propName );
		return result;
	}
}
