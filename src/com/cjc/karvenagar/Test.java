package com.cjc.karvenagar;

public class Test {
	
	
	public static void main(String[] args) {
		
		Base b=new Base();
		b.show();
		
		Derived d=new Derived();
		d.show();
		
		Base b1=new Derived();
		b1.show();
		
		
	}

}
