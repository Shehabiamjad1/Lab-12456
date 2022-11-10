import java.util.Scanner;

public class Exercises_4 {

    public static void main(String[] args) {



        String word ;     int  reverse;


          Scanner in=new Scanner(System.in);

          System.out.println("Input your word: ");

          word=in.next();

          reverse=word.length();

          for (int i = 1; i < word.length() ; i--) {

              reverse--;
              System.out.print(word.charAt(reverse));
           }

    }
}