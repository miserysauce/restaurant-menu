package restaurant;


import java.time.LocalDateTime;
import java.util.ArrayList;

public class Menu {
    //attributes:
    private String menuName;
    private LocalDateTime lastUpdated;

    private ArrayList<MenuItem> menuItems;

    //Constructor:
    public Menu(String menuName) {
        this.menuName = menuName;
        this.lastUpdated = LocalDateTime.now();
        menuItems = new ArrayList<>();
    }

    //Getters & Setters:
    public String getMenuName() {
        return menuName;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated() {
        this.lastUpdated = LocalDateTime.now();
    }
//Methods:

    //adds items to menu:
    public void addMenuItem(MenuItem menuItem) {
        if (isDuplicate(menuItem)) {
            System.out.println("Warning: " + menuItem.getName() + " Menu item already exists!");
            System.exit(1);
        } else {
            menuItems.add(menuItem);
        }
    }

    //checks if item already exists:
    private boolean isDuplicate(MenuItem menuItem) {
        for (MenuItem item : menuItems) {
            if (item.getName().equals(menuItem.getName())) {
                return true;
            }
        }
        return false;
    }

    //removes a menu item:
    public void removeMenuItem(MenuItem menuItem) {
        menuItems.remove(menuItem);
    }

    //prints all menu items:
    public void printMenuItems() {
        for (MenuItem item : menuItems) {
            System.out.println(item.getPrice() + " " + item.getName() + ": \n" + item.getType() + "\n" + item.getDescription() + "\n");
        }
    }

    public void printSingleMenuItem(MenuItem itemName) {
        for (MenuItem item : menuItems) {
            if (item.getName().toString().equals(itemName.getName().toString())) {
                System.out.println(item.getPrice() + " " + item.getName() + ": \n" + item.getType() + "\n" + item.getDescription() + "\n");
                return;
            }
        } //if item doesn't exist print:
        System.out.println("Menu item " + "\"" + itemName.getName() + "\"" + " was not found.");
    }

    //prints the whole menu:
    public void printMenu() {
        System.out.println("Welcome to " + this.menuName + "\n");
        this.printMenuItems();
        System.out.println("geonbae & jeongmal gomapseumnida!!!");
        System.out.println("Menu was last updated on " + this.lastUpdated);
    }

    //checks to see if item is new and prints message:
    public void newOrClassicItem(MenuItem menuItem) {
        for (MenuItem item : menuItems) {
            if (item.getName().equals(menuItem.getName())) {
                if (item.isNewItem()) {
                    System.out.println(item.getName() + " is a new item!");
                } else {
                    System.out.println(item.getName() + " is not a new item, but a beloved staple.");
                }
            }
        }
    }

    public static void main(String args[]) {
        Menu danBam = new Menu("DanBam (따뜻한 밤)");
        MenuItem gimmari = new MenuItem("appetizer", "Gimmari (김말이)", "Deliciously crispy seaweed noodle rolls " +
                "made of glass noodles rolled in seaweed paper (gim) and then deep fried.", "$6", false);
        MenuItem tteokbokki = new MenuItem("main course", "Tteokbokki (떡볶이)", "A popular street dish in Korea--" +
                "This dish is sweet, savory, and spicy and has a mild, garlicky aftertaste. Made from small-sized garae-tteok (rice cakes), " +
                "eomuk (fish cakes), boiled eggs, and scallions. Seasoned to perfection with house-made gochujang. (this one is spicy!!)", "$14", false);
        MenuItem hotteok = new MenuItem("dessert", "Hotteok (호떡)", "Chewy, sweet pancakes chock full of warm flavors. " +
                "When you break into their crispy outer shell, you’ll find a delicious filling made from cinnamon, brown sugar, and chopped walnuts." +
                " (NUT ALLERGEN WARNING)", "$9", true);
//Create a Menu Item outside of danBam:
        MenuItem abalonePorridge = new MenuItem("main course", "Abalone Porridge (명진전복)", "Abalone porridge (jeonbokjuk) is known as the “king of porridges” in Korea. " +
                "Not only is it creamy, savory, delicious, hearty, and satisfying, but full of good minerals and vitamins, too. Made with Abalone, rice, carrots, onions & " +
                "baby bella mushrooms. Seasoned with soy sauce, Sesame Oil and Sesame Seeds.", "$18", true);
//Add items to menu:
          danBam.addMenuItem(gimmari);
          danBam.addMenuItem(tteokbokki);
          danBam.addMenuItem(hotteok);
// Uncomment to test duplicate menu addition:
//          danBam.addMenuItem(tteokbokki);

// Uncomment to test printing all menu items:
//          danBam.printMenuItems();

// Uncomment to test removing a menu item:
//          danBam.removeMenuItem(tteokbokki);

// Uncomment to test printing a single menu item:
//          danBam.printSingleMenuItem(tteokbokki);

// Uncomment to test functionality for checking if item is new or classic:
//          danBam.newOrClassicItem(tteokbokki);

// Uncomment to test functionality for item menu not found:
//          danBam.printSingleMenuItem(abalonePorridge);
// Uncomment to print out the abalone porridge item for fun =) :
//          System.out.println(abalonePorridge.getPrice() + " " + abalonePorridge.getName() + ": \n" + abalonePorridge.getType() + "\n" + abalonePorridge.getDescription() + "\n");

// Uncomment to Print the full menu:
//          danBam.printMenu();


    }
}
