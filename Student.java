public class Student {
    int rollno;
    String name;
    String address;

    // Constructor
    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    // toString() for easy printing
    @Override
    public String toString() {
        return rollno + " - " + name + " - " + address;
    }
}
