package com.turing.service;

import java.util.List;

import com.turing.entity.Car;

public interface ICarService {
	/*
	 * ��ѯ����
	 */
	Car findCar(Integer id);
	
	/**
	 * ��ѯ���
	 */
	List<Car> findList();
	
	/**
	 * ���
	 */
	int inser(Car car);
	
	/**
	 * �޸�
	 */
	int update(Car car);
	
	/**
	 * ɾ��
	 */
	int del(Integer id);
}
