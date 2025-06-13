package basic.practice;
import java.util.*;
import java.util.stream.Collectors;

class transaction{
    private String type; 
    private double amount;
    transaction(String type,double amount){
        this.type=type;
        this.amount=amount;
    }
    public String toString(){
        return type + " " +amount;
    }
}

class account{
    private String name;
    private int accountnumber;
    private double balance;

    public account(String name,int accountnumber,double balance)
    {
        this.name=name;
        this.accountnumber=accountnumber;
        this.balance=balance;
    }
    ArrayList<transaction>transaction=new ArrayList<>();
    public void deposite(double amount){
        if(amount<0){
            System.out.println("invalid amount");
        }
        else{
            this.balance=this.balance+amount;
            transaction.add(new transaction("deposited",amount));
        }
    }
    public void withdraw(double amount){
        if(amount>balance || amount==0){
            System.out.println("not enough balance");
        }
        else{
            this.balance=this.balance-amount;
            transaction.add(new transaction("withdrawl",amount));
        }
    }
    public void checkbalance(){
        if(balance==0){
            System.err.println("your account is empty");
        }else
        System.out.println("current balance is "+ balance);
    }
    
    public void history(){
        if(transaction.isEmpty()){
            System.out.println("no transaction done before");
        }
        else{
            for(transaction t : transaction){
                System.out.println();
            }
        }
    }

}

public class p1 {

    public static void main(String[] args) {
        account a1=new account(null, 0, 0);
        System.out.println("Enter \n 1.Deposite \n 2.withdrawl \n 3. checkb balance \n 4. history");
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        switch(a){
            case 1: a1.deposite(a);
            case 2: a1.withdraw(a);
            case 3: a1.checkbalance();
            case 4: a1.history();
        }
        
    }
}
