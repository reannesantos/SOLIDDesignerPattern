// LibraryResource interface
public interface LibraryResource {
    String getTitle();
}

// Book class
public class Book implements LibraryResource {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }
}

// Journal class
public class Journal implements LibraryResource {
    private String title;

    public Journal(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }
}

// AudioBook class
public class AudioBook implements LibraryResource {
    private String title;

    public AudioBook(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }
}

// Student class
public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void borrowResource(LibraryResource resource) {
        System.out.println("Borrowing " + resource.getTitle() + " by " + name);
    }
}

// Test program
public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student("John Doe");

        Book book = new Book("Java Programming");
        student.borrowResource(book); // Output: Borrowing Java Programming by John Doe

        Journal journal = new Journal("Nature");
        student.borrowResource(journal); // Output: Borrowing Nature by John Doe

        AudioBook audioBook = new AudioBook("The Great Gatsby");
        student.borrowResource(audioBook); // Output: Borrowing The Great Gatsby by John Doe
    }
}