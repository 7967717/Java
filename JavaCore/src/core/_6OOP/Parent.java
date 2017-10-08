package core._6OOP;

/**
 * Created by RomanR on 03-Jun-14.
 */
public class Parent {
    Parent(){}

    Parent(int i){}

    private Parent test(){
        return new Parent();
    }

    private Child test(int i){
        return new Child();
    }
}

class Child extends Parent{
    Child(){
        super();
    }
}
