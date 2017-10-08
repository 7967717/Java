package ocpjp7.Chapter06_GenericsAndCollections.Listing607;
/*ocpjp7*/


// This program shows how to use generics in your programs

class PairOfT<T> {
    T object1;
    T object2;

    PairOfT(T one, T two) {
        object1 = one;
        object2 = two;
    }

    public T getFirst() {
        return object1;
    }

    public T getSecond() {
        return object2;
    }
}