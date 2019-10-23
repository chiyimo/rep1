package com.turing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.turing.entity.Car;
import com.turing.service.ICarService;

@Controller
public class CarController {

	//“¿¿µ◊¢»Î
	private ICarService carService;
	
	
	@RequestMapping("/car/{id}")
	@ResponseBody
	public Car getCar(@PathVariable("id")Integer id) {
		return carService.findCar(id);
	}
	
	
	
}
