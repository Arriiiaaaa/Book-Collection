import java.util.HashMap;
import ecs100.*;
/**
 * Holds a collection of books in a hash map
 * Allows user to add, find, print all, edit from a menue
 * Delete if we have time
 * Prevent user from adding a duplicate?
 *
 * @author (13 DTC: Line 3)
 * @version (27/5/21)
 */
public class Books
{
    // instance variables
    private HashMap<Integer, Book> booksMap;    // Declaring the hash map // Makes space for hash map
    private int currentBookId;  // Store current id of book being added
    

    /**
     * Constructor for objects of class Books
     */
    public Books()
    {
        // initialise instance variables
        booksMap = new HashMap<Integer, Book>(); // intitialise hash map // Creates hash map
        
        // creating book
        Book b1 = new Book(1, "Pet Semetary", "Stephen King", 76);
        Book b2 = new Book(2, "1984", "George Orwell", 66);
        Book b3 = new Book(3, "The subtle knife", "Phillip Pullman", 42);
        Book b4 = new Book(4, "The subtle art of not giving a fuck", "Mark Mason", 99);
        
        // add books to hashmap
        booksMap.put(1, b1);
        booksMap.put(2, b2);
        booksMap.put(3, b3);
        booksMap.put(4, b4);
        
        this.currentBookId = 4; // Initialise book id
        
        this.menu();
    }
    
    public void addBook() {
        final int MAX_QUANTITY = 99;
        int quantity = -1;
        
        //ask user for details
        String name = UI.askString("Title: ");
        String author = UI.askString("Author: ");
        
        do {
            quantity = UI.askInt("Quantity: ");
        } while (0 > quantity || quantity > MAX_QUANTITY);
        
        // Add a book image for display in the GUI
        String imgFileName = UIFileChooser.open("Choose image file: ");
        
        // Increment the book ID counter and add book to hashmap
        this.currentBookId ++;
        booksMap.put(currentBookId, new Book(currentBookId, name, author, quantity, imgFileName));
    }
    
    /**
     * Find a book in map from id
     * Should refactor to find name
     */
    public void findBook() {
        int bookId = UI.askInt("Id: "); // finds book on ID - change to title
        booksMap.get(bookId).getName(); // prints out book name
        booksMap.get(bookId).displayBook(); // Shows book c
    }
    
    /**
     * prints details of all books
     */
    public void printAll() {
        for (int bookId : booksMap.keySet()) {
            UI.println(bookId + "Details: ");
            UI.println(booksMap.get(bookId).getName() + " "
                    + booksMap.get(bookId).getAuthor() + " "
                    + booksMap.get(bookId).getQuantity() + " ");
            
        }
    }
    
    /**
     * menu to print and call appropriate methods
     */
    public void menu() {
        //Print menu and force choice
        String choice;
        do {
            UI.println("(A)dd a book");
            UI.println("(F)ind a book");
            UI.println("(P)rint all");
            UI.println("(Q)uit");
            
            choice = UI.askString("Enter a choice: ");
            
            if (choice.equalsIgnoreCase("A")) {    
                addBook();
            }
            else if (choice.equalsIgnoreCase("F")) {    
                findBook();
            }
            else if (choice.equalsIgnoreCase("P")) {   
                printAll();
            }
            else if (choice.equalsIgnoreCase("Q")) {  
                UI.println("Goodbye!");
                UI.quit();
            }
            else {
                UI.println("This is not a choiceee");
            }
        } while (!choice.equalsIgnoreCase("Q"));
        
    }
}

