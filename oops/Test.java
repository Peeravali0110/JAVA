class Parent{
 void m1(){
System.out.println("good morning");
}
void m2(){
System.out.println("good afternoon");	
}
}
class Child extends Parent{
 void m3(){	
System.out.println("good evening");	
}	
}
class Test{
public static void main(String[] args)
{

Child c1=new Child();
 c1.m3();
 c1.m1();
 c1.m2(); 
}
}