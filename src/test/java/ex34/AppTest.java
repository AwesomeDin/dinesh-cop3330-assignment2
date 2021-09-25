package ex34;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void addEmp() {
        ArrayList<String> employees = new ArrayList<>();
        ArrayList<String> currentEmployees = new ArrayList<>();
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");
        assertEquals(employees,App.addEmp(currentEmployees));
    }

    @Test
    void removeEmp() {
        ArrayList<String> employees = new ArrayList<>();
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");
        ArrayList<String> currentEmployees = new ArrayList<>();
        currentEmployees.add("John Smith");
        currentEmployees.add("Jackie Jackson");
        currentEmployees.add("Chris Jones");
        currentEmployees.add("Amanda Cullen");
        currentEmployees.add("Jeremy Goodwin");
        assertEquals(employees,App.removeEmp(currentEmployees,"John Smith"));
    }
}