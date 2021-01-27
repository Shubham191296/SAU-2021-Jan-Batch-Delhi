
public class RemEmp extends Remuneration {

    public RemEmp(People _employee) {
        super(_employee);
    }

    @Override
    public RemType create() {
        if (_employee.get_isSalaryFix()){
            return new Fixed();
        }else{
            return new Variable();
        }
    }
}
