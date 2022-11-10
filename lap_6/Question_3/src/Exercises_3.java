
import java.util.Scanner;

public class Exercises_3 {


    public static void main(String[] args) {



        String word;   char add=32;

        Scanner in=new Scanner(System.in);

        System.out.println("Input your word: ");

         word=in.nextLine();

            for (int i = 0; i <word.length() ; i++) {

              if (word.charAt(i)>=97 ) {

                   add=add++;

                char ca= (char) (word.charAt(i)-add);        //great

                     System.out.println("  " + ca);

            }

                 else

                     System.out.println("  "+word.charAt(i));

        }
    }
}