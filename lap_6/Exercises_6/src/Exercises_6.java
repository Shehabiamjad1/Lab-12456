   import java.util.Scanner;

   public class Exercises_6 {


    public static void main(String[] args) {


         int power=2;


        Scanner in=new Scanner(System.in);

        System.out.println(" (All powers of 2 from 2^0 up to 2^20) ");

        for (int i = 0; i <= 20; i++) {

             if (i==0)

                power=1;

             else if (i==1)

                power=2;

            else power=power*2;

            System.out.print(power+" ");

        }
    }
}