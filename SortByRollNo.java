import java.util.Comparator;

/**
 * Comparator for sorting students by roll number in ascending order.
 */
public class SortByRollNo implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getRollNo(), s2.getRollNo());
    }
}
