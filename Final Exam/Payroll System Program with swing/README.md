# Payroll System

A simple payroll management system built using Java Swing. This system allows users to manage employee payroll data, including adding employees, calculating their pay, saving records, and displaying them. The program uses a graphical user interface (GUI) for easy interaction.

## Features

### GUI Design
- **Main Window:** Uses `JFrame` with a border layout.
- **Top Panel (`inputPanel`):** 
  - Input fields for Employee ID, Name, Hourly Rate, and Hours Worked.
  - Buttons to add an employee or calculate their pay.
- **Central Area (`tablePanel`):**
  - Displays a `JTable` with columns for Employee ID, Name, Hourly Rate, Hours Worked, Gross Pay, and Net Pay.
- **Bottom Panel (`buttonsPanel`):**
  - Buttons for saving payroll records and displaying all records in the table.

### Employee Management
- **Add Employee:** 
  - Adds a new employee to the payroll list with their details (Employee ID, Name, Hourly Rate, Hours Worked).
  - Automatically calculates Gross Pay and Net Pay (Net Pay is 80% of Gross Pay).
- **Calculate Pay:** 
  - Calculates Gross Pay and Net Pay based on the employee's hourly rate and hours worked.
  - Displays the result in a message dialog.
- **Save Record:** 
  - Saves all payroll records to a text file (`payroll.txt`), ensuring data persists between sessions.
- **Display Records:** 
  - Displays all saved payroll records in the table.

### File Operations
- **Load Records:** 
  - On startup, the program attempts to load existing payroll records from the `payroll.txt` file into memory and displays them in the table.
- **Save Records:** 
  - Saves all payroll records in memory to `payroll.txt`, appending each record on a new line.

### Styling
- **Buttons:** 
  - Custom colors and fonts for better visual appeal.
- **Table:** 
  - Alternating row colors for improved readability.
- **Button Hover Effects:** 
  - Buttons change color when hovered over for a more interactive experience.

### Error Handling
- **Missing Information:** 
  - If required fields are empty when adding an employee, an error message is shown.
- **Duplicate Employee ID:** 
  - Prevents adding an employee with an existing ID.
- **Invalid Input:** 
  - Shows an error message if the user enters non-numeric values in fields expecting numbers.

## How to Run the Program

### Requirements:
- Java must be installed on your machine.
- A Java IDE (e.g., IntelliJ IDEA, Eclipse) or a text editor to compile and run the code.

### Steps:
1. Save the provided code in a Java file, e.g., `PayrollSystem.java`.
2. Open your terminal or IDE's console.
3. Navigate to the directory containing the file.
4. Compile the program:
    ```bash
    javac PayrollSystem.java
    ```
5. Run the compiled class:
    ```bash
    java PayrollSystem
    ```
6. The Payroll System GUI will appear, and you can start interacting with the system by:
   - Adding employees.
   - Calculating pay.
   - Displaying records.
   - Saving records.

### Additional Notes:
- **Payroll File (`payroll.txt`):** 
  - The system uses this file to persist employee records. Ensure that the program has read and write permissions for this file.
- **Swing Components:** 
  - The program uses `JTextField` for input fields, `JTable` for displaying records, and `JButton` components for user interactions.
- **Error Handling:** 
  - The program handles errors such as missing or invalid inputs, and duplicate employee IDs by displaying appropriate message dialogs.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
