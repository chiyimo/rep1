package com.turing.service;

import java.util.List;

import com.turing.entity.Car;

public interface ICarService {
	/*
	 * 查询单个
	 */
	Car findCar(Integer id);
	
	/**
	 * 查询多个
	 */
	List<Car> findList();
	
	/**
	 * 添加
	 */
	int inser(Car car);
	
	/**
	 * 修改
	 */
	int update(Car car);
	
	/**
	 * 删除
	 */
	int del(Integer id);
}
