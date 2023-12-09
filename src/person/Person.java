package person;

public class Person {
    private String name;
    private String hairColour;
    private Integer age;

    public String getName() {
        return name;
    }

    public String getHairColour() {
        return hairColour;
    }

    public Integer getAge() {
        return age;
    }

    public Person(String name, String hairColour, Integer age) {
        this.name = name;
        this.hairColour = hairColour;
        this.age = age;
    }

    public String getHairColor() {
        return hairColour;
    }

    public String toString() {
        return "Person: name " + name + " age" + age + "hair colour " + hairColour;
    }
}
