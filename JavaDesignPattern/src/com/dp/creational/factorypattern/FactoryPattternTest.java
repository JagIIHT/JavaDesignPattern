package com.dp.creational.factorypattern;

import java.util.Scanner;

public class FactoryPattternTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide type of File Reader");
		String type = sc.nextLine();
		FileReaderFactory factory = new FileReaderFactory();
		FileReader reader = factory.getReader(type);
		reader.read();
		sc.close();
		
	}

}
