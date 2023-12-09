package person;

import java.util.ArrayList;
import java.util.List;

public class Employees extends Person{
    private final String company;
    private final Integer salary;

    public String getCompany() {
        return company;
    }

    public Integer getSalary() {
        return salary;
    }

    public Employees(String name, String hairColour, Integer age, String company, Integer salary) {
        super(name, hairColour, age);
        this.company = company;
        this.salary = salary;

    }
}
