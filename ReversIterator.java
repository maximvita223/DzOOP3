import java.util.Iterator;

public class ReversIterator implements Iterator<Student> {

	private GroupStudent studentGroup;
	private int index;

	public ReversIterator(GroupStudent studentGroup) {
		this.studentGroup = studentGroup;
		this.index = studentGroup.getSize();
	}

	@Override
	public boolean hasNext() {
		return index > 0;
	}

	@Override
	public Student next() {
		return studentGroup.get(--index);
	}
}
