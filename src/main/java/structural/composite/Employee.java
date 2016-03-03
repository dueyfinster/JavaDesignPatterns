package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private final String name;
    private final String dept;
    private final double salary;
    private List<Employee> subordinates;

    Employee(final String name, final String dept, final double salary){
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<Employee>();
    }

    public void addSubordinate(final Employee e){
        subordinates.add(e);
    }

    public void removeSubordinate(final Employee e){
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates(){
        return subordinates;
    }
    
    public void printSubordinates(){
        System.out.println(this);
        for (Employee headEmployee : this.getSubordinates()) {
            System.out.println(headEmployee);
            
            for (Employee employee : headEmployee.getSubordinates()) {
               System.out.println(employee);
            }
         } 
    }

    public String toString(){
        return "Employee [name: "+name+", dept: "+dept+", salary: "+salary+" ]";
    }
}
