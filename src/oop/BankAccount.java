package oop;

public class BankAccount {
    //Define Variables
    String accountNumber;
    
    //static >> belongs to the CLASS not the object instance
    //final >> constant (often static final)
    static final String routingNumber = "013546";
    
    //Instance Variable
    String name;
    String ssn;
    String accontType;
    double balance;
    
    //Constructor definition: unique methods
    //1. They are used to define / setup / initialize properties of an object
    //2. Constructors are IMPLICITLY called upon INSTANTIATION
    //3. The same name as the class itself 
    //4. Copnstructors have NO return type
    BankAccount(){
        System.out.println("NEW ACCOUNT CREATED");
    }
    //Overloading: call some method name with different arguments
    BankAccount(String accountType){
        System.out.println("NEW ACCOUNT: " + accountType);
    }
    BankAccount(String accountType, double initDeposit){
        //iniDeposit, accountType, Msg are all local variables
         System.out.println("NEW ACCOUNT: " + accountType);
         System.out.println("INITAL DEPOSIT OF: $" + initDeposit);
         String Msg = null;
         if(initDeposit < 1000){
             Msg = "ERROR: Minimum deposit must be at least $1.000";
         }else{
             Msg = "Thanks for your initial deposit of: $" + initDeposit;
         }
         System.out.println(Msg);
         balance = balance + initDeposit;
    }
    //Define methods
    public void deposit(double amount){
        balance = balance + amount;
        showActivity("Deposit");
    }
    void withdraw(double amount){
        balance = balance - amount;
        showActivity("Withdraw");
    }
    
    //Private: can only be called form within the class
    private void showActivity(String activity){
        System.out.println("YOUR RECENT TRANSACTION: " + activity);
        System.out.println("YOUR NEW BALANCE IS: $" + balance);
    }
    
    void checkBalance(){
         System.out.println("Balance: " + balance);
    }
    void getStatus(){

    }
    @Override
    public String toString(){
         return "[ " + name + ", ACCOUNT #: " + accountNumber + ", ROUTING #: " + routingNumber + " BALANCE: $" + balance +" ]";
    }
}
