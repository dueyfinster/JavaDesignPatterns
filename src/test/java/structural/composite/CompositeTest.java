package structural.composite;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class CompositeTest {
    
    @Test
    public void canAddEmployeeToEmployee(){
        Employee e1 = new Employee("Test", "HR", 5);
        Employee e2 = new Employee("Test 2", "Asst", 2.5);
        
        e1.addSubordinate(e2);
        
        List<Employee> empList = e1.getSubordinates();
        
        assertTrue(empList.contains(e2));
    }

}
