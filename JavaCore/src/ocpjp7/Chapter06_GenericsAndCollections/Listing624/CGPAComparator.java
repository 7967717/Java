package ocpjp7.Chapter06_GenericsAndCollections.Listing624;
/*ocpjp7*/


// This program shows the implementation of Comparator interface

import java.util.Comparator;

class CGPAComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return (s1.cgpa.compareTo(s2.cgpa));
    }
}
