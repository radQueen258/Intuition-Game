# Intuition Game

## Overview
This is a Java-based number guessing game inspired by a shell script. The program generates random numbers and tracks user input to calculate hit and miss percentages. It uses color-coded output to enhance readability in the terminal.

## Prerequisites
- **Java Development Kit (JDK):** Version 8 or higher
- **Operating System:** Linux (tested on Ubuntu 24.04) or any OS with a terminal
- **Terminal:** Bash shell version 5.2 or higher
- **Text Editor/IDE:** VS Code or similar

## How to Compile and Run

1. **Download the Code**
   Save the code in a file named `Intuition.java`.

2. **Navigate to the Directory**
   Open a terminal and navigate to the directory containing `Intuition.java`. For example:
   ```bash
   cd /path/to/your/directory
   ```

3. **Compile the Program**
   Compile the Java file using `javac`:
   ```bash
   javac Intuition.java
   ```
   - This will generate a `Intuition.class` file in the same directory.

4. **Run the Program**
   Execute the program using:
   ```bash
   java Intuition
   ```

5. **Optional: Using Packages**
   If the code includes a `package` declaration (e.g., `package intuitio;`), ensure that:
   - The file `Intuition.java` is located in a directory matching the package name (e.g., `intuitio/`).
   - Compile the program from the parent directory:
     ```bash
     javac intuitio/Intuition.java
     ```
   - Run the program using the fully qualified class name:
     ```bash
     java intuitio.Intuition
     ```

## Gameplay Instructions
1. **Start the Program**:
   The program will display the current step and prompt you to:
   - Enter a number between 0 and 9.
   - Type `q` to quit the game.

2. **Game Output**:
   - The program will inform you if your guess was correct ("Hit") or incorrect ("Miss").
   - It will display statistics:
     - Hit percentage
     - Miss percentage
   - The last 10 random numbers will be displayed:
     - Correct guesses in **green**.
     - Missed guesses in **red**.

3. **Quit the Game**:
   To exit, simply type `q` when prompted.

## Example Output
### Hit Scenario
```
Step: 5
Please enter number from 0 to 9 (q - quit): 4
Hit! My number: 4
Hit: 40.0% Miss: 60.0%
Numbers: 7 3 5 6 4
```

### Miss Scenario
```
Step: 6
Please enter number from 0 to 9 (q - quit): 8
Miss! My number: 2
Hit: 33.3% Miss: 66.7%
Numbers: 7 3 5 6 4 2
```

### Invalid Input
```
Step: 7
Please enter number from 0 to 9 (q - quit): 20
Input error!
Please enter number from 0 to 9 (q - quit):
```

## Troubleshooting
- **Error: `Could not find or load main class`**:
  - Ensure the file name is `Intuition.java`.
  - Compile and run from the correct directory.
  - If using packages, ensure the directory matches the package name.

- **No Color Output**:
  - Verify your terminal supports ANSI color codes.
  - For unsupported terminals, you can remove color codes from the code.

## License
This project is for educational purposes and is free to use and modify.

