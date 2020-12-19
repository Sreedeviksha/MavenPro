package com.automation.practice;

public class PojoA {

	public static void main(String[] args) {

		Pojo p = new Pojo();

		p.setJ(100);
		int j = p.getJ();
		System.out.println(j);
	}
}
