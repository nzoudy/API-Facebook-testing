package com.zoudys;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.User;

public class Main {

	public static void main(String[] args) {

		String accessToken = "EAACEdEose0cBAGfz7NqKN4tk0v6knqGvjFUpokBnmAKEcWDFouQZB0Nnf855EMZCTOkW7DZBJ3l5YiqUGECr1bcOYgs8NzzwPHkxbRrCJ3fmd4wUam74oxgAWzAXwD0qWgbtj7OjZAGBgsOZBuv17gjZBgilrtgs83ZBDXVedvxnAZDZD";
		
		FacebookClient fbClient = new DefaultFacebookClient(accessToken);
		
		// first parameter is an endpoint, "me"
		// we can do me/feed from graph explorer to fetch all data 
		User me = fbClient.fetchObject("me", User.class);
		
		System.out.println("Je suis : "+me.getName());
		System.out.println("-------------");
		System.out.println("Je suis né le : "+me.getBirthday());
		System.out.println("-------------");
		System.out.println("Ma langue principale est : "+me.getLanguages().get(0).getName());
	}

}
