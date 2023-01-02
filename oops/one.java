 class Parent{
 public void m1(){
System.out.println("parent class m1-method");		
}
 public void m2(){
System.out.println("parent class m2-method");	
}
}
 class Child extends Parent {
	
 public void m3(){
System.out.println("child class m3 method");
}		
}

class one{	
public static void main(String[] args){
Child c1=new Child();
 c1.m1();
 c1.m2();	
 c1.m3(); 
}
}		
