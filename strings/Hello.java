class Parent{
public void m1(){
System.out.println("Hello pavan kumar");
}
}
class child extends Parent{

public void m2(){

System.out.println("good morning");

}
}
class Test{
public static void main(String[] args){
     child o1= new child();
	 o1.m1();
	 o1.m2();		
}		
}	
