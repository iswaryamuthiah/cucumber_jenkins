package com.pb.cucumberdemo.pageobjs;

import com.pb.cucumberdemo.base.BaseFunctions;

public class Login_Objs extends BaseFunctions{

	public Login_Objs launchURL()
	{
		driver.get("https://www.facebook.com");
		return this;
	}
	
}
