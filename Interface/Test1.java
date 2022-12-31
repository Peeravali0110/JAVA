interface TestInterface{
    public static final int x = 200;
}
public class Test1 implements TestInterface{

public static void main(String[] args){
   Test1 t = new Test1();
    //x = 300;
   System.out.println(t.x);
   System.out.println(x);
   System.out.println(Test1.x);
}
}