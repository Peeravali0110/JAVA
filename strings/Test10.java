class Complete{
int score=50;
}
class complete1 extends Complete{
int score=20;

public static void main(String[] args){
Complete obj=new complete1();
System.out.println(obj.score);
}
}