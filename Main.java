import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Егор", "Егоров", 4.5f);
        Student student2 = new Student("Иван", "Иванов", 3.6f);
        Student student3 = new Student("Петр", "Петров", 4.9f);

        List<Student> groupStudents = new ArrayList<>();
        groupStudents.add(student1);
        groupStudents.add(student2);
        groupStudents.add(student3);
        
        GroupStudent studentGroup = new GroupStudent(groupStudents);
        Iterator<Student> it = studentGroup.iterator();
        while (it.hasNext()) {
            Student el = it.next();
            System.out.println(el);
        }
        ListIterator<Student> lstIt = studentGroup.listIterator();
        while (lstIt.hasNext()) {
            Student el = lstIt.next();
            System.out.println(el);
            System.out.println(lstIt.nextIndex());
        }
        // System.out.println(studentGroup.getSize());
    }
}