
import java.util .Scanner;
public class m7{

   public static void main(String[] args){


   Scanner in=new Scanner(System.in);


int i=0,t=0;
System.out.println("enter 2 number");
i=in.nextInt();

t=in.nextInt();

int sum =i+t;
int Difference=i-t;
int product=i*t;


double avrage=i+t/2;

System.out.println("|...|sum|...|="+"|>>|"+sum+"|<<|"+"\n");

System.out.println("|...|Difference|...|="+"|>>|"+ Difference+"|<<|"+"\n");

System.out.println("|...|product|...|="+"|>>|"+product+"|<<|"+"\n");

System.out.println("|...|avrage|...|="+"|>>|"+avrage+"|<<|"+"\n");

if(i<t){

System.out.println("the maximum is " + i);
System.out.println("the minimum is " + t);

}
else{

    System.out.println("the maximum is " + t);
System.out.println("the minimum is " + i);
}



}}
