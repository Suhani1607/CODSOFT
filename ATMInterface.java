import java.util.Scanner;

class BankAcc{
    private double balance;

    // initiallizing constructor
    public BankAcc(double initialBalance){
        if(initialBalance>0){
        this.balance=initialBalance;}
        else{
            System.out.println("Enter the correct Amount...Initial Balance cannot be empty Set it to 0");
        }
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Successfully Deposited $ "+amount);
        }
        else{
            System.out.println("Amount must be positive.......");
        }
    }


    public void withdraw(double amount){
        if(amount>0){
            if(amount<balance){
                balance-=amount;
                System.out.println("Successfully Withdrawn $ "+amount);

            }
            else{
                System.out.println("Insufficient balance...Enter the valid amount!");
            }

        }
        else{
            System.out.println("Amount must be positive!!");
        }
    }

    public double getBalance(){
        return balance;
    }

}



class Atm{
    private BankAcc account;
    private Scanner scan;
    

    //constructor

    public Atm(BankAcc account){
        this.account=account;
        this.scan=new Scanner(System.in);

    }

    public void start(){
        int choice;
        do{
            System.out.println("-----------------------------------------ATM Menu---------------------------------------------");
            System.out.println("1.Check Balance ");
            System.out.println("2. Deposit ");
            System.out.println("Withdraw ");
            System.out.println("4. Exit ");
            System.out.print("Choose an option ");


            while(!scan.hasNextInt()){
                System.out.println("Invalid Number.....Enter the valid number!!");
                scan.next();
            }

            choice=scan.nextInt();
            switch(choice){
                case 1:
                getBalance();
                break;

                case 2:
                deposit();
                break;

                case 3:
                withdraw();
                break;

                case 4:
                System.out.println("Thank you for using Atm......GoodBye!!   ");


                default:
                System.out.println("Invalid choice.....choose correct option!!!");
            }
        }while(choice != 4);
    }


    public void getBalance(){
        System.out.println("Your Current Balance is $ "+account.getBalance());
    }


    public void deposit(){
        System.out.print("Enter the amount to Deposit $  ");
        while(!scan.hasNextDouble()){
            System.out.println("Invalid Input------Please enter the valid number!!! ");
            scan.next();
        }
        double amount=scan.nextDouble();
        account.deposit(amount);
    }



    public void withdraw(){
        System.out.print("Enter the amount to withdraw $ ");
        while(!scan.hasNextDouble()){
            System.out.println("Invalid Input----Enter the correct number!!");
            scan.next();
        }
        double amount=scan.nextDouble();
        account.withdraw(amount);
    }
}


public class ATMInterface {

    public static void main(String[] args){
        BankAcc account=new BankAcc(5000);
        Atm atm=new Atm(account);
        atm.start();

        
    }
    
}
