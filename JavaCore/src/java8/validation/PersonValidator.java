package java8.validation;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author roman.rudenko on 06-Sep-16.
 */
public class PersonValidator extends GenericValidator<Person> {
    private static final List<Predicate<Person>> VALIDATORS = new LinkedList<>();

    static {
        VALIDATORS.add(person -> person.getName() != null);
        VALIDATORS.add(person -> person.getAge() != null);
        VALIDATORS.add(person -> person.getGender() != null);
    }

    public PersonValidator() {
        super(VALIDATORS);
    }

    public static void main(String[] args) {
        Person person0 = new Person("name", "age", "gender");
        Person person1 = new Person("name", "age", null);

        PersonValidator personValidator = new PersonValidator();
        System.out.println(personValidator.test(person0));
        System.out.println(personValidator.test(person1));
    }

}
