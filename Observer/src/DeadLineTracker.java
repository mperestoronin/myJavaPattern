import java.util.ArrayList;
import java.util.List;

public class DeadLineTracker {
    private String deadlines;
    private List<Student> students = new ArrayList<>();

    public void addObserver(Student student) {
        this.students.add(student);
    }

    public void removeObserver(Student student) {
        this.students.remove(student);
    }

    public void setDeadlines(String deadlines) {
        this.deadlines = deadlines;
        for (Student student : this.students) {
            student.update(this.deadlines);
        }
    }
}
