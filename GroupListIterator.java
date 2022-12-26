import java.util.ListIterator;

public class GroupListIterator implements ListIterator<Student> {
    private int index = -1;
    private GroupStudent studentList;
    

    public GroupListIterator(GroupStudent studentList) {
        this.studentList = studentList;
    }

    @Override
    public boolean hasNext() {
        return index < studentList.getSize() - 1;
    }

    @Override
    public boolean hasPrevious() {
        return index > 0;
    }

    @Override
    public Student next() {
        index++;
        return studentList.get(index);
    }

    @Override
    public int nextIndex() {
        index++;
        return index;
    }

    @Override
    public Student previous() {
        index--;
        return studentList.get(index);
    }

    @Override
    public int previousIndex() {
        index--;
        return index;
    }

    @Override
    public void add(Student e) {
        studentList.add(e);

    }

    @Override
    public void set(Student e) {

        studentList.set(e);
    }

    @Override
    public void remove() {

    }

}