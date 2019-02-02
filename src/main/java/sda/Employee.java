package sda;

public class Employee {

    private String imie;
    private String nazwisko;

    Employee(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    };

    @Override
    public String toString() {
        return "Employee{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

}
