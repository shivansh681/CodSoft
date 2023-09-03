
import java.util.*;
class Atm
{
    float Balance;
    int PIN = 1234;

    public void checkpin()
    { 
        System.out.println("enter your pin");
        Scanner sc = new Scanner(System.in);
        int entered_pin = sc.nextInt();
        if(entered_pin==PIN)
        {
            menu();
        }
        else{
            System.out.println("enter a valid pin");
            checkpin();
            

        }
    }
    public void menu()
    {
        System.out.println("Enter your choice");
        System.out.println("1.check A/C balance");
        System.out.println("2.Withdraw money");
        System.out.println("3.Deposit money");
        System.out.println("4.Exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt == 1)
        {
            checkBalance();
        }
        else if(opt == 2)
        {
            withdrawMoney();
        }
        else if(opt == 3)
        {
            depositMoney();
        }
        else if(opt == 4)
        {
            return;
        }
        else {
            System.out.println("enter a valid choice");
        }
    }
    
    public void checkBalance()
    {
        System.out.println("Balance "+ Balance);
        menu();
    }
    public void withdrawMoney()
    {
        System.out.println("enter an amount to withdraw");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount>Balance)
        {
            System.out.println("insufficient Balance");
        }
        else{
            Balance = Balance - amount;
            System.out.println("money withdrawn successfully");
        }
        menu();
    }
    public void depositMoney()
        {
            System.out.println("enter the amount");
             Scanner sc = new Scanner(System.in);
            float amount = sc.nextFloat();
            Balance = Balance + amount;
            System.out.println("Money deposited successfully");
            menu();



        }
       
    

}
public class Main{
    public static void main(String[] args)
    {
        Atm obj = new Atm();
        obj.checkpin();
    }
}