
public class Administrative extends Department implements Management{

    @Override
    public void getName() {
        System.out.println("Welcome to Administrative Department");
    }

    @Override
    public void ManageEmpoloyee() {
        System.out.println("somethings about management of employees");
    }
}




