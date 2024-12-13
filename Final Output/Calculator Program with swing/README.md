# Calculator Application

This is a simple calculator application with a Graphical User Interface (GUI) built using Java Swing. It supports basic arithmetic operations and includes additional features such as error handling, calculation history, and a modern dark theme.

## Features

### Graphical User Interface (GUI)
- Built using the Java Swing library for an interactive and responsive design.
- A modern dark theme with:
  - **Background:** Black
  - **Text:** White
  - **Buttons:** Styled with white borders and text for enhanced visibility.

### Arithmetic Operations
- Supports basic operations:
  - **Addition (+)**
  - **Subtraction (-)**
  - **Multiplication (*)**
  - **Division (/)**
- Handles numeric input and operations seamlessly using the on-screen buttons.

### Clear Functionality
- The **C** button clears all input, allowing users to reset the calculator.

### Equals Functionality
- The **=** button computes the result of the entered expression.

### Error Handling
- Displays an error message when invalid operations occur (e.g., division by zero).

### Calculation History
- Saves each calculation to a file named `calculator_history.txt` in the following format:
  ```css
  [Operand1] [Operator] [Operand2] = [Result]
