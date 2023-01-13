// String : Sequence of a characters it is a immutable means does not change any value i.e immutable
// StringBuffer : it is also a string but it is a mutable which means we can modify the value using methods it is a synchronized.
// StringBuilder : it is alos a string same as StringBuffer which is mutable we can modify the value using methods but it is not synchronized.


class Test{
public static void main(String[] args)
{

String name1="Aryan";

System.out.println(name1);
name1.concat("syed");
System.out.println(name1);

String name2=new String("peera vali");

System.out.println(name2);
name2.concat("syed");
System.out.println(name2);
System.out.println(name2.lenght());

StringBuffer name3=new StringBuffer("Azma");
name3.append("shaik");

System.out.println(name3);

StringBuilder name4=new StringBuilder("Ayyat");
name4.append("SHAIK");
System.out.println(name4);








}







}