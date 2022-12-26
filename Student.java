public class Student {
    private String firstName;
    private String lastName;
    private Float averageRating;

    public Student(String firstName, String lastName, Float averageRating) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.averageRating = averageRating;
    }

    @Override
    public String toString() {
        return "Student [firstName=" + firstName + ", lastName=" + lastName + ", averageRating=" + averageRating + "]";
    }

}
