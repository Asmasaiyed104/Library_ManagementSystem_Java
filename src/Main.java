//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("*********************************************");
        System.out.println("Welcome to my Library Management System");

        // Create an instance of LibraryManagementSystem
        LibraryManagementSystem library = new LibraryManagementSystem();

        // Add books
        library.addBook("Java", "Asma", "1234", 12);
        library.addBook("Database", "Fayza", "2234", 22);
        library.addBook("Linux","Noumu","3345",23);

        // Add members
        library.addMember(1234, "Asma");
        library.addMember(2234, "Fayza");
        library.addMember(3345,"Nouman");

        // Display all books
        library.displayAllBooks();

        // Display all members
        library.displayAllMembers();
    }
}
