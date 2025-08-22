package interface_comparable.model.entities;

public class Employee implements Comparable{
    private String name;
    private Double salary;

    public Employee() {

    }

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Object other) {
        return name.compareTo(((Employee) other).getName());
    }



    
}
