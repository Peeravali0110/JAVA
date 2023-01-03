class Hello{

public void m1(){

System.out.println("m1- first-method ");
}
public void m1(int a){
	
	System.out.println("m1- second-method");
	
}
public void m1(String s){
	
	System.out.println("m1-third-method");
	
}	
}
class Test{
	
public static void main(String[] args){
		
	Hello h1=new Hello();
	h1.m1(10);
	h1.m1();
	h1.m1("aryan");
	
		
		
}
	
	
}