package sda;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

       EmployeeList lista = new EmployeeList();
       lista.addEmployee(new Employee("Ania", "Bed"));
       lista.addEmployee(new Employee("Maja", "Hdhfguyg"));
       lista.addEmployee(new Employee("Ewa", "Jhfbuy"));
       lista.addEmployee(new Employee("Rab", "Bajdj"));

        System.out.println(lista.find(2));;




    }
}
