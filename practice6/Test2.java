class Test{

public static void main(String[] args){

String[] names={"aryan","peera","syed","rn"};

//System.out.println(names);


//using for loop 

for(int i=0;i<=names.length-1;i=i+1){
	
	System.out.println(names[i]);
	
	
}


// using while loop 


int i=0;
while(i<=names.length-1){
	
	
System.out.println(names[i]);

i=i+1;	
	
}


// using for each loop 



for(String   Aryan :names){
	
	System.out.println(Aryan);
	
}











}





}