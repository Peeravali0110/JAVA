// StringBuffer : mutable means we can update the String.it is a predefined class


class Test{
public static void main(String[] args)
{

StringBuffer sb=new StringBuffer("RAHUL");
System.out.println(sb);
sb.append("GANDHI");
System.out.println(sb);
System.out.println(sb.length());
sb.insert(5,"sir");
System.out.println(sb);
sb.replace(5,8 ,"PM");
System.out.println(sb);
sb.delete(5,7);
System.out.println(sb);
//sb.reverse();
//System.out.println(sb);
System.out.println(sb.charAt(1));
System.out.println(sb.indexOf("R"));
System.out.println(sb.substring(5));







}





}