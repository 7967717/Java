package java8.validation;

/**
 * @author roman on 9/10/16.
 */
public interface MyPredicate <T> {
        boolean test(T t);
}

class MyPredicateImpl<T> implements MyPredicate{

    @Override
    public boolean test(Object o) {
        return false;
    }
}
