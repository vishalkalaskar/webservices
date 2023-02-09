package com.example.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jwt.model.JwtRequest;
import com.example.jwt.model.JwtResponse;
import com.example.jwt.service.UserService;
import com.example.jwt.utility.JWTUtility;

@RestController
public class JwtController 
{
	@Autowired
	private JWTUtility  JWTUtility ;
	
	@Autowired
	private AuthenticationManager AuthenticationManager ;
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
    public String home()
    {
    	return "Welcome to daily code Buffer";
    }
	
	@PostMapping("/authenticate")
	public JwtResponse authenticate(@RequestBody JwtRequest jwtRequest) throws Exception
	{
		try {
			
		
		AuthenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(jwtRequest.getUsername(), jwtRequest.getPassword()
						)
				);
		}
		catch(BadCredentialsException e)
		{
			throw new Exception("INVALID_CREDENTIALS",e);
		}
		
		final UserDetails userDetails= userService.loadUserByUsername(jwtRequest.getUsername());
		
		final String token=JWTUtility.generateToken(userDetails);
		
		return new JwtResponse(token);
	}
}
