package com.iot.utils;

public class StaticUtils {
	static int static_var = 10;
	int nonStatic_var = 20;

	static int staticMethod()
	{
		return (2 * static_var);
	}
	
	int nonStaticMethod()
	{
		return (2 * nonStatic_var);
	}
	
	int nonStaticMethod_UsingStaticVar()
	{
		return (2 * static_var);
	}
}
