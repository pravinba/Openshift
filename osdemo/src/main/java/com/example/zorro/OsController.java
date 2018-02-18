package com.example.zorro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping(path="/osdemo")
public class OsController {

	@RequestMapping("/greet")
	public @ResponseBody String insertCars(@RequestBody String name) {		
		return "Welcome to Openshift " + name + " !!!";
	}
}
