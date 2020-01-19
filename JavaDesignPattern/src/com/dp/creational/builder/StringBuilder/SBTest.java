package com.dp.creational.builder.StringBuilder;

public class SBTest {

	public static void main(String[] args) {

		SB sb = SB.getInstance("Numbers", ",", ".");
		System.out.println(sb.add("1").add("2").add("3").toString());
	}

}
