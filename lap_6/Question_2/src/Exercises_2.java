import java.util.Scanner;
public class Exercises_2 {
    public static void main(String[] args) {
        int a, b;    int sum=0;
        Scanner in=new Scanner(System.in);
        {
            for (int i = 2; i <= 100; i++) {
                if (i % 2 == 0) {
                    sum = sum + i;
                }
            }
            System.out.println("The sum of all even numbers between 2 and 100: " + sum);
        }
        {
            System.out.print("Enter a  and  b numbers: ");
            a = in.nextInt();
            b = in.nextInt();
            sum = 0;
            for (int i = a; i <= b; i++) {
                if (i % 2 == 1) {

                    sum = sum + i;

                }
            }
            System.out.println("The sum of all odd numbers between a and b : " + sum);
        }
        {
            sum = 0;
            String d;
            System.out.println("input number: ");
            d = in.next();
            int h = d.length();

            for (int i = 0; i < h; i++) {
                if (d.charAt(i) % 2 == 1) {
                    System.out.println("the odd numbers in your input are: "+d.charAt(i));
                    sum = sum + d.charAt(i);   //note  what is the problem  in this line.  Dr.Fatima. the summation is wrong.

                }
            }

            System.out.println("The sum of all odd digits of an input: " + sum);
        }

    }
}