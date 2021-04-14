package com.iot.annotations;

public class ChildClass extends BaseClass {

	@CustomOverride
	int a;

	/**
	 * If a class extends another class or has a parent class and if the parent
	 * class has constructor with arguments, then super method should be called in
	 * the child class constructor.
	 * 
	 * otherwise we have to introduce no-argument constructor in the base class.
	 * 
	 * meta annotations: annotation to create metadata of the annotation. There are
	 * 2 meta annotations
	 * 
	 * @retention, @target
	 * 
	 * i) @retention: retention specifies scope (source, compile, run-time) of the
	 * availability of this annotation
	 * 
	 * Constant values for retention annotation: 
	 * 
	 * RetentionPolicy.SOURCE: the scope of SOURCE is while writing the source code itself. 
	 * 
	 * For example, @override annotation's retention policy is only at source level, thats why we see @override annotation 
	 * only in the source file but not in the class file. 
	 * 
	 * RetentionPolicy.CLASS: the scope is during the build process. The CLASS retention policy scope is during the compile time. 
	 * 
	 * Compile time is between source & run time.
	 * 
	 * RetentionPolicy.RUNTIME: will be part of byte code and is available during program execution nothing runtime
	 * 
	 * For example, if an annotation's retention is RUNTIME, then its retention policy is class file. We don't see it any where else.
	 * 
	 * To create an annotation: syntax is : public @interface annotationName{}
	 * 
	 * 
	 * @Target: where to apply the annotation like method level, class level, package level, 
	 * instance variable level, method parameter level, class variable level
	 * 
	 *          ElementType.ANNOTATION_TYPE ElementType.CONSTRUCTOR
	 * 
	 *          ElementType.FIELD
	 * 
	 *          ElementType.LOCAL_VARIABLE
	 * 
	 *          ElementType.METHOD
	 * 
	 *          ElementType.PACKAGE
	 * 
	 *          ElementType.PARAMETER
	 * 
	 *          ElementType.TYPE
	 * 
	 *          ElementType.TYPE_PARAMETER
	 * 
	 *          ElementType.TYPE_US
	 */

	@SinglValAnnotation
	public ChildClass(int a) {
		super(5);
		this.a = a;
		System.out.println("Child Class argument constructor.");
	}
	
	

	/*
	 * Override annotation: if we want to override a method in child class that is
	 * also present in parent class then we use @override annotation
	 * 
	 * Override annotation is used to change the definition of the method but no to
	 * change the signature
	 * 
	 * If we try to change the signature of the method with Override annotation in base class or child class it throws an error
	 * 
	 * Any annotation is a place holder for meta data of the method or field or class or constructor nothing.
	 */

	@Override
	public int getSqr(int b) {
		int x = super.getSqr(b);
		return x;
	}
	
	@SinglValAnnotation(value1 = "xyz")
	public int getCube(int b) {
		int x = b * b * b;
		return x;
	}
	
	@MultValAnnotation
	public void mulValAnnMethod1()
	{
		System.out.println("Multiple value annotation method with no value");
	}
	
	@MultValAnnotation(value1 = "val1")
	public void mulValAnnMethod2()
	{
		System.out.println("Multiple value annotation method with value1");
	}

	@MultValAnnotation(value2 = "val2")
	public void mulValAnnMethod3()
	{
		System.out.println("Multiple value annotation method with value2");
	}
	
	@MultValAnnotation(value1 = "val1", value2 = "val2")
	public void mulValAnnMethod4()
	{
		System.out.println("Multiple value annotation method with both value1 and value2");
	}
}
