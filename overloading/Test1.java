
//OVER LOADING : Over Loading is defined as the method names is same and and the arguments are differnt.is called as the method over loading


class Aryan{
public void m1(int a){
	
	System.out.println("good morning");
}
public void m1( ){
	System.out.println("good evening");
}		
}
class Test{

public static void main(String[] args){

Aryan a1=new Aryan();
a1.m1(10);
a1.m1();


}	
	
	
	
}
