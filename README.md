# Task Management Application

A simple yet effective Java-based console application for managing tasks. This project provides an intuitive command-line interface to add, view, mark as completed, and delete tasks. It also features data persistence, allowing tasks to be saved and loaded automatically, making it a practical tool for managing daily to-do lists or project tasks.

## Features
- **Add Tasks**: Add a new task by entering a description. Tasks are stored in memory and saved to a file for later retrieval.
- **View Tasks**: Display all current tasks in a neatly numbered list format, showing completed status.
- **Mark Tasks as Completed**: Mark any task as completed, and the application will automatically update the list to reflect the completed status.
- **Delete Tasks**: Remove any task from the list based on its position, with the changes saved to file.
- **Automatic Save and Load**: Tasks are saved to `tasks.txt` and reloaded every time the application starts, ensuring persistent data storage.

## Technologies Used
- **Java**: Core programming language used for logic, handling task management, and file operations.
- **File Handling**: Uses `BufferedReader` and `BufferedWriter` to store tasks persistently in a text file.
- **Collections (ArrayList)**: Stores tasks in an `ArrayList`, allowing easy indexing, retrieval, and modification of tasks.
- **Exception Handling**: Ensures robust error handling for file operations, providing user-friendly error messages.

## How to Run
1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/task-management-app.git

