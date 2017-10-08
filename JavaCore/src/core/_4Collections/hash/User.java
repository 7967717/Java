package core._4Collections.hash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author roman on 3/17/17.
 */
public class User {
    public User(int id) {
        this.id = id;
    }

    int id;

    @Override
    public boolean equals(Object o) {
        return id == ((User)o).id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        Set<User> set = new HashSet<>();
        set.add(new User(100));
        set.add(new User(100));
        for (User u : set) {
            System.out.println(u);
        }

    }
}