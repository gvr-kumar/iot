package com.iot.equalitycheck;

public class EqlChclMainClas2 {

	/*To check primitive data types or primitive wrappers equality, we use == operator  
	 * 
	 * To check objects equality we use equals method and if needed we override the equals method.
	 * 
	 * where as comparator and comparison we use if we want to sort objects.
	 * 
	 * rules when overriding equals method when checking equality of objects: RSTC rules
	 * 
	 * 1) Reflexive (x.equals(x)) 2) Symmetry: (x.equals(y) and y.equals(x)) 3) Transitive: a.equals(b.equals(c)) then c.euqals(a) 4) Consistent 5) Non null comparison
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		//Primitives comparison
		
		int a = 5;
		int b = 10;
		Integer c = 20;
		
		if(a==b)
		{
			System.out.println("a==b");
		}
		else
		{
			System.out.println("a!=b");
		}
		if(a==c)
		{
			System.out.println("a==c");
		}
		else
		{
			System.out.println("a!=c");
		}
		
		//Objects comparison using equals operator
		
		TestClass1 tstClas1 = new TestClass1("Kishore", "Madina");
		
		TestClass1 tstClas2 = new TestClass1("Kishore", "Madina");
		
		//== operator always checks the equality of both objects references.
		
		System.out.println("tstClas1 object reference: "+ tstClas1);
		System.out.println("tstClas2 object reference: "+ tstClas2);
		
		if(tstClas1 == tstClas2)
		{
			System.out.println("tstClas1 and tstClas2 are equal using the == operator");
		}
		else
		{
			System.out.println("tstClas1 and tstClas2 are NOT equal using the == operator");
		}
		//until we override (define) the equals method, equals method always checks the equality of both objects references.
		
		if(tstClas1.equals(tstClas2)) 
		{
			System.out.println("tstClas1 and tstClas2 are equal using the equals method");
		}
		else
		{
			System.out.println("tstClas1 and tstClas2 are NOT equal using the equals method");
		}

	}

}
