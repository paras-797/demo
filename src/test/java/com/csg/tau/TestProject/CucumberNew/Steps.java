package com.csg.tau.TestProject.CucumberNew;
import cucumber.annotation.en.*;
public class Steps {

	@Given("^everything works fine$")
	public void testFeature(){
		System.out.println("test successful");
	}
}
