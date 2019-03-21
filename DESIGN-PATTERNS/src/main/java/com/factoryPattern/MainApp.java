package com.factoryPattern;

public class MainApp {

	public static void main(String[] args) {

		System.out.println(CarFactory.buildCar(CarType.HATCHBACK));
		System.out.println(CarFactory.buildCar(CarType.SEDAN));
		System.out.println(CarFactory.buildCar(CarType.SUV));

	}

}
