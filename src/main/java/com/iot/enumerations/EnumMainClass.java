package com.iot.enumerations;

public class EnumMainClass {

	public static void main(String[] args) {
		
		String arg = args[0];
		Gender gender = Gender.valueOf(arg);
		
		switch (gender) {
		case MALE:
			System.out.println("Gender is " + gender);
			break;
			
		case FEMALE:
			System.out.println("Gender is " + gender);
			break;
			
		case THIRD_GENDER:
			System.out.println("Gender is " + gender);
			break;

		default:
			break;
		}
	}

}
