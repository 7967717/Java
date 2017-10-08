package java8.validation;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author roman.rudenko on 06-Sep-16.
 */
public class GenericValidator<T>{
    private final List<Predicate<T>> validators = new LinkedList<>();

    public GenericValidator(List<Predicate<T>> validators) {
        this.validators.addAll(validators);
    }

    public boolean test(final T toValidate) {
        return validators.parallelStream().allMatch(predicate -> predicate.test(toValidate));
    }



//    @Override
//    public boolean test(Object o) {
//        return false;
//    }

//
//    private final List> validators = new LinkedList<>();
//
//    public GenericValidator(List> validators) {
//        this.validators.addAll(validators);
//    }
//
//    @Override
//    public Boolean apply(final T toValidate) {
//        // a final array allows us to change the boolean value within a lambda
//        final boolean[] guard = {true};
//        return validators.stream()
//                // only send the validator downstream if
//                // previous validations were successful
//                .filter(validator -> guard[0])
//                .map(validator -> validator.apply(toValidate))
//                // update the guard condition
//                .map(result -> {
//                    guard[0] = result;
//                    return result;
//                })
//                // Logically AND the results of the applied validators
//                .reduce(guard[0], (b1, b2) -> b1 && b2);
//    }
}
