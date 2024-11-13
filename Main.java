import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        while (true) {
            System.out.println("\nTask Management Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String task = scanner.nextLine();
                    taskManager.addTask(task);
                    break;

                case 2:
                    taskManager.viewTasks();
                    break;

                case 3:
                    taskManager.viewTasks();
                    if (!taskManager.tasks.isEmpty()) {
                        System.out.print("Enter task number to mark as completed: ");
                        int taskNumber = scanner.nextInt();
                        taskManager.markTaskCompleted(taskNumber - 1); // Adjust for 0-based index
                    }
                    break;

                case 4:
                    taskManager.viewTasks();
                    if (!taskManager.tasks.isEmpty()) {
                        System.out.print("Enter task number to delete: ");
                        int taskNumber = scanner.nextInt();
                        taskManager.deleteTask(taskNumber - 1); // Adjust for 0-based index
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
