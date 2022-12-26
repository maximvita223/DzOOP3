import java.util.Iterator;
import java.util.List;

public class GroupStudentIterator implements Iterator<Student> {
    private List<Student> groupStudents;
    private Integer index = -1;

    public GroupStudentIterator(List<Student> groupStudents) {
        this.groupStudents = groupStudents;
    }
    @Override
    public boolean hasNext() {
        return index < groupStudents.size() - 1;
    }

    @Override
    public Student next() {
        return groupStudents.get(++index);
    }

}
