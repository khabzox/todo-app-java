public class Task {
    private String title;
    private boolean isCompleted;
    private String dueDate;

    public Task(String title, String dueDate) {
        this.title = title;
        this.dueDate = dueDate;
        this.isCompleted = false;
    }

    // Getter and setter methods for dueDate
    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    // Other existing methods (getters, setters, etc.)
    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void markAsCompleted() {
        isCompleted = true;
    }

    @Override
    public String toString() {
        return title + " (Due: " + dueDate + ") " + (isCompleted ? "[Completed]" : "[Pending]");
    }
}
