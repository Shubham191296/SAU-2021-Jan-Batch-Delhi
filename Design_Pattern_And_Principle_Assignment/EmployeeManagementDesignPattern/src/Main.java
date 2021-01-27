import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date; 
// test file
public class Main {
    public static void main (String[] args){
                
        Administrative a = new Administrative();
        Service s = new Service();
        
        System.out.println("---------------------------------");
        
        People p = new People();
        
        p.setName("Shubham");
        System.out.println(p.getName());
        p.set_dep(a);
        p.get_dep();
        p.set_isSalaryFix(false);
        p.set_salary(500.00);
        RemEmp remp = new RemEmp(p);
        remp.create().newSalary(p.get_salary());
        remp.create().typeRem();
        Employee e=new Employee(p);
        System.out.println("---------------------------------");
        
        People p1 = new People();
        p1.setName("Megha");
        //e[1].setPeople(p1);
        System.out.println(p1.getName());
        p1.set_salary(700.00);
        s.getName();
        p1.set_dep(s);
        p1.get_dep();
        p1.set_isSalaryFix(true);
        remp.create().newSalary(p1.get_salary());
        remp.create().typeRem();

        System.out.println("---------------------------------");
        
        Employee e2=new Employee(p1);
        Calendar cal = Calendar.getInstance();
        Integer date = cal.get(Calendar.DATE);
        if(date == 15) {
        MessagePublisher mp = new MessagePublisher();
        
        mp.attach(e);
        mp.attach(e2);
         
        mp.notifyUpdate(new Message("Email "));   //s1 and s2 will receive the update
         
        mp.detach(e);
        //mp.attach(e2);
         
        mp.notifyUpdate(new Message("Message"));
        }
        
    }
}
