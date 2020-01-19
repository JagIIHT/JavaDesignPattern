package com.dp.creational.singleton;

import java.lang.reflect.InvocationTargetException;

public class SingletonTest {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		System.out.println("*********************** Singleton Test Start **********************************");

		System.out.println(" 1 - " + SingletonClass.instance.hashCode());
		System.out.println(" 1 - " + SingletonClass.instance.hashCode());

		System.out.println(
				"*********************** Singleton Version-2 MultiThread Environment **********************************");
		Thread t1 = new Thread(() -> {
			SingletonClassV2 sv23 = SingletonClassV2.getInstance();
			sv23.setString("Hi");
			System.out.println(" 3 - t1 " + sv23.hashCode());
			System.out.println(" 3 - t1 " + sv23.getString());
		});

		Thread t2 = new Thread(() -> {
			SingletonClassV2 sv24 = SingletonClassV2.getInstance();
			System.out.println(" 3 - t2 " + sv24.hashCode());
			System.out.println(" 3 - t2 " + sv24.getString());
		});

		t1.start();
		t2.start();

		System.out.println(
				"*********************** Singleton Version-2 Single threaded **********************************");

		SingletonClassV2 sv21 = SingletonClassV2.getInstance();
		SingletonClassV2 sv22 = SingletonClassV2.getInstance();
		System.out.println(" 2 - " + sv21.hashCode());
		System.out.println(" 2 - " + sv22.hashCode());

		sv21.setString("Hello");
		System.out.println(" 2 - " + sv21.getString());
		System.out.println(" 2 - " + sv22.getString());

		System.out.println("*********************** Singleton Enum Multi threaded **********************************");

		Thread t3 = new Thread(() -> {
			SingletonEnum enum1 = SingletonEnum.INSTANCE;
			enum1.setValue("World");
			System.out.println("Enum 1 - " + enum1.getValue());
			System.out.println("Enum Hash 1 - " + enum1.hashCode());
		});

		Thread t4 = new Thread(() -> {
			SingletonEnum enum2 = SingletonEnum.INSTANCE;
			System.out.println("Enum 2 - " + enum2.getValue());
			System.out.println("Enum Hash 2 - " + enum2.hashCode());
		});

		t3.start();
		t4.start();

		System.out.println("*********************** Singleton Test End **********************************");
	}

}
