package com.singletondesignpattern;

import java.io.Serializable;

public class Singleton implements Serializable {
	private static final long serialVersionUID = 1L;

	private Singleton() {
		// private constructor
	}

	private static class DemoSingletonHolder {
		public static final Singleton INSTANCE = new Singleton();
	}

	public static Singleton getInstance() {
		return DemoSingletonHolder.INSTANCE;
	}

	protected Object readResolve() {
		return getInstance();
	}
}