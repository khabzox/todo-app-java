import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            TodoList todoList = new TodoList();

            while (true) {
                System.out.println("1. Add Task");
                System.out.println("2. Remove Task");
                System.out.println("3. Mark Task as Completed");
                System.out.println("4. View Tasks");
                System.out.println("5. Exit");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline

                switch (choice) {
                    case 1:
                        System.out.println("Enter task title:");
                        String title = scanner.nextLine();
                        todoList.addTask(title);
                        break;
                    case 2:
                        System.out.println("Enter task number to remove:");
                        int removeIndex = scanner.nextInt();
                        todoList.removeTask(removeIndex - 1);
                        break;
                    case 3:
                        System.out.println("Enter task number to mark as completed:");
                        int completeIndex = scanner.nextInt();
                        todoList.markTaskAsCompleted(completeIndex - 1);
                        break;
                    case 4:
                        todoList.printTasks();
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice");
                }
            }
        }
    }
}
