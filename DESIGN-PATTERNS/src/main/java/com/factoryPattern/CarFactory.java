package com.factoryPattern;

public class CarFactory {

	public static Car buildCar(CarType model) {
		Car car = null;
		switch (model) {
		case HATCHBACK:
			car = new HatchBack();
			break;

		case SEDAN:
			car = new Sedan();
			break;

		case SUV:
			car = new Suv();
			break;

		default:
			// throw some exception
			break;
		}
		return car;

	}
}
