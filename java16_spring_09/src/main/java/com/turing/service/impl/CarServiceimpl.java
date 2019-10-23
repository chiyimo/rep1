package com.turing.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turing.entity.Car;
import com.turing.mapper.CarMapper;
import com.turing.service.ICarService;

@Service
public class CarServiceimpl implements ICarService {

	//“¿¿µ◊¢»Î
	@Autowired
	private CarMapper carMapper;
	
	@Override
	public Car findCar(Integer id) {
		return carMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Car> findList() {
		return carMapper.selectByExample(null);
	}

	@Override
	public int inser(Car car) {
		return carMapper.insertSelective(car);
	}

	@Override
	public int update(Car car) {
		return carMapper.updateByPrimaryKey(car);
	}

	@Override
	public int del(Integer id) {
		return carMapper.deleteByPrimaryKey(id);
	}

}
