package com.iot.equalitycheck;

public class EqChckMainClas {

	public static void main(String[] args) {
		
		/*
		 * To check the equality of objects, we can use both equals method and == operator
		 * 
		 * By default, 2 objects are equal only if both references are same unless we override equals method
		 * 
		 */
		
		Sport cricket = new Sport("Cricket", 11);
		
		Sport cricket1 = new Sport("Cricket", 11);
		
		Sport baseball = cricket;
		
		Sport soccer = new Sport("Soccer", 11);
		
		Sport badminton = new Sport("Badminton", 2);
		
		System.out.println(cricket.hashCode());
		
		System.out.println(cricket1.hashCode());
		
		System.out.println(baseball.hashCode());
		
		System.out.println(soccer.hashCode());
		
		System.out.println(badminton.hashCode());
		
		if(cricket.equals(baseball))
		{
			System.out.println("Cricket is equal to Baseball");
		}
		if(cricket.equals(cricket1))
		{
			System.out.println("Cricket is equal to Cricket1");
		}
		
		if(cricket.equals(soccer))
		{
			System.out.println("Cricket is equal to Soccer");
		}
		if(cricket.equals(badminton))
		{
			System.out.println("Cricket is equal to Badminton");
		}
		
		
		if(cricket == baseball)
		{
			System.out.println("**Cricket is equal to Baseball");
		}
		if(cricket == cricket1)
		{
			System.out.println("**Cricket is equal to Cricket1");
		}
		
		if(cricket == soccer )
		{
			System.out.println("**Cricket is equal to Soccer");
		}
		if(cricket == badminton)
		{
			System.out.println("**Cricket is equal to Badminton");
		}
			
	}

}
