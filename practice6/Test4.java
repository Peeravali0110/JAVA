// There are the three types of the variables known as the 1.instance variables  2.static varialble 3.local varialble


class Test{
	int a=10;
	int b=20;
	int c; // 0 default value=0
	
	// these variables are the instance variables we can access these variables using object
	
	static int d=100;
	static int e=200;
	
	// these variables is known as sttaic varialbles we can access directly/using object/using class name
	
	

public static void main(String[] args){
	
	     int f=1;  // this variable is a local variable we can access directly 
	
	Test t1=new Test();
	 System.out.println(t1.a);
	 System.out.println(t1.b);
	 System.out.println(t1.c);
	 System.out.println(d);
	 System.out.println(e);
	 System.out.println(t1.e);
	 System.out.println(t1.e);
	 System.out.println(Test.e);
	 System.out.println(Test.e);
	 System.out.println(f);
	
	






}




}
