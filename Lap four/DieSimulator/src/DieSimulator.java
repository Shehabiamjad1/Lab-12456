
import java.util.Random;

public class DieSimulator {

    public static void main(String[] args) {


        Random rand = new Random();


        int i =1;
        for( i = 1 ;i <= 6 ; i++){

            rand.nextInt(i);

            System.out.print(rand.nextInt(i));

        }

    }

}
