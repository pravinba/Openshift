package com.example.zorro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;





@Controller
@RequestMapping(path="/osdemo")
public class OsController {
	
	@Autowired
	OsService carService;
	
	
	@RequestMapping("/insert")
	public @ResponseBody Iterable<Osdemo> insertCars(@RequestBody Osdemo carsRqst) {		
		System.out.println("Vehicle #"+carsRqst.getRegNo());
		return carService.insertCar(carsRqst);
	}
		
	@RequestMapping("/findAll")
	public @ResponseBody Iterable<Osdemo> findCars() {
		return carService.findCars();
	}
	
	@RequestMapping("/findOne")
	public @ResponseBody Osdemo findCar(@RequestParam Integer regno) {
		return carService.findCar(regno);
	}
	
	@RequestMapping("/remove")
	public @ResponseBody Osdemo removeCar(@RequestParam Integer regno) {
		return carService.removeCar(regno);
	}

	@RequestMapping("/greet")
	public @ResponseBody String insertCars(@RequestBody String name) {		
		return "Welcome to Openshift " + name + " !!!";
	}
}
