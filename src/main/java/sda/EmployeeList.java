package sda;

import java.util.*;

public class EmployeeList {

    private Map<Integer, Employee> listaEmployees = new HashMap<>();

    private static int id = 0;

    public void addEmployee (Employee employee){
        listaEmployees.put(id, employee);
        id++;
    }

    public List<Employee> find (Integer id){
       char[] parsedId = String.valueOf(id).toCharArray();
       List<Employee> findedEmployees = new ArrayList<>();
       List<Character> charId = new ArrayList<>();

       for(int i=0; i<parsedId.length; i++){
           charId.add(parsedId[i]);
       }

       for(Integer key: listaEmployees.keySet()){
           char[] parsedKey = String.valueOf(key).toCharArray();

           List<Character> charKey = new ArrayList<>();
           for(int i=0; i<parsedKey.length; i++){
               charKey.add(parsedKey[i]);
           }

           Collections.sort(charId);
           Collections.sort(charKey);
           if(charId.equals(charKey)){
               findedEmployees.add(listaEmployees.get(key));
           }
       }

       return findedEmployees;
    }
}
