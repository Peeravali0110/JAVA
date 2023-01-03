class Hello{	
public void m1(){
System.out.println("hello good morning");
}
public void m1(int a ,int b){

System.out.println("good afternoon");
}
public void m1(String b){

System.out.println("good evening");
}
public void m1(double db){

System.out.println("good night");

}
public void m1(float f){

System.out.println("Happy morning Aryan");

}
}
class Test{

public static void main(String[] args){
Hello a1=new Hello();
a1.m1();
a1.m1(10,20);
a1.m1(null);
a1.m1(200.00);
a1.m1(20.000f);
}
}


// this is the method overloading 	