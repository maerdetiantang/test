package com.test.util;

public class TestRegex {

	public static void main(String[] args) {
		String id = "12345678901234567X";
		System.out.println(id.matches("^(\\d{15}$|^\\d{18}$|^\\d{17}(\\d|X|x))$"));
	}
}
