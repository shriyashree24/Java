class Account{
    public String accNo;
    public String name;
    public String address;
    public String PhoneNO;
    public String Dob;
    public long balance;

public Account(String acc,String Name,String add,String phNo,String DOB,long bal){
    accNo=acc;
    name=Name;
    address=add;
    PhoneNO=phNo;
    Dob=DOB;
    balance=bal;


}
public String  getAccNo(){return accNo;}
public String getName(){return name;}
public String  getAddress(){return address;}
public String  getPhno(){return PhoneNO;}
public String  getDob(){return Dob;}
public long  getBalance(){return balance;}

public void setDob(String add){
    address=add;

}
public void setphNo(String phNo){
    PhoneNO=phNo;
}
public static void main(String args[]){
    SavingsAccount savingsAcc = new SavingsAccount("1234567890", "Shriya", "123 cuttack", "1234567890", "24/08/2003", 1000);
            System.out.println("Account Details:");
            System.out.println("Account Number: " + savingsAcc.getAccNo());
            System.out.println("Name: " + savingsAcc.getName());
            System.out.println("Address: " + savingsAcc.getAddress());
            System.out.println("Phone Number: " + savingsAcc.getPhno());
            System.out.println("Date of Birth: " + savingsAcc.getDob());
            System.out.println("Balance: " + savingsAcc.getBalance());
            
            savingsAcc.deposit(500);
            System.out.println("\nAfter deposit of 500:");
            System.out.println("New Balance: " +savingsAcc.getBalance());
            
            savingsAcc.withdraw(200);
            System.out.println("\nAfter withdrawal of 200:");
            System.out.println("New Balance: " +savingsAcc.getBalance());
            
            LoanAccount loanAcc = new LoanAccount("0987654321", "Amit mohanty", "456 sailashree vihar", "0987654321", "21/04/2003", 5000);
            System.out.println("\nLoan Account Details:");
            System.out.println("Account Number: " + loanAcc.getAccNo());
            System.out.println("Name: " +loanAcc.getName());
            System.out.println("Address: " +loanAcc.getAddress());
            System.out.println("Phone Number: " +loanAcc.getPhno());
            System.out.println("Date of Birth: " +loanAcc.getDob());
            System.out.println("Balance: " +loanAcc.getBalance());
            
            loanAcc.payEMI(1000);
            System.out.println("\nAfter paying EMI of 1000:");
            System.out.println("New Balance: " + loanAcc.getBalance());
            
            loanAcc.repay(5000);
            System.out.println("\nAfter full repayment:");
            System.out.println("New Balance: " + loanAcc.getBalance());
        }
    }
        
class SavingsAccount extends Account {
    public SavingsAccount(String num, String name, String address, String phone, String dob, long balance) {
        super(num, name, address, phone, dob, balance);
    }


    public void deposit(long amt){
        balance+=amt;
    }
    public void withdraw(long amt){
        balance-=amt;
    }
}
class LoanAccount extends Account{
public LoanAccount(String num, String name, String address, String phone, String dob, long balance) {
    super(num, name, address, phone, dob, balance);
}

    public void payEMI(long amt)
    {
        balance-=amt;
    }
    public void repay(long amt)
    {
        if(balance==amt)
            balance=0;
    }
}

    