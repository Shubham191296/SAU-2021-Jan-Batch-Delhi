import java.util.List;

public  class People {

    //vars
    private List<People> _employees;
    private People _employer;
    private Boolean _isSalaryFix;
    private Double _salary;
    private Department _dep;
    private String name;
    
   
    // setters
    public List<People> get_employees() {
        return _employees;
    }
    public People get_employer() {
        return _employer;
    }
    public Boolean get_isSalaryFix() {
        return _isSalaryFix;
    }
    public Double get_salary() {
        return _salary;
    }
    public Department get_dep() {
        return _dep;
    }


    //getters
    public void set_salary(Double salary) {
        this._salary = salary;
    }
    public void set_employees(List<People> _employees) {
        this._employees = _employees;
    }
    public void set_isSalaryFix(Boolean _isSalaryFix) {
        this._isSalaryFix = _isSalaryFix;
    }
    public void set_employer(People _employer) {
        this._employer = _employer;
    }
    public void set_dep(Department _dep) {
        this._dep = _dep;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
