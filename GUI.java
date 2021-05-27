import ecs100.*;
/**
 * Class to handle the gui functionality
 *
 * @author (13DTC: Line 3)
 * @version (27/5/21)
 */
public class GUI
{
    public GUI() {
        Books bk = new Books();
        UI.initialise();
        UI.addButton("Print All", bk::printAll);
        UI.addButton("Find Book", bk::findBook);
        UI.addButton("Add Book", bk::addBook);
        UI.addButton("Quit", UI::quit);
        
    }
}
