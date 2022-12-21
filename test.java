class Test {
  
  int x=10;
  int y=20;
  static int z=100;

public static void main(String args[])
{
  Test t1= new Test();
  System.out.println(t1.x);
  System.out.println(t1.y);
  System.out.println(t1.z);
  System.out.println(Test.z);
  
  
  System.out.println(t1.x);

 }


}

