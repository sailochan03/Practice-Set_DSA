/*Create a " BankAccount " class with a constructor that takes in the account number,
the account holder's name, and the balance. The class should have methods for
depositing and withdrawing money from the account, as well as a method for transferring
money to another account */

import java.util.Scanner;


class BankAccount
{
    String name;
    static double bal=0; 
    double depo, with;
    
    void detail_input(String n, double b)
    { 
        name = n;
        bal = b;
    }
    void detail_display()
    {
        System.out.println("");
        System.out.println("ACCOUNT HOLDER: "+name);
        System.out.println("CURRENT BALANCE: Rs."+bal);
        System.out.println("");
    }

    void deposit()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter deposit amount: ");
        depo = scan.nextDouble();
        
        bal = bal + depo;
        
        System.out.println("New Balance: "+bal);    
    }
    void withdraw()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter deposit amount: ");
        with = scan.nextDouble();

        bal = bal - with;

        System.out.println("New Balance: "+bal);    
    }

}

public class ps1q5 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        BankAccount b = new BankAccount();
        
        b.detail_input("Sai Lochan Dash", 10000.0);
        b.detail_display();

        System.out.println("1 for deposit, 2 for withdrawl: ");
        int i = scan.nextInt();

        if(i==1)
        b.deposit();  
        else if(i ==2)
        b.withdraw();
        else
        System.out.println("INVALID INPUT.");
    }
    
}
