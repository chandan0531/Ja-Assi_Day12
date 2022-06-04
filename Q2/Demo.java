package com.Assi.Q2;

import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Demo {
	
	public boolean validate(String name, String mobileNum, String aadharCard) {
		
		if(Pattern.matches("[6789]{1}[0-9]{9}", mobileNum) && Pattern.matches("[a-zA-Z]{7}",name )
				&& Pattern.matches("[6789]{1}[0-9]{11}", aadharCard))
		{
			System.out.println("Name : " + name);
			System.out.println("Mobile : " + mobileNum);
			System.out.println("Aadhar Card : " + aadharCard);
			return true;
		}
		else
		{
			System.out.println("Invaild details");
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		Citizen c = new Citizen();
		c.setMobileNumber("8767270605");
		c.setAadharNumber("898234567678");
		c.setName("Chandan");
		
		if(c.getMobileNumber().length()==10 && c.getAadharNumber().length()==12
				&& c.getName().length()>=3 && c.getName().length()<=8)
		{
			d1.validate(c.getName(),c.getMobileNumber(),c.getAadharNumber());
		}
		else
		{
			System.out.println("Invaild details");
		}

		
	}
}	
