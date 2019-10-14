package structural.composite;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

/**
 * Composite pattern shows that objects can be composed together. Here we see an
 * employee hierarchy.
 */
public class CompositeTest {

    @Test
    public void canAddEmployeeToEmployee() {
        Employee e1 = new Employee("Test", "HR", 5);
        Employee e2 = new Employee("Test 2", "Asst", 2.5);

        e1.addSubordinate(e2);

        List<Employee> empList = e1.getSubordinates();

        assertTrue(empList.contains(e2));
        e1.printSubordinates(); // Will show the hierarchy
    }

    @Test
    public void canRemoveEmployeeFromEmployee() {
        Employee e1 = new Employee("Test", "HR", 5);
        Employee e2 = new Employee("Test 2", "Asst", 2.5);

        e1.addSubordinate(e2);

        List<Employee> empList = e1.getSubordinates();

        assertTrue(empList.contains(e2));

        e1.removeSubordinate(e2);

        assertFalse(empList.contains(e2));
    }

}
