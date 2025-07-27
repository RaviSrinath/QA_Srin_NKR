package com.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertClass {
	@Test
    private void softAssert() {
    	SoftAssert sa = new SoftAssert();
    	sa.assertEquals("Srinath", "srinath");
    	System.out.println("SoftAssert");
    	
    	
    }
@Test
  private void hardAssert() {
	Assert.assertEquals("Chennai", "Chennai");
	System.out.println("hardAssert");
}
}
