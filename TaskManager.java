import java.io.*;
import java.util.*;

public class TaskManager {
    public List<String> tasks;
    private final String filePath = "tasks.txt";

    public TaskManager() {
        tasks = new ArrayList<>();
        loadTasks();
    }

    // Load tasks from the file
    private void loadTasks() {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                tasks.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error loading tasks: " + e.getMessage());
        }
    }

    // Save tasks to the file
    private void saveTasks() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (String task : tasks) {
                bw.write(task);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving tasks: " + e.getMessage());
        }
    }

    // Add task
    public void addTask(String task) {
        tasks.add(task);
        saveTasks();
        System.out.println("Task added: " + task);
    }

    // View all tasks
    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("Tasks List:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    // Mark task as completed
    public void markTaskCompleted(int taskIndex) {
        if (taskIndex >= 0 && taskIndex < tasks.size()) {
            String task = tasks.get(taskIndex);
            tasks.set(taskIndex, task + " - Completed");
            saveTasks();
            System.out.println("Task marked as completed: " + task);
        } else {
            System.out.println("Invalid task index.");
        }
    }

    // Delete a task
    public void deleteTask(int taskIndex) {
        if (taskIndex >= 0 && taskIndex < tasks.size()) {
            String task = tasks.get(taskIndex);
            tasks.remove(taskIndex);
            saveTasks();
            System.out.println("Task deleted: " + task);
        } else {
            System.out.println("Invalid task index.");
        }
    }
}

