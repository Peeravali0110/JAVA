
//constructor :-  Constructor is a special method which intilize the object value.



class Emp{
	int Emp_id;
	String Emp_name;

 Emp(int id, String name){

 this.Emp_id=id;
 this.Emp_name=name;
}	 	
}
class Test{
	
public static void main(String[] args){
	
  Emp e1=new Emp(101,"Aryan");
  System.out.println(e1.Emp_id +e1.Emp_name);
	
}	
}
