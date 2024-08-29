import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<Task> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String title) {
        tasks.add(new Task(title));
    }

    public void removeTask(int index) {
        tasks.remove(index);
    }

    public void markTaskAsCompleted(int index) {
        tasks.get(index).markAsCompleted();
    }

    public void printTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            System.out.println((i + 1) + ". " + task.getTitle() + " ["
                    + (task.isCompleted() ? "Completed" : "Incomplete") + "]");
        }
    }
}
