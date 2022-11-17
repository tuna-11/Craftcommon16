import java .util.scanner;

public class emposcanner {

    public static void main(strinf[]args) {
        //TODO AUTO-generated method stub

        Scanner in = new scanner(system.in);
        system.out.println("pls enter your name");
        string name = in.nextline();

        system.out.println("pls enter your salary");
        int salary = in.nextInt();

        system.ou.println("pls enter your bouns");
        double bouns = in.nextDouble();

        double total_salary = salary + bouns;

        System.out.println("the name of employee the is:" + name);
        System.out.println("the salary of employee the is:" + salary);
        System.out.println("the bouns of employee the is:" + bouns);
        System.out.println("the total salary of the employee is:" + total_salary);
    }
}
