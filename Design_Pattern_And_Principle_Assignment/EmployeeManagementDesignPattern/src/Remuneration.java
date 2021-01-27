
import java.util.List;

public abstract class Remuneration {

    public People _employee;

    public Remuneration(People _employee) {
        this._employee = _employee;
    }

    public RemType create() {
        if (!_employee.get_isSalaryFix()){
            return new Variable();
        }else{
            return new Fixed();
        }
    }
}
