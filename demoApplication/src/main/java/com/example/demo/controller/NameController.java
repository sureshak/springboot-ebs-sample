/**
 * 
 */
package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cogjava3381
 *
 */
@RestController
public class NameController {
	
	@GetMapping(value="/getname")
	public String getName() {
		return "Suresh A K";
	}

}
