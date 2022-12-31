interface TestDao{
public abstract void insertRecords();
void setData();

}
class Aryan implements TestDao{
     public void insertRecords(){
         System.out.println("Successfully inserted Data");
     }
     public void setData(){
         System.out.println("Successfully Setting Data");
     }
} 
public class Test3{
public static void main(String[] args){
    Aryan a = new Aryan();
    a.insertRecords();
    a.setData();
}
}