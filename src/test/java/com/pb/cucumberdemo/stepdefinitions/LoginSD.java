package com.pb.cucumberdemo.stepdefinitions;

import com.pb.cucumberdemo.pageobjs.Login_Objs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;


public class LoginSD  {

	Login_Objs login=new Login_Objs();

@Given("^user is launching the application$")
public void user_is_launching_the_application() {
    login.launchURL();
}

@And("^user enters credentials '(.*)' and '(.*)'$")
public void enterCredentials(String username, String password)
{
	System.out.println(username);
	System.out.println("This is just for validation");
	
}
	
}
