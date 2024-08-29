import java.util.Scanner;

public class Main {
    // ANSI escape codes for colors
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String CYAN = "\u001B[36m";

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            TodoList todoList = new TodoList();

            while (true) {
                System.out.println(CYAN + "====== TODO APP ======" + RESET);
                System.out.println(GREEN + "1. Add Task" + RESET);
                System.out.println(YELLOW + "2. Remove Task" + RESET);
                System.out.println(BLUE + "3. Mark Task as Completed" + RESET);
                System.out.println(RED + "4. View Tasks" + RESET);
                System.out.println(CYAN + "5. Exit" + RESET);
                System.out.println(CYAN + "======================" + RESET);
                System.out.print("Choose an option: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter task title: ");
                        String title = scanner.nextLine();
                        System.out.print("Enter due date (YYYY-MM-DD): ");
                        String dueDate = scanner.nextLine();
                        todoList.addTask(title, dueDate);
                        System.out.println(GREEN + "Task added successfully!" + RESET);
                        break;
                    case 2:
                        System.out.print("Enter task number to remove: ");
                        int removeIndex = scanner.nextInt();
                        todoList.removeTask(removeIndex - 1);
                        System.out.println(YELLOW + "Task removed!" + RESET);
                        break;
                    case 3:
                        System.out.print("Enter task number to mark as completed: ");
                        int completeIndex = scanner.nextInt();
                        todoList.markTaskAsCompleted(completeIndex - 1);
                        System.out.println(BLUE + "Task marked as completed!" + RESET);
                        break;
                    case 4:
                        todoList.printTasks();
                        break;
                    case 5:
                        System.out.println(RED + "Exiting..." + RESET);
                        return;
                    default:
                        System.out.println(RED + "Invalid choice" + RESET);
                }
            }
        }
    }
}
