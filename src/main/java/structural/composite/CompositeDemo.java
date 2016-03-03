package structural.composite;

public final class CompositeDemo {
    private static final int HIGHEST_SALARY = 1000000;
    private static final int MIDDLE_SALARY = 10000;
    private static final int LOWEST_SALARY = 10000;
    
    private CompositeDemo(){}

    public static void main(final String[] args) {
        Employee ceo = new Employee("Neil Grogan", "Executive", HIGHEST_SALARY);
        Employee hr = new Employee("Rodrigo Marcuschi", "Human Resources", LOWEST_SALARY);
        Employee cto = new Employee("Mark Howard", "CTO", MIDDLE_SALARY);
        Employee cfo = new Employee("Patrick Russell", "CFO", MIDDLE_SALARY);
        
        Employee softeng = new Employee("Joe Bloggs", "Software Engineer", MIDDLE_SALARY);
        Employee socsci = new Employee("Dwayne Joseph", "Social Scientist", LOWEST_SALARY);
        Employee acct = new Employee("David Romero", "Accountant", LOWEST_SALARY);
        Employee ass = new Employee("Cadillic Skydrive", "Assistant", LOWEST_SALARY);
        
        ceo.addSubordinate(hr);
        ceo.addSubordinate(cto);
        ceo.addSubordinate(cfo);
        
        cto.addSubordinate(softeng);
        cfo.addSubordinate(acct);
        hr.addSubordinate(socsci);
        cfo.addSubordinate(ass);
        
        ceo.printSubordinates(); // ceo is composed of all employees

    }

}
