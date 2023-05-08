/*
*
* @author Faisal Alharbi
* */

public class Main {
    public static void main(String[] args) {
        Account ali = new Account("1101","Ali",10000);
        Account khaled = new Account("1102","khaled",900);

        System.out.println(ali.toString());
        System.out.println(khaled.toString());

        ali.credit(1000);

        ali.transferTo(khaled,-2000);

        Employee saleh = new Employee("202","Saleh",12000);

        System.out.println(saleh.toString());

        saleh.raisedSalary(20);

        System.out.println(saleh.getName()+"\nannuale salary: "+saleh.getAnnualSalary());

        System.out.println(saleh.toString());
    }

}