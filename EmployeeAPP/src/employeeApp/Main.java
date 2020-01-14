package employeeApp;

public class Main
{
    //field - information
    //methods- do behaviors

    public static void main(String[] args)
    {
        // System.out.println("Hello");

        Healthplan h1 = new Healthplan("My Health 1");
        Healthplan h2 = new Healthplan("My Health 2");

        Company c1 = new Company("Company A", 100);
        Company c2 = new Company("Company B", 100);

        Employee emp1 = new Employee("Steve", "Green", 45000, true, c1.id, h1.getId());
        Employee emp2 = new Employee("May", "Ford", 80000, true, c1.id, h2.getId());

        Employee emp3 = new Employee("Doug", "Jones", 75000, true, c2.id, h2.getId());
        Employee emp4 = new Employee("John", "Jones", 80000, false, c2.id, h1.getId());
        Employee emp5 = new Employee("My", "Name", 45000, true, c2.id, h2.getId());

        System.out.println("***Query Data***");
        System.out.println(emp1);
        System.out.println();
        System.out.println(c1.debt);
        c1.debt = -c1.debt;
        System.out.println(c1.debt);

        System.out.println("*** Strings ***");
        
        String localStr;
        localStr = emp1.getFname() + " " + emp3.getLname();
        System.out.println(localStr);
        String noVowls = localStr.toLowerCase().replaceAll("[a,e,i,o,u]", "_");
        System.out.println(noVowls);
        
        System.out.println();
        System.out.println("*** Numbers ***");
        System.out.println("Original / 5 " + (c1.debt / 5));
        System.out.println("Original / 7 " + (c1.debt / 7));
        System.out.println("Original / 7.0 " + (c1.debt / 7.0));

    }
}