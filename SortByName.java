import java.util.Comparator;

/**
 * Comparator for sorting students alphabetically by name (case-insensitive).
 */
public class SortByName implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareToIgnoreCase(s2.getName());
    }
}
