import  java.util.Scanner;
public class Main {

    static class SavingAccount{
        private double balance;
        private double deposit;

        private double interes;
        private double withdraw;

        public SavingAccount() {
             balance =1000;
            double interest = 0.1;
        }

        public void AddDeposit(double d){
            deposit =d;

        }

        public void RecieveBalance(){

            balance = balance + deposit;
        }


        public void MakeWithdraw(double w){  //method to perform withdraw operation
            withdraw = balance - w;
        }

        public void AddInterest(double i){
            interes = balance * i;
        }

        public double ShowBalance(){  //this will return balace value after deposit operation
            return balance;
        }

        public double ShowDeposit(){ //this will return deposit value
            return deposit;
        }

        public double ShowWithdraw(){  //this will return the balance after withdraw operation
            return withdraw;
        }

        public double ShowInterest(){
            return interes - 100;
        }

    }

    public static void main(String[] args) {
        double dep;
        double with;
        char d ='$';

        Scanner input = new Scanner(System.in);
        SavingAccount bank = new SavingAccount();


        System.out.println("enter your deposit ; ");
        dep = input.nextDouble();


        bank.AddDeposit(dep);
        System.out.println("you add " + bank.ShowDeposit() + d + " to your account \n");

        bank.RecieveBalance();
        System.out.println("your current balance is : " + bank.ShowBalance() + d + "\n");

        bank.AddInterest(0.1);
        System.out.println("'10%' inters will add to your account : " + bank.ShowInterest() + d + "\n");

               double sum = bank.ShowBalance() + bank.ShowInterest();

        System.out.println("balance after adding interest is : " + sum + d + "\n");

        System.out.println("enter withdraw : ");
        with = input.nextDouble();

               double sum1 = bank.ShowWithdraw() + sum - with;

        bank.MakeWithdraw(with);
        System.out.println("your account after withdraw is : " + sum1 +    d +  "\n");

    }
}