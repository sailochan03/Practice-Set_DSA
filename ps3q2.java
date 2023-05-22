/*Create an abstract class called BankAccount that contains an abstract method called
calculateInterest(). Implement two concrete classes CheckingAccount and
SavingsAccount, that extend BankAccount and implement the calculateInterest() method
for each type of account.
Hint- interestRate = (balance * interstRate)/ 12;*/

abstract class BankAccount{
    double balance;
    double interestRate;
    public BankAccount(double b, double i){
        balance =b;
        interestRate =i;
    }
    public abstract double calculateInterest();
}
class CheckingAccount extends BankAccount{
    public CheckingAccount(double b, double i){
        super(b, i);
    }

    public double calculateInterest(){
        double interest = (balance*interestRate)/12;
        return interest;
    }
}
class SavingsAccount extends BankAccount{
    public SavingsAccount(double b, double i){
        super(b, i);
    }
    public double calculateInterest(){
        double interest = (balance*interestRate)/12;
        return interest;
    }
}
public class ps3q2 {
    public static void main(String[] args) {
        CheckingAccount c = new CheckingAccount(1000, 10);
        System.out.println(c.calculateInterest());
        SavingsAccount s = new SavingsAccount(1000, 7);
        System.out.println(s.calculateInterest());
    }
    
}
