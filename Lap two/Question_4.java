
import java.util .Scanner;
public class m4 {

public static void main(String[] args){


Scanner in=new Scanner(System.in);

System.out.println("enter student name");

String name=in.nextLine();

int m1=0,m2=0,m3=0;
System.out.println("enter 3 subject");

 m1=in.nextInt();
 m1=in.nextInt();
 m1=in.nextInt();

 int sum=m1+m2+m3;
int avg=sum/3;
 System.out.println("student name"+name+"/t"+"avg=="+avg);

}}

