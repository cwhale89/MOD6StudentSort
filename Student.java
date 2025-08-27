/**
 * Represents a student with a roll number, name, and location.
 * Includes validation to ensure data integrity.
 */
public class Student {
    private int rollNo;
    private String name;
    private String location;

    /**
     * Constructs a Student object with the given details.
     *
     * @param rollNo   the student's roll number (must be positive)
     * @param name     the student's name (cannot be null or empty)
     * @param location the student's location (cannot be null or empty)
     * @throws IllegalArgumentException if invalid data is provided
     */
    public Student(int rollNo, String name, String location) {
        if (rollNo <= 0) {
            throw new IllegalArgumentException("Roll number must be positive.");
        }
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        if (location == null || location.trim().isEmpty()) {
            throw new IllegalArgumentException("Location cannot be null or empty.");
        }
        this.rollNo = rollNo;
        this.name = name;
        this.location = location;
    }

    /** @return the student's roll number */
    public int getRollNo() {
        return rollNo;
    }

    /** @return the student's name */
    public String getName() {
        return name;
    }

    /** @return the student's location */
    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "RollNo: " + rollNo + ", Name: " + name + ", Location: " + location;
    }
}
