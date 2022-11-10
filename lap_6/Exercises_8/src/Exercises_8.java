import java.util.Scanner;



public class Exercises_8 {



    public static void main(String[] args) {


        int prime; ; int number ;


        Scanner in=new Scanner(System.in);


        System.out.println("Enter number: ");


        number=in.nextInt();

         System.out.println("The prime numbers for the inputted number is: ");

        for ( prime = 2; prime <= number; prime++) {


             int j;

            for ( j = 2; j <=prime; j++) {


                if (prime%j==0)

                    break;
            }

                if (j>=prime)


                   System.out.println(prime);
        }

    }
}