package employeeApp;

public class Employee
{
    //fields
    private static int maxId = 0;
    private int id;
    private String fname;
    private String lname;
    private double salary; // real number -- float
    private boolean has401k;
    private int companyId;
    private int healthPlanId;

    // constructor
    // initial state of the object
    public Employee(String fname, String lname, double salary, boolean has401k, int companyId, int healthPlanId)
    {
        maxId++;

        id = maxId;
        
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
        this.has401k = has401k;
        this.companyId = companyId;
        this.healthPlanId = healthPlanId;
    }

    //methods- geters and setters
    public int geId()
    {
        return id;
    }
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

    public String getName()
    {
        return fname + " " + lname;
    }

    //Object -> Employee

    @Override
    public String toString()
    {
        String rtnStr = "id: " + id + "\n" +
                        "fname: " + fname + "\n" +
                        "lname: " + lname + "\n" +
                        "salary: " + salary + "\n" +
                        "has401k: " + has401k + "\n" +
                        "companyId: " + companyId + "\n" +
                        "healthPlanId: " + healthPlanId + "\n";
        return rtnStr; 
    }
}