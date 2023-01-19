class Test{

int t_a, t_b;

Test(int a, int b){


t_a=a;

t_b=b;
}

public static void main(String args[]){

Test test = new Test();
 System.out.println(test.t_a+" "+test.t_b);
}
}