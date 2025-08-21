import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // Add 10 sample students
        students.add(new Student(5, "Mikey", "Denver"));
        students.add(new Student(2, "Ant", "New York"));
        students.add(new Student(9, "Zara", "Miami"));
        students.add(new Student(1, "Brendan", "Los Angeles"));
        students.add(new Student(7, "Chris", "Houston"));
        students.add(new Student(4, "Nina", "Chicago"));
        students.add(new Student(10, "Oliver", "Dallas"));
        students.add(new Student(3, "Jordie", "Boston"));
        students.add(new Student(6, "Liz", "Seattle"));
        students.add(new Student(8, "Emma", "San Francisco"));

        System.out.println("Original List:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sort by name
        SelectionSort.selectionSort(students, new SortByName());
        System.out.println("\nSorted by Name:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sort by roll number
        SelectionSort.selectionSort(students, new SortByRollNo());
        System.out.println("\nSorted by Roll Number:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
