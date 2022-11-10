import java.util.Scanner;
public class Main {

    static class Employee{
        private String Empname;
        private Double raise;
        private double Empsalary;

        public Employee(){

            raise = Double.valueOf(0);

        }

        public void GetName(String n){     //this method to receive the employee name
            Empname = n;
        }

        public void GetSalary(double s){   //this method to receive the employee salary
            Empsalary = s;
        }

        public void RaisSalary(double r){   //this method to receive the increase percentage of salary
            raise = (Empsalary * r ) / 100;
        }

        public String PrintName(){           //return employee name
            return Empname;
        }

        public double PrintSalary(){         //return employee salary
            return Empsalary;
        }

        public double SalaryUp(){            //return increase percentage of salary
            return raise;
        }

    }
    public static void main(String[] args) {

        Employee em = new Employee();
        Scanner input = new Scanner(System.in);

        System.out.println("enter an employee name :");
        String name = input.nextLine();
        em.GetName(name);

        System.out.println("enter the employee salary :");
        double salary = input.nextDouble();
        em.GetSalary(salary);


        System.out.println("enter the percentage of increase on the salary :");
        int raise =input.nextInt();
        em.RaisSalary(raise);

         //print the results
        System.out.println("employee name : " + em.PrintName());
        System.out.println("employe salary : " + em.PrintSalary() + '$');
        System.out.println("the amount fo increase on employee salary : "+ raise + "%" + " = " +em.SalaryUp() + '$');
    }
}