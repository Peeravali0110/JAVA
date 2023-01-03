
// constructor 

class Emp{
	
int eid;
String ename;

Emp(int id ,String name){
	
	this.eid=id;
	this.ename=name;
 
 
 
 
}
}
class Test{

public static void main(String[] args)
{

Emp e1=new Emp(101,"Aryan");
Emp e2=new Emp(102,"azma");
Emp e3=new Emp(103,"ayyat");
System.out.println(e1.eid +  e1.ename);
System.out.println(e2.eid +  e2.ename);
System.out.println(e3.eid +  e3.ename);



}


}