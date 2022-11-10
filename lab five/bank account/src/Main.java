import  java.util.Scanner;
public class Main {

    static class BankAccount{
        private double balance;
        private double depodit;

        private double withdraw;

        public BankAccount() {  //constructor to initial balance
            double balance =0;
        }

        public void AddDeposit(double d){
            depodit =d;

        }

        public void RecieveBalance(){      //method to receive balance from user
            balance = balance + depodit ;
        }


        public void MakeWithdraw(double w){  //method to perform withdraw operation
            withdraw = balance - w;
        }

        public double ShowBalance(){  //this will return balace value after deposit operation
            return balance;
        }

        public double ShowDeposit(){ //this will return deposit value
            return depodit;
        }

        public double ShowWithdraw(){  //this will return the balance after withdraw operation
            return withdraw;
        }

    }

    public static void main(String[] args) {
        double dep;
        double with;

            Scanner input = new Scanner(System.in);
            BankAccount bank = new BankAccount();


            System.out.println("enter your deposit ; ");
            dep = input.nextDouble();


            bank.AddDeposit(dep);
            System.out.println("you add " + bank.ShowDeposit() + " to your account \n");

            bank.RecieveBalance();
            System.out.println("your current balance is : " + bank.ShowBalance() + "\n");

            System.out.println("enter withdraw : ");
            with = input.nextDouble();

            bank.MakeWithdraw(with);
            System.out.println("your account after withdraw is ; " + bank.ShowWithdraw() + "\n");

    }
}