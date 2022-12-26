import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class GroupStudent implements Iterable<Student> {
    List<Student> students = new ArrayList<Student>();

    public GroupStudent(List<Student> students) {
        this.students = students;
    }

    public int getSize() {
        return students.size();
    }

    public Student get(int index) {
        return students.get(index);
    }

    public void add(Student student) {
        students.add(student);
    }

    public void set(Student student) {
        students.set(0, student);
    }

    // @Override
    // // public Iterator<Student> iterator() {
    // // return new GroupListIterator(this);
    // }
    public ListIterator<Student> listIterator() {
        return new GroupListIterator(this);
    }

    @Override
    public Iterator<Student> iterator() {

        return new ReversIterator(this);
    }

    @Override
    public String toString() {
        return "StudentGroup [students=" + students + "]";
    }

}