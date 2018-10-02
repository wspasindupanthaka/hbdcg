package it.codegen.hbdcg.response;

import org.springframework.http.HttpStatus;

/**
 * Created by pasindu on 2017-08-11.
 */
public class PostResponse
{
	private String message;
	private HttpStatus httpStatus;
	private int httpStatusCode;
	private Object extraObject;
	private String httpTitle;

	public PostResponse()
	{
	}

	public PostResponse( String message, HttpStatus httpStatus, int httpStatusCode )
	{
		this.message = message;
		this.httpStatus = httpStatus;
		this.httpStatusCode = httpStatusCode;

	}

	public PostResponse( String title, String message, HttpStatus httpStatus, int httpStatusCode )
	{
		this.httpTitle = title;
		this.message = message;
		this.httpStatus = httpStatus;
		this.httpStatusCode = httpStatusCode;

	}

	public PostResponse( String message, HttpStatus httpStatus, int httpStatusCode, Object extraObject )
	{
		this.message = message;
		this.httpStatus = httpStatus;
		this.httpStatusCode = httpStatusCode;
		this.extraObject = extraObject;
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage( String message )
	{
		this.message = message;
	}

	public HttpStatus getHttpStatus()
	{
		return httpStatus;
	}

	public void setHttpStatus( HttpStatus httpStatus )
	{
		this.httpStatus = httpStatus;
	}

	public int getHttpStatusCode()
	{
		return httpStatusCode;
	}

	public void setHttpStatusCode( int httpStatusCode )
	{
		this.httpStatusCode = httpStatusCode;
	}

	public Object getExtraObject()
	{
		return extraObject;
	}

	public void setExtraObject( Object extraObject )
	{
		this.extraObject = extraObject;
	}

	public String getHttpTitle()
	{
		return httpTitle;
	}

	public void setHttpTitle( String httpTitle )
	{
		this.httpTitle = httpTitle;
	}

	@Override
	public String toString()
	{
		return "PostResponse{" +
				"message='" + message + '\'' +
				", httpStatus=" + httpStatus +
				", httpStatusCode=" + httpStatusCode +
				", extraObject=" + extraObject +
				'}';
	}

}
