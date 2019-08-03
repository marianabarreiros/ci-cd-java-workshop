package com.testService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * javadoc.
 */
@RestController
@CrossOrigin
public class TestController {
	/***
	 * javadoc.
	 */

	@GetMapping("/home")
	public String homeRequest() {
		return "Hello World!";
	}
}
