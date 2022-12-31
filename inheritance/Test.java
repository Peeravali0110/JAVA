class Parent{

 public void m1(){
  
  System.out.println("good morning");
 
 
 }
 public void m2(){
 
 System.out.println("good afternoon");
 
 }



}
class child extends Parent{


public void  m3 (){
	
	System.out.println("good night");
}



}
class Test{
public static void main(String[] args)
{

 child c1=new child();
 c1.m3();
 c1.m1();
 c1.m2();




}	
	
	
	
	
	
}	
	
	

