package sda;

import java.util.HashMap;
import java.util.Map;

public class EmployeeList {

    private Map<Integer, Employee> listaEmployees = new HashMap<>();

    private static int id = 0;

    public void addEmployee (Employee employee){
        listaEmployees.put(id, employee);
        id++;
    }
}
