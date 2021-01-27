
public class Variable implements RemType {

    @Override
    public void newSalary(double salary) {
        salary = salary + ( salary*10 )/100;
        System.out.print("Your Salary is");
        System.out.print(salary);
        System.out.println(" Rs");
    }

    @Override
    public void typeRem() {
        System.out.println("this remuneration is variable ");
    }
}
