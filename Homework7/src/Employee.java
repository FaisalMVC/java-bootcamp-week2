public class Employee {
    private String id;
    private String name;
    private double salary;

    public Employee(String id, String name, int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public String getId() {
        return "\n******************Employee ID******************\n"+id;
    }

    public String getName() {
        return "\n******************Employee Name******************\n"+name;
    }

    public double getSalary() {
        return salary;
    }
    public double getAnnualSalary(){
        return salary*12;
    }
    public double raisedSalary(double percent){
        return salary*=(1+(percent/100));
    }
    @Override
    public String toString(){
        return "\n******************Employee Info******************\nEmployee name: "+ name+"\nEmployee ID: "+id+"\nEmployee Salary: "+salary;
    }
}
