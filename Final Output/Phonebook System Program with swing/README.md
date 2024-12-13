# Phonebook System

A simple phonebook application with a Graphical User Interface (GUI) for managing contacts. Built using Java Swing for an interactive and user-friendly experience.

---

## Features

### **Graphical User Interface (GUI)**
- Designed with the Swing library.
- Includes a text input area, buttons, and a display area for managing the phonebook.

### **Contact Management**
- **Add Contact**: Add a new contact with a name and phone number.
- **Delete Contact**: Remove a contact by name.
- **Search Contact**: Find a contact by name.
- **Update Contact**: Modify the phone number of an existing contact.
- **Display Contacts**: View all saved contacts in the phonebook.

### **Data Persistence**
- Contacts are saved to and loaded from a file named `phonebook.txt`.
- File operations utilize `BufferedReader` and `BufferedWriter` for efficient I/O handling.

### **Validation**
- Ensures phone numbers contain only digits with the help of an `InputVerifier`.

### **Styling**
- Implements a dark theme:
  - **Background**: Black
  - **Text**: White
- Buttons and input fields are styled consistently for a clean interface.

### **User Notifications**
- Provides feedback messages for actions using `JOptionPane`, such as:
  - "Contact deleted successfully!"
  - "Contact not found!"

---

## How to Run

### **Prerequisites**
- Install Java Development Kit (JDK) version 8 or higher.
- Ensure the `phonebook.txt` file exists in the program's directory. (If it doesn't exist, the program will create it automatically.)

### **Steps**
1. **Compile the Program**:
   - Open a terminal or command prompt.
   - Navigate to the directory containing the source file (e.g., `PhonebookSystem.java`).
   - Run the command:
     ```bash
     javac PhonebookSystem.java
     ```

2. **Run the Program**:
   - Execute the compiled program:
     ```bash
     java PhonebookSystem
     ```

3. **Using the Program**:
   - Enter a name and phone number in the input fields to add a contact.
   - Use the buttons for various operations:
     - **Add**: Add the contact.
     - **Delete**: Remove a contact by the entered name.
     - **Search**: Find and display a contact by name.
     - **Update**: Change the phone number of a contact by the entered name.
     - **Display**: View all contacts in the text area.

---

## Files and Data
- All contacts are stored in `phonebook.txt`.
- The file can be manually opened to view or edit contacts if necessary.
