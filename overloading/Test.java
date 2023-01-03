class Parent{

public void m1(){
System.out.println("parent class m1-method");
}
public void m2(){
System.out.println("parent class m2-method");
}
}
class Child extends Parent{

public void m3(){

System.out.println("child-class m3-method");

}
public void m4(){
System.out.println("child class m4-method");
}
}
class Test{

public static void main(String[] args){

  Parent P1= new Parent();
  P1.m1();
  P1.m2();
  //P1.m3();
  //P1.m4();
  Child C1=new Child();
  C1.m1();
  C1.m2();
  C1.m3();
  C1.m4();
  Parent P2=new Child();
  P2.m1();
  P2.m2();
  
 /*Child C2=new Parent(); // Parent cannot be converted to child
  C2.m1();
  C2.m2();
  C2.m3();
  C2.m4();*/
 



}

}