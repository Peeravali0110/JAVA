class A{

	public void m1(){

	System.out.println("class A m1-method");

}
	public void m2(){

	System.out.println("class A m2-method");

       }
}
class B extends A{

public void m3(){

System.out.println("class B m3-method");
}
}

class Test{
	public static void main(String[] args)
	{
	   B b1= new B();
	   b1.m3();
	   b1.m2();
	   b1.m1();
		
	}

}
