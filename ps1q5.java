/*Create a " BankAccount " class with a constructor that takes in the account number,
the account holder's name, and the balance. The class should have methods for
depositing and withdrawing money from the account, as well as a method for transferring
money to another account */

import java.util.Scanner;

class BankAccount
{
    String name1, name2;
    static double bal1=0;
    static double bal2=0; 
    double depo, with;
    
    void detail_input(String n1, String n2, double b1, double b2)
    { 
        name1 = n1;
        name2 = n2;
        bal1 = b1;
        bal2 = b2;
    }
    void detail_display()
    {
        System.out.println("");
        System.out.println("ACCOUNT HOLDER: "+name1);
        System.out.println("CURRENT BALANCE: Rs."+ bal1);
        System.out.println("");
    }
    void detail_display2()
    {
        System.out.println("");
        System.out.println("ACCOUNT HOLDER: "+name2);
        System.out.println("CURRENT BALANCE: Rs."+ bal2);
        System.out.println("");
    }

    void deposit()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter deposit amount: ");
        depo = scan.nextDouble();
        
         bal1 =  bal1 + depo;
        
        System.out.println("New Balance: "+ bal1);    
    }
    void withdraw()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter deposit amount: ");
        with = scan.nextDouble();

         bal1 =  bal1 - with;

        System.out.println("New Balance: "+ bal1);    
    }
    void transfer()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter amount to Transfer: ");
        double t = scan.nextDouble();

        bal1 = bal1 - t;
        bal2 = bal2 + t;

        System.out.println("AMOUNT TRANSFERRED SUCCESFULLY.");
    
    }

}

public class ps1q5 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        BankAccount b = new BankAccount();
        
        b.detail_input("Sai Lochan Dash", "MUKESH AMBANI", 10000.0, 10000.0);

        System.out.println("1 for deposit, 2 for withdrawl, 3 for transfer: ");
        int i = scan.nextInt();

        if(i==1)
        {
            b.deposit();
            b.detail_display();
        }
        else if(i==2)
        {
            b.withdraw();
            b.detail_display();
        }
        else if(i==3)
        {
            b.transfer();
            b.detail_display2();
        }
        else
        System.out.println("INVALID INPUT.");
    }
    
}
