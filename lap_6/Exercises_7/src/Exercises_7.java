import java.util.Scanner;

public class Exercises_7 {


    public static void main(String[] args) {


         int  number ,  digit=0  , add=0 ;


         Scanner in=new Scanner(System.in);

         System.out.println("Enter number: ");

         number=in.nextInt();

         System.out.println("Number "+number+" in binary is: ");

        for (int i = 0; i <8 ; i++) {

              add++;

             digit=number%2;

             number=number/2;

             System.out.println(" "+digit);

        }
           System.out.println("the number is divided "+add+" times");
    }
}