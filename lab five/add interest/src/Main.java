public class Main {

    static class BankAccount{
        private double r;
        private double balance;
        private double rate;
        public BankAccount(double r1 ){
             r = r1 + 1;
             balance = r1;
        }

        public void AddInterest(double r2) {   //this for add the interest
            rate = r2;
        }

        public double ShowInterest(){    //this for print the interest
            return  rate;
        }

        public void AddInteresttoBalance(double a){  //this to add interest to balance
            balance = a + r;
        }

        public double ShowBalance(){
           double ra =  rate / 100 ;
            double rt = ra * balance;
            return balance + rt;

        }

    }

    public static void main(String[] args) {
        BankAccount momsSaving = new BankAccount(1000);

        momsSaving.AddInterest(10);
        System.out.println("the interest is : " + momsSaving.ShowInterest() + "% " + " =>" + " 100$");
        System.out.println("the current balance is : " + momsSaving.ShowBalance() + "$");
    }
}