package it.codegen.hbdcg.controller;

import it.codegen.CGResponse;
import it.codegen.hbdcg.model.User;
import it.codegen.hbdcg.response.PostResponse;
import it.codegen.hbdcg.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by pasindu on 2018-10-01.
 * hbdcg
 * it.codegen.hbdcg.controller
 */
@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UserController
{
	@RequestMapping(value = "/load", method = RequestMethod.GET)
	ResponseEntity<CGResponse> load( @RequestParam("iam") String token )
	{
		ResponseEntity response = null;

		try
		{
			User user = UserService.getUserFromParam( "token",token );
			response = new ResponseEntity<>( user, HttpStatus.OK );
		}
		catch ( Exception e )
		{
			e.printStackTrace();
			response = new ResponseEntity<>( new PostResponse( e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR, 500 ),
					HttpStatus.INTERNAL_SERVER_ERROR );
		}
		return response;
	}

}
