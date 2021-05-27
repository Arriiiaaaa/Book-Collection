import ecs100.*;

/**
 * Support class of book
 * A book contains an id, name, author, quantity, image
 *
 * @author (13 DTC: Line 3)
 * @version (27/5/21)
 */
public class Book
{
    // instance variables
    private int id;
    private String name;
    private String author;
    private int quantity;
    private String image;
    private static final String DEFAULT_IMAGE = "book.png";
    private double locX, locY;
    
    
    /**
     * Constructor for objects of class Book
     */
    public Book(int id, String nm, String auth, int qty, String img)
    {
        // initialise instance variables
        this.id = id;
        this.name = nm;
        this.author = auth;
        this.quantity = qty;
        this.image = img;
    }

    /**
     * constructor overloading
     */
    public Book(int id, String nm, String auth, int qty) {
        this(id, nm, auth, qty, DEFAULT_IMAGE);
    }
    
    /**
     * Getter for ID
     *
     * @return int the id
     */
    public int getId() {
        return this.id;
    }
        /**
     * Getter for name
     *
     * @return int the id
     */
    public String getName() {
        return this.name;
    }
    /**
     * Getter for author
     *
     * @return int the id
     */
    public String getAuthor() {
        return this.author;
    }
        /**
     * Getter for quantity
     *
     * @return int the id
     */
    public int getQuantity() {
        return this.quantity;
    }
    
    /**
     * Display image on GUI
     */
    public void displayBook() {
        double locX = 100;
        double locY = 100;
        final double WIDTH = 100;
        final double HEIGHT = 100;
        
        UI.drawImage(this.image, locX, locY, WIDTH, HEIGHT);
        
    }
}
