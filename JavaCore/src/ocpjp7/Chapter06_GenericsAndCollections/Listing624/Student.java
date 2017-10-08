package ocpjp7.Chapter06_GenericsAndCollections.Listing624;
/*ocpjp7*/


// This program shows the usage of Comparable interface

class Student implements Comparable<Student> {
    String id;
    String name;
    Double cgpa;

    public Student(String studentId, String studentName, double studentCGPA) {
        id = studentId;
        name = studentName;
        cgpa = studentCGPA;
    }

    public String toString() {
        return " \n " + id + "  \t  " + name + "  \t  " + cgpa;
    }

    public int compareTo(Student that) {
        return this.id.compareTo(that.id);
    }
}
 
