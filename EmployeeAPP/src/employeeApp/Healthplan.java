package employeeApp;

public class Healthplan
{
    private int id;
    private String name;

    public Healthplan(String name)
    {
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setNmae(String name)
    {
        this.name = name;
    }
}