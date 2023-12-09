package person;

import java.util.*;

public class MainPerson {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
//ex 2
        personList.add(new Person("Mihai", "brunet", 33));
        personList.add(new Person("Andrei", "blond", 45));
        personList.add(new Person("David", "saten", 22));
//ex 2.1
        List<String> personNames = new ArrayList<>();
        for (Person person : personList) {
            personNames.add(person.getName());
        }
        System.out.println("List of Person Names: " + personNames);
//ex 2.2
        Map<String, Integer> personNameToAgeMap = new HashMap<>();
        for (Person person : personList) {
            personNameToAgeMap.put(person.getName(), person.getAge());
        }
        System.out.println("Map from Person Names to Ages: " + personNameToAgeMap);
//ex 2.3
        int givenAge = 50;
        List<Person> olderPersons = new ArrayList<>();
        for (Person person : personList) {
            if (person.getAge() > givenAge) {
                olderPersons.add(person);
            }
            System.out.println("Persons older than " + givenAge + ": " + olderPersons);
        }
//ex 2.4
        Map<String, List<String>> personHairColorToNamenMap = new HashMap<>();
        for (Person person : personList) {
            String hairColor = person.getHairColor();
            String name = person.getName();

            personHairColorToNamenMap.computeIfAbsent(hairColor, k -> new ArrayList<>()).add(name);
        }
        System.out.println("Map from Hair Color to Name: " + personHairColorToNamenMap);

        Map<Integer, List<Person>> personAgeToPerson = new HashMap<>();
        for (Person person : personList) {
            Integer age = person.getAge();

            personAgeToPerson.computeIfAbsent(age, k -> new ArrayList<>()).add(person);
        }
        System.out.println("Map from Age to List of Persons: " + personAgeToPerson);

//ex 3.1

        List<Employees> employeesList = new ArrayList<>();
        employeesList.add(new Employees("Radu", "brunet", 33, "Apple", 400));
        employeesList.add(new Employees("Emil", "brunet", 55, "Samsung", 150));
        employeesList.add(new Employees("Ionel", "blond", 26, "Philips", 600));

        int givenAmount = 200;
        List<Employees> employeesWithBiggerSalary = new ArrayList<>();
        for (Employees employees : employeesList) {
            if (employees.getSalary() > givenAmount) {
                employeesWithBiggerSalary.add(employees);
            }
            System.out.println("Employees with a salary higher are:" + employeesWithBiggerSalary);

        }
//ex 3.2
        Map<String, String> employeesForCompany = new HashMap<>();
        for (Employees employees : employeesList) {
            employeesForCompany.put(employees.getName(), employees.getCompany());
        }
        System.out.println("Map from employees Names to Company: " + sumOfSalary(employeesList));
//ex 3.3
        List<Employees> employeeSalary = new ArrayList<>();
        int sum = Integer.parseInt(String.valueOf(sumOfSalary(employeesList)));
        System.out.println("The sum of salaries is: " + sum + " euro");
    }

    private static int sumOfSalary(List<Employees> employees) {
        int sumOfSalary = 0;

        for (Employees employe : employees) {
            sumOfSalary += employe.getSalary();
        }
        return sumOfSalary;
    }
}
