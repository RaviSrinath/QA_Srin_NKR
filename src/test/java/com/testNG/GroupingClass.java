package com.testNG;

import org.testng.annotations.Test;

public class GroupingClass {
	@Test(groups = "Fruits")
	private void pineapple() {
		System.out.println("pineapple");
	}
	@Test(groups = "Fruits")
	private void watermelon() {
		System.out.println("watermelon");
	}
	@Test(groups = "Fruits")
	private void orange() {
		System.out.println("orange");
	}
	@Test(groups = "Tiffen")
	private void pongal() {
		System.out.println("pongal");
	}
	@Test(groups = "Tiffen")
	private void idly() {
		System.out.println("idly");
	}
	@Test(groups = "Tiffen")
	private void poori() {
		System.out.println("poori");
	}
	
}
