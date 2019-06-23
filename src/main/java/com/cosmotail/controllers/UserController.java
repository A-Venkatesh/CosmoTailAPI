/**
 * 
 */
package com.cosmotail.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cosmotail.entities.User;
import com.cosmotail.repositories.UserRepository;

/**
 * @author Anbu
 *
 */
@RestController
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	Map<String, String> errors;
	
	@PostMapping("/createUser")
	public ResponseEntity<Map<String, String>> createUser(@RequestBody @Valid User user,BindingResult bindingResult){
		
		
		if(bindingResult.hasErrors()){
			errors = new HashMap();
			for(FieldError error:bindingResult.getFieldErrors()){
				errors.put(error.getField(), error.getDefaultMessage());
			}
			System.out.println("********error*********");
			return new ResponseEntity<Map<String, String>>(errors, HttpStatus.NOT_ACCEPTABLE);
			
		}
		
		User u = userRepository.findByEmail(user.getEmail());
		if(u!=null){
			System.out.println("********null*********");
			return new ResponseEntity<Map<String, String>>(HttpStatus.CONFLICT);
			
		}
		return new ResponseEntity<Map<String, String>>( HttpStatus.OK);
		//sssssssssssssssss
		
	}
}
