interface Aryan{
	 void insertrecords();
	 void  setdata();	
}
class Testimpl implements Aryan{

public void insertrecords(){
	System.out.println("insert data successfully");	
}	

    public void setdata(){
	
	System.out.println("setdata succesfully");
}
}
 public class Test2{
 
 public static void main(String[] args)
{
	Testimpl a1=new Testimpl();	
	a1.insertrecords();
	a1.setdata();
	 
}
}
	
	

	
	
	
	
	