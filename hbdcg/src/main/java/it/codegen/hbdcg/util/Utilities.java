package it.codegen.hbdcg.util;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Created by anuruddhaw on 9/20/2017.
 */
public class Utilities
{



	public static final String IP()
	{
		return PROPERTIES().get( "IP" ).toString();
	}

	public static final String DB_NAME()
	{
		return PROPERTIES().get( "DB_NAME" ).toString();
	}

	public static final String DB_USER()
	{
		return PROPERTIES().get( "DB_USER" ).toString();
	}

	public static final String DB_PASSWORD()
	{
		return PROPERTIES().get( "DB_PASSWORD" ).toString();
	}

	public static final String AUTH_DB_NAME()
	{
		return PROPERTIES().get( "AUTH_DB_NAME" ).toString();
	}

	public static final String REVIEW_BASE_URL()
	{
		return PROPERTIES().get( "REVIEW_BASE_URL" ).toString();
	}

	public static final String REDIRECT_BASE_URL()
	{
		return PROPERTIES().get( "REDIRECT_BASE_URL" ).toString();
	}

	public static final long TIME_DIFFERENCE()
	{
		return Long.parseLong( PROPERTIES().get( "TIME_DIFFERENCE" ).toString() );
	}

	public static final String LDAP_SERVER()
	{
		return PROPERTIES().get( "LDAP_SERVER" ).toString();
	}

	public static final String UPLOAD_FOLDER()
	{
		return PROPERTIES().get( "UPLOAD_FOLDER" ).toString();
	}

	public static final String OUTPUT_FOLDER()
	{
		return PROPERTIES().get( "OUTPUT_FOLDER" ).toString();
	}

	public static final String UPLOAD_PROFILE_PIC()
	{
		return PROPERTIES().get( "UPLOAD_PROFILE_PIC" ).toString();
	}

	public static final String OUTPUT_PROFILE_PIC()
	{
		return PROPERTIES().get( "OUTPUT_PROFILE_PIC" ).toString();
	}

	public static final String SERVER_TIME_ZONE()
	{
		return PROPERTIES().get( "TIME_ZONE" ).toString();
	}

	public static final String SAVAREE_PATH()
	{
		return PROPERTIES().get( "SAVAREE_PATH" ).toString();
	}

	public static final String BASE_URL()
	{
		return PROPERTIES().get( "BASE_URL" ).toString();
	}

	public static final String COMPANY_NAME()
	{
		return PROPERTIES().get( "COMPANY_NAME" ).toString();
	}

	public static final String COMPANY_URL()
	{
		return PROPERTIES().get( "COMPANY_URL" ).toString();
	}

	public static final String UPLOAD_FOLDER_EVENT()
	{
		return PROPERTIES().get( "UPLOAD_FOLDER_EVENT" ).toString();
	}

	public static final String OUTPUT_URL_EVENT()
	{
		return PROPERTIES().get( "OUTPUT_URL_EVENT" ).toString();
	}

	public static final String UPLOAD_FOLDER_PAGE()
	{
		return PROPERTIES().get( "UPLOAD_FOLDER_PAGE" ).toString();
	}

	public static final String OUTPUT_URL_PAGE()
	{
		return PROPERTIES().get( "OUTPUT_URL_PAGE" ).toString();
	}

	public static final String DEMO_DATA_COLLECT_DB_NAME()
	{
		return PROPERTIES().get( "DEMO_DATA_COLLECT_DB_NAME" ).toString();
	}

	public static final boolean SHOULD_SEND_MAILS()
	{
		return Boolean.parseBoolean( PROPERTIES().get( "SHOULD_SEND_MAILS" ).toString() );
	}

	public static final boolean SHOULD_SEND_OTHER_MAILS()
	{
		return Boolean.parseBoolean( PROPERTIES().get( "SHOULD_SEND_OTHER_MAILS" ).toString() );
	}

	public static final boolean PRINT_DB_STATS()
	{
		return Boolean.parseBoolean( PROPERTIES().get( "PRINT_DB_STATS" ).toString() );
	}

	public static final boolean PRINT_DB_CLOSING_STATS()
	{
		return Boolean.parseBoolean( PROPERTIES().get( "PRINT_DB_CLOSING_STATS" ).toString() );
	}

	public static final boolean PRINT_FORCIBLY_CLOSING_CONNECTION_STATS()
	{
		return Boolean.parseBoolean( PROPERTIES().get( "PRINT_FORCIBLY_CLOSING_CONNECTION_STATS" ).toString() );
	}

	public static final boolean PRINT_CLEARING_MAP_STATS()
	{
		return Boolean.parseBoolean( PROPERTIES().get( "PRINT_CLEARING_MAP_STATS" ).toString() );
	}

	public static final boolean SHOULD_SEND_EVENT_INVITATION_MAILS()
	{
		return Boolean.parseBoolean( PROPERTIES().get( "SHOULD_SEND_EVENT_INVITATION_MAILS" ).toString() );
	}

	public static final int MAX_CONNECTIONS()
	{
		return Integer.parseInt( PROPERTIES().get( "MAX_CONNECTIONS" ).toString().trim() );
	}

	public static final int MAX_IDLE_CONNECTIONS()
	{
		return Integer.parseInt( PROPERTIES().get( "MAX_IDLE_CONNECTIONS" ).toString().trim() );
	}

	public static final int CONNECTION_LIFE_TIME_MINS()
	{
		return Integer.parseInt( PROPERTIES().get( "CONNECTION_LIFE_TIME_MINS" ).toString().trim() );
	}

	public static final int CALENDAR_FIRST_DAY_OF_WEEK()
	{
		return Integer.parseInt( PROPERTIES().get( "CALENDAR_FIRST_DAY_OF_WEEK" ).toString().trim() );
	}

	public static final List<Integer> CALENDAR_WEEKEND_DAYS()
	{
		String[] days = PROPERTIES().get( "CALENDAR_WEEKEND_DAYS" ).toString().trim().split( "," );
		List<Integer> integers = new ArrayList<>();
		for ( int i = 0; i < days.length; i++ )
		{
			integers.add( i, Integer.parseInt( days[i] ) );
		}

		return integers;
	}

	public static final String LETTER_REQUEST_MAIL_GROUP()
	{
		return PROPERTIES().get( "LETTER_REQUEST_MAIL_GROUP" ).toString();
	}

	public static final String DEFAULT_IMAGE_EVENT()
	{
		return PROPERTIES().get( "DEFAULT_IMAGE_EVENT" ).toString();
	}

	public static final String DEFAULT_VENUE_FACILITY_IMAGE()
	{
		return PROPERTIES().get( "DEFAULT_VENUE_FACILITY_IMAGE" ).toString();
	}

	public static final String DEFAULT_VENUE_IMAGE()
	{
		return PROPERTIES().get( "DEFAULT_VENUE_IMAGE" ).toString();
	}

	public static final String DEFAULT_PAGE_IMAGE()
	{
		return PROPERTIES().get( "DEFAULT_PAGE_IMAGE" ).toString();
	}

	public static final String MAIL_SUBJECT()
	{
		return PROPERTIES().get( "MAIL_SUBJECT" ).toString();
	}

	public static final String DEFAULT_PROFILE_IMAGE()
	{
		return PROPERTIES().get( "DEFAULT_PROFILE_IMAGE" ).toString();
	}

	public static final String DEFAULT_REFERENCE_ICON_IMAGE()
	{
		return PROPERTIES().get( "DEFAULT_REFERENCE_ICON_IMAGE" ).toString();
	}

	public static final String DEFAULT_PROJECT_IMAGE()
	{
		return PROPERTIES().get( "DEFAULT_PROJECT_IMAGE" ).toString();
	}

	public static final String UPLOAD_FOLDER_PROJECT()
	{
		return PROPERTIES().get( "UPLOAD_FOLDER_PROJECT" ).toString();
	}

	public static final Double EXPECTED_WORKING_HOURS()
	{
		return Double.parseDouble( PROPERTIES().get( "EXPECTED_WORKING_HOURS" ).toString().trim() );
	}

	public static final String EXPECTED_IN_TIME()
	{
		return PROPERTIES().get( "EXPECTED_IN_TIME" ).toString();
	}

	public static final String EXPECTED_OUT_TIME()
	{
		return PROPERTIES().get( "EXPECTED_OUT_TIME" ).toString();
	}

	public static final String ELASTIC_HOST()
	{
		return PROPERTIES().get( "ELASTIC_HOST" ).toString();
	}

	public static final int ELASTIC_PORT()
	{
		return Integer.parseInt( PROPERTIES().get( "ELASTIC_PORT" ).toString().trim() );
	}

	public static final String UPLOAD_FOLDER_REFERENCE()
	{
		return PROPERTIES().get( "UPLOAD_FOLDER_REFERENCE" ).toString();
	}

	public static final String OUTPUT_URL_REFERENCE()
	{
		return PROPERTIES().get( "OUTPUT_URL_REFERENCE" ).toString();
	}

	public static final String CLUSTER_NAME()
	{
		return PROPERTIES().get( "CLUSTER_NAME" ).toString();
	}

	public static final int UK_EMPLOYEE_CADRE()
	{
		return Integer.parseInt( PROPERTIES().get( "UK_EMPLOYEE_CADRE" ).toString().trim() );
	}

	public static final boolean LOAD_FEED_FROM_ES()
	{
		return Boolean.parseBoolean( PROPERTIES().get( "LOAD_FEED_FROM_ES" ).toString() );
	}


	//LIVE :192.168.0.170
	//	public static final String DB_NAME = "hris_db?useUnicode=true&characterEncoding=UTF-8";
	//	public static final String DB_USER = "hris";
	//	public static final String DB_PASSWORD = "Hris@321";
	//	public static final String AUTH_DB_NAME = "auth_db?verifyServerCertificate=false&useSSL=true";
	//	public static final String REVIEW_BASE_URL = "http://119.235.9.12:7070/review/review/";
	//	public static final String REDIRECT_BASE_URL = "http://119.235.9.12:7070/#/";
	//	public static final long TIME_DIFFERENCE = 19800000;
	//	public static final String LDAP_SERVER = "dc.codegen.net";
	//	public static final String UPLOAD_FOLDER = "/usr/local/tbx/hrapp/apache-tomcat-8.0.21/webapps/image/";
	//	public static final String OUTPUT_FOLDER = "http://119.235.9.12:7070/image/";
	//	public static final String UPLOAD_PROFILE_PIC = "/usr/local/tbx/hrapp/apache-tomcat-8.0.21/webapps/profile_image/";
	//	public static final String OUTPUT_PROFILE_PIC = "http://119.235.9.12:7070/profile_image/";
	//	public static final String SERVER_TIME_ZONE = "Asia/Colombo";
	//	public static final String SAVAREE_PATH = "/usr/local/tbx/hrapp/apache-tomcat-8.0.21/webapps/savaree";
	//	//	public static final String BASE_URL = "http://119.235.9.12:7070/codegen/";
	//	//	public static final String SAVAREE_PATH = "F:/KRIYO- 2018/KRIYO/KRIYO-Backend/kriyo-backend/src/main/resources/savaree/ner";
	//	//	public static String UPLOAD_FOLDER = "E:/image";
	//	public static final String BASE_URL = "http://localhost:8080/";
	//	public static final String COMPANY_NAME = "CodeGen International (Pvt) Ltd.";
	//	public static final String UPLOAD_FOLDER_EVENT = "/usr/local/tbx/hrapp/apache-tomcat-8.0.21/webapps/images/event/";
	//	public static final String OUTPUT_URL_EVENT = "http://119.235.9.12:7070/images/event/";

	private static Properties PROPERTIES()
	{
		Properties properties = null;
		try
		{
			properties = PropertiesReader.getInstance();
		}
		catch ( IOException e )
		{
			e.printStackTrace();
		}
		return properties;
	}

	//AWS :52.17.243.164
	//				public static String IP = "127.0.0.1";
	//				public static String DB_NAME = "HMIS_HR?useUnicode=true&characterEncoding=UTF-8";
	//				public static String DB_USER = "HMIS_HR";
	//				public static String DB_PASSWORD = "HMIS_HR";
	//				public static String AUTH_DB_NAME = "auth_db?verifyServerCertificate=false&useSSL=true";
	//				public static String REVIEW_BASE_URL = "https://codegen.kriyo.net/review/review/";
	//				public static String REDIRECT_BASE_URL = "https://codegen.kriyo.net/#/";
	//				public static long TIME_DIFFERENCE = 19800000;
	////				public static String LDAP_SERVER = "203.115.26.140";
	//				public static String LDAP_SERVER = "203.189.69.68";
	//				public static String UPLOAD_FOLDER = "/usr/local/tbx/HMIS_HR/app/apache-tomcat-8.0.38/webapps/images/";
	//				public static String OUTPUT_FOLDER = "https://codegen.kriyo.net/images/";
	//				public static String UPLOAD_PROFILE_PIC = "/usr/local/tbx/HMIS_HR/app/apache-tomcat-8.0.38/webapps/profile_image";
	//				public static String OUTPUT_PROFILE_PIC = "https://codegen.kriyo.net/profile_image/";
	//				public static final String SERVER_TIME_ZONE = "Europe/London";
	//				public static final String SAVAREE_PATH = "/usr/local/tbx/HMIS_HR/app/apache-tomcat-8.0.38/webapps/savaree";
	//				public static String COMPANY_NAME = "CodeGen International (Pvt) Ltd.";
	//				public static final String BASE_URL = "https://codegen.kriyo.net/";
	//				public static final String UPLOAD_FOLDER_EVENT = "/usr/local/tbx/HMIS_HR/app/apache-tomcat-8.0.38/webapps/images/event/";
	//				public static final String OUTPUT_URL_EVENT = "https://codegen.kriyo.net/images/event/";

	//demo local
	//		public static final String IP = "192.168.0.171";
	//		public static final String DB_NAME = "DEMO?useUnicode=true&characterEncoding=UTF-8";
	//		public static final String DB_USER = "hris";
	//		public static final String DB_PASSWORD = "Hris@321";
	//		public static final String AUTH_DB_NAME = "auth_db_demo?verifyServerCertificate=false&useSSL=true";
	//		public static final String REVIEW_BASE_URL = "https://codegen.kriyo.net/review/review/";
	//		public static final String REDIRECT_BASE_URL = "http://192.168.0.170:9090/#/";
	//		public static final long TIME_DIFFERENCE = 0;
	//		public static final String LDAP_SERVER = "dc.codegen.net";
	//		public static final String UPLOAD_FOLDER = "/usr/local/tbx/kriyodemo/apache-tomcat-8.0.21/webapps/image/";
	//		public static final String OUTPUT_FOLDER = "http://192.168.0.170:9090/image/";
	//		public static final String UPLOAD_PROFILE_PIC = "/usr/local/tbx/kriyodemo/apache-tomcat-8.0.21/webapps/profile_image/";
	//		public static final String OUTPUT_PROFILE_PIC = "http://192.168.0.170:9090/profile_image/";
	//		//			public static String UPLOAD_PROFILE_PIC = "E:/image";
	//		public static final String SERVER_TIME_ZONE = "Asia/Colombo";
	//		public static final String SAVAREE_PATH = "/usr/local/tbx/kriyodemo/apache-tomcat-8.0.21/webapps/savaree/";
	////			public static final String SAVAREE_PATH = "F:\\KRIYO- 2018\\KRIYO\\KRIYO-Backend\\kriyo-backend\\src\\main\\resources\\savaree\\ner";
	//		public static String COMPANY_NAME = "DEMO Company";

	//AWS DEMO
	//	public static String IP = "127.0.0.1";
	//	public static String DB_NAME = "DEMO?useUnicode=true&characterEncoding=UTF-8";
	//	public static String DB_USER = "HMIS_HR";
	//	public static String DB_PASSWORD = "HMIS_HR";
	//	public static String AUTH_DB_NAME = "auth_db_demo?verifyServerCertificate=false&useSSL=true";
	//	public static String REVIEW_BASE_URL = "https://codegen.kriyo.net/review/review/";
	//	public static String REDIRECT_BASE_URL = "http://demo.kriyo.net/#/";
	//	public static long TIME_DIFFERENCE = 19800000;
	//	public static String LDAP_SERVER = "203.115.26.140";
	//	public static String UPLOAD_FOLDER = "/usr/local/tbx/HMIS_HR/demo_app/apache-tomcat-8.0.38/webapps/images/";
	//	public static String OUTPUT_FOLDER = "http://demo.kriyo.net/images/";
	//	public static String UPLOAD_PROFILE_PIC = "/usr/local/tbx/HMIS_HR/demo_app/apache-tomcat-8.0.38/webapps/profile_image/";
	//	public static String OUTPUT_PROFILE_PIC = "http://demo.kriyo.net/profile_image/";
	//	public static final String SERVER_TIME_ZONE = "Europe/London";
	//	public static final String SAVAREE_PATH = "/usr/local/tbx/HMIS_HR/demo_app/apache-tomcat-8.0.38/webapps/savaree/";
	//	public static String COMPANY_NAME = "DEMO Company";

}
