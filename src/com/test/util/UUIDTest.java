package com.test.util;

import java.util.UUID;

public class UUIDTest {

	public static void main(String[] args) {
		System.out.println(String.valueOf(UUID.randomUUID()).replaceAll("-", ""));
	}
}
