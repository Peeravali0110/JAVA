   abstract class Bank{

 public abstract void cal_bal();
}
class Account extends Bank{
	private int acc_id;    // if there is a private varailable then we can access outside the class using setters and getters method
	private String acc_name;
	private double acc_amount;
	
	public int getAcc_Id() {
		return acc_Id;
	}

	public void setAcc_Id(int acc_Id) {
		this.acc_Id = acc_Id;
	}

	public String getAcc_Name() {
		return acc_Name;
	}

	public void setAcc_Name(String acc_Name) {
		this.acc_Name = acc_Name;
	}

	public double getAcc_Amount() {
		return acc_Amount;
	}

	public void setAcc_Amount(double acc_Amount) {
		this.acc_Amount = acc_Amount;
	}
	
	public void cal_bal(){}	
}
public class SA extends Account{
	private double min_Bal;

	public double getMin_Bal() {
		return min_Bal;
	}

	public void setMin_Bal(double min_Bal) {
		this.min_Bal = min_Bal;
	}
	public void cal_Bal() {
	  double balance = getAcc_Amount();
	  balance = balance - getMin_Bal();
	  System.out.println(getAcc_Name()+":"+"Balance:"+balance);
	}
}
public class CA extends Account {
	private double min_Bal;

	public double getMin_Bal() {
		return min_Bal;
	}

	public void setMin_Bal(double min_Bal) {
		this.min_Bal = min_Bal;
	}
	public void cal_Bal() {
		  double balance = getAcc_Amount();
		  balance = balance - getMin_Bal();
		  System.out.println(getAcc_Name()+":"+"Balance:"+balance);
		}
}
public class oops {

	public static void main(String[] args) {
		SA a1=new SA();
		a1.setAcc_Id(101);
		a1.setAcc_Name("Rahul Gandhi");
		a1.setAcc_Amount(5000.00);
		a1.setMin_Bal(500.00);
		
		a1.cal_Bal();
		Account_Service.get_Account(a1);
		CA a2=new CA();
		a2.setAcc_Id(102);
		a2.setAcc_Name("Priyanka Gandhi");
		a2.setAcc_Amount(45000.00);
		a2.setMin_Bal(25000.00);
		a2.cal_Bal();
		Account_Service.get_Account(a2);
	}

}