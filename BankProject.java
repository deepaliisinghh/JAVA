abstract class Bankaccount{
    private String accountholder;
    private double balance;

// public Bankaccount(String accountholder, double balance)
// {
//     this.accountholder = accountholder;
//     this.balance=balance;
// }
public double getBalance(){
    return balance;
}
public void setBalance(double balance){
    this.balance= balance;
}
public String getAccountholder(){
    return accountholder;
}
public void setAccountholder(String accountholder){
    this.accountholder = accountholder;
}
public Bankaccount(String accountholder, double balance){
    this.accountholder=accountholder;
    this.balance=balance;
}

public void deposit(double balance){
    if(balance>0){
        this.balance += balance;
    }
}
public void withdraw(double amount){
    if(amount<= balance)
    {
        balance -= amount;
    }
    else{
        System.out.println("Insufficient funds.");
    }
    
}
abstract public void withdraw1(double amount);
}
class Savingaccounts extends Bankaccount{
    public Savingaccounts(String accountholder, double balance){
        super(accountholder,balance);
    }
    @Override 
    public void withdraw1(double amount){
        if(amount <= getBalance())
        {
            setBalance(getBalance()-amount);
            System.out.println("Withdraw Successful");
        }
        else{
            System.out.println("Insufficient funds.");
        }
    }
}

public class BankProject {
    public static void main(String[] args){
      //  Bankaccount bankaccount= new Bankaccount( "Deepak", 10000);
        Bankaccount bankaccount=new Savingaccounts("Deepak", 100000);
        System.out.println("Saving accounts");
        System.out.println(bankaccount.getAccountholder());
        System.out.println(bankaccount.getBalance());
        bankaccount.deposit(1000);
        bankaccount.withdraw(5000);
        System.out.println(bankaccount.getBalance());

    }
    
}

