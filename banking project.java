import java.util.*;
class options{
	public int a;

	public void options1() {
		System.out.println("To perform money Transfer Enter option 1");
		System.out.println("To pay bills Enter option 2");
		System.out.println("To view account statement Enter option 3");
		System.out.println("To raise any complaints Enter option 4");
		System.out.println("To view profile details Enter option 5");
		System.out.println("To exit Enter option 6");
    }
}
class transfer{
	public void money_transfer() {
		System.out.println("Enter your account number:");
		Scanner s=new Scanner(System.in);
		long account_number=s.nextLong();
		System.out.println("Enter beneficiary bank name:");
		String bank_name=s.next();
		System.out.println("enter beneficiary account number:");
		long benificiary_number=s.nextLong();
		System.out.println("Enter beneficiary IFSC code:");
		String ifsc_code=s.next();
		System.out.println("amount to transfer:");
		int amount=s.nextInt();
		System.out.println("Congratulations your money is transfer sucessfully");
		System.out.println("enter option 7 to go to options;");
		System.out.println("enter 6 to exit");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a==7) {
			options obj=new options();
			obj.options1();
			core obj7=new core();
			obj7.helloo();
			}
		else if(a==6) {
			System.out.println("Thank you");
		}
	}
}
class bills{
	public void pay_bills() {
		System.out.println("Enter your mobile operator to pay bills:");
		Scanner ss=new Scanner(System.in);
		String mobile_operator=ss.next();
		System.out.println("Enter your mobile number:");
		long mobile_number=ss.nextLong();
		System.out.println("Enter amount:");
		int amount=ss.nextInt();
		System.out.println("Enter debit/credit card number:");
		long card_number=ss.nextLong();
		System.out.println("Enter your cvv number:");
		int cvv_number=ss.nextInt();
		System.out.println("Enter expiry date:");
		String date=ss.next();
		System.out.println("congratulations your bill payment sucesfull....");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter option 7 to go to options;");
		System.out.println("enter 6 to exit");
		
		int a=ss.nextInt();
		if(a==7) {
			options obj=new options();
			obj.options1();
			core obj6=new core();
			obj6.helloo();
		}
				else if(a==6) {
			System.out.println("Thank You");
		}
	}
}
class statement{
	public void bank_statements() {
		System.out.println("Enter account nuber:");
		Scanner sss=new Scanner(System.in);
		long ac_number=sss.nextLong();
		System.out.println("Account statement as on today:");
		System.out.println("account balance:20000INR");
		System.out.println("DATE          TRANSACTION          DEBIT/CREDIT          AMOUNT");
		System.out.println("12/10/23        Dmart paymet           debit              7000  ");
		System.out.println("19/10/23        irctc payment          debit              890   ");
		System.out.println("20/10/23        money received         credit             2000  ");
		System.out.println("22/10/23        BookMyShow payment     debit               500  ");
		System.out.println("enter option 7 to go to options;");
		System.out.println("enter 6 to exit");
		Scanner sc=new Scanner(System.in);
		int a=sss.nextInt();
		if(a==7) {
			options obj=new options();
			obj.options1();
			core op=new core();
			op.helloo();
		}
		else if(a==6) {
			System.out.println("Thank you");
		}
		
	}
}
class complait{
	public void complaints() {
		System.out.println("Enter your account number:");
		Scanner ss2=new Scanner(System.in);
		long ac_num=ss2.nextLong();
		System.out.println("Enter your complaint with your contact number;");
		String com=ss2.next();
		System.out.println("thankyou....one of our representative will contact you shortly regarding this complaint");
		System.out.println("enter option 7 to go to options;");
		System.out.println("enter 6 to exit");
		
		int a=ss2.nextInt();
		if(a==7) {
			options obj=new options();
			obj.options1();
			core objj=new core();
			objj.helloo();
		}
				else if(a==6) {
			System.out.println("Thank You");
		}
	}
}
class profile_details{
	public void profile() {
		System.out.println("Enter account number:");
		Scanner sca=new Scanner(System.in);
		long ac=sca.nextLong();
		System.out.println("Account holder name:Sanjay");
		System.out.println("Account holder account type:Savings account");
		System.out.println("Account holder Branch Address:Sanjeev reddy nagar");
		System.out.println("enter option 7 to go to options;");
		System.out.println("enter 6 to exit");
		int a=sca.nextInt();
		if(a==7) {
			options obj=new options();
			obj.options1();
			core oj=new core();
			oj.helloo();
		}
	  else if(a==6) {
			System.out.println("Thank You");
		}
	}
}
public class core_java_project {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Welcome to MyBank-your trusted place for Banking needs");
      Scanner sc=new Scanner(System.in);
      options obj=new options();
      obj.options1();
      core obje=new core();
      obje.helloo();
	}
}
      class core{
    	  public void helloo() {
        Scanner sc=new Scanner(System.in);
    	  transfer obj1=new transfer();
        int a=sc.nextInt();
      if(a==1) {
    	  obj1.money_transfer();
    	  }
      bills obj2=new bills();
       if(a==2) {
      obj2.pay_bills();
      }
      statement obj3=new statement();
      if(a==3) {
    	  obj3.bank_statements();
      }
      complait obj4=new complait();
        if(a==4) {
        	obj4.complaints();
        }
        profile_details obj5=new profile_details();
        if(a==5) {
        	obj5.profile();
        }
        if(a==6) {
        	System.out.println("thankyou");
        }
     }
}


