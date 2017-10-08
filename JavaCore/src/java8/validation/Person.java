package java8.validation;

/**
 * @author roman on 9/10/16.
 */
public class Person {
    private String name;
    private String age;
    private String gender;

    public Person(String name, String age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}
