package com.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class SimpleAnnotations {

	@BeforeSuite
	private void propertysettings() {
		System.out.println("propertyset");
	}
	@BeforeTest
	private void browserlaunch() {
		System.out.println("browser launch");
	}
	@BeforeClass
	private void urllaunch() {
		System.out.println("url launch");
	}
	@BeforeMethod
	private void login() {
		System.out.println("login done");
	}
	@Test
	private void wemen() {
		System.out.println("wemen");
	}
	@Test @Ignore
	private void men() {
		System.out.println("men");
	}
	
	@AfterMethod
	private void logout() {
		System.out.println("logout done");
	}
	@AfterClass
	private void urlclose() {
		System.out.println("url closed");
	}
	@AfterTest
	private void browserclose() {
		System.out.println("browser closed");
	}
	@AfterSuite
	private void browserterminate() {
		System.out.println("browser terminate");
	}
}
