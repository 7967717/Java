package ocpjp7.Chapter06_GenericsAndCollections.Listing608;


/*ocpjp7*/


// This program shows the usage of the diamond syntax while using generics
class Pair<T1, T2> {
    T1 object1;
    T2 object2;

    Pair(T1 one, T2 two) {
        object1 = one;
        object2 = two;
    }

    public T1 getFirst() {
        return object1;
    }

    public T2 getSecond() {
        return object2;
    }
}
 