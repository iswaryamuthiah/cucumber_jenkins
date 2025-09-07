package com.pb.cucumberdemo.stepdefinitions;

import com.pb.cucumberdemo.base.BaseFunctions;

import io.cucumber.java.After;
import io.cucumber.java.Before;




public class RawSD extends BaseFunctions
{
	BaseFunctions base = new BaseFunctions();
	
	@Before
	public void beforeScenario()
	{
		BaseFunctions.Initialize();
		base.openBrowser();		
	}
	
	@After
	public void afterScenario()
	{
//		driver.close();
	}

}
