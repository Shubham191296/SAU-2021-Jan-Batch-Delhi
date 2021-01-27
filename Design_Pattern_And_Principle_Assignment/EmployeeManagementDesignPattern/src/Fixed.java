
public class Fixed implements RemType{

    @Override
    public void newSalary(double salary) {
          System.out.print("Your Salary is ");
          System.out.print(salary);
          System.out.println(" Rs");
    }

    @Override
    public void typeRem() {
        System.out.println("this remuneration is fixed ");
    }
}
