package Wrapper;

public class WrapperMain {

	public static void main(String[] args) {
		
		//===============================Autoboxing================================
		//Primitive to wrapper
		//Converting int to Integer
		
		int v = 20;
		
		Integer ig = Integer.valueOf(v);
		Integer ij = v;
		
		System.out.println(v+" "+ig+" "+ij);  
		
		//================================Unboxing===================================
		//Wrapper to Primitive  
		//Unboxing example of Integer to int  
		//Converting Integer to int  
		
		Integer a = new Integer (3);   
		int i=a.intValue();//converting Integer to int explicitly  
		int j=a;//unboxing, now compiler will write a.intValue() internally    
		    
		System.out.println(a+" "+i+" "+j);    

	}

}
