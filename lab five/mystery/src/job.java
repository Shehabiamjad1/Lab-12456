//program to call the constructor from anthor constructor
public class job {



    static class BankAccount {

        private double balance;

        public BankAccount(double a) {  //constructor to initial balance value
            balance = a;
        }

        public BankAccount(BankAccount BankAccount){     //this constructor to take the previous constructor's value
            this.balance = this.balance;
        }



        public void mystery(BankAccount that, double amount) {     //this to take the balance value from the previous constructor
            this.balance = this.balance - amount;
            that.balance = that.balance + amount;
        }

        public double BankAccount(){       // this will print the balance value
            return this.balance;
        }
    }

        public static void main(String[] args) {


        BankAccount bank = new BankAccount(15000);

            System.out.println("the balance is : " + bank.BankAccount());  //print the value


    }
}
