package employeeApp;

public class Employee
{
    //fields
    private int id;
    private String fname;
    private String lname;
    private double salary;
    private boolean has401k;
    private int companyId;
    private int healthPlanId;


    //methods- geters and setters
    public void setFname(String fname)
    {
        this.fname = fname;
    }

    public String getFname()
    {
        return fname;
    }

    public void setLname(String lname)
    {
        this.lname = lname;
    }

    public String getLname()
    {
        return lname;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setHas401k(boolean has401k) 
    {
        this.has401k = has401k;
    }
    
    public boolean getHas401k()
    {
        return has401k;
    }

    public void setCompanyId(int companyId)
    {
        this.companyId = companyId;
    }

    public int companyId()
    {
        return companyId;
    }

    public void setHealthPlanId(int healthPlanId)
    {
        this.healthPlanId = healthPlanId;
    }

    public int healthPlanId()
    {
        return healthPlanId;
    }
    //methods
}