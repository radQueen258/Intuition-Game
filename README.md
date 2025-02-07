### README: How to Run the `intuition` Script on Ubuntu

How to run the `intuition` game script on an Ubuntu machine.

---

### **1. Prerequisites**
- A Unix-like operating system (e.g., Ubuntu 24.04 or later).
- `bash` version 5.2 or higher installed.

---

### **2. Steps to Run the Script**

#### **Step 1: Save the Script**
1. Copy the script code provided.
2. Open the terminal and create the file:
   ```bash
   nano intuition
   ```
3. Paste the script code into the file.
4. Save and exit:
   - Press `Ctrl + X`.
   - Type `Y` to confirm saving.
   - Press `Enter` to save the file as `intuition`.

---

#### **Step 2: Make the Script Executable**
Grant execute permissions to the script:
```bash
chmod +x intuition
```

---

#### **Step 3: Run the Script**
Run the script using:
```bash
./intuition
```

---

### **3. How to Play**
- **Input a number**: Enter a number between 0 and 9 when prompted.
- **Quit the game**: Enter `q` to exit the script at any time.
- The game will display whether your guess was correct, the random number, and statistics for hits and misses.

---

### **4. Expected Output**
- **Correct guess**: 
  ```
  Hit! My number: 5
  Hit: 40% Miss: 60%
  Numbers: 7 5 2 2 1 9 4 7 8 5
  ```
- **Incorrect guess**:
  ```
  Miss! My number: 8
  Hit: 30% Miss: 70%
  Numbers: 7 5 2 2 1 9 4 7 8 5
  ```
- **Invalid input**:
  ```
  Input error! Please enter a number from 0 to 9 or 'q' to quit.
  ```

---

### **5. Notes**
- The game keeps track of the last 10 random numbers.
- Numbers you guessed correctly are displayed in **green**.
- Numbers you missed are displayed in **red**.

Enjoy the game! 🎉
