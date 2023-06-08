package restaurant;


import java.time.LocalDateTime;

public class Menu {
  private String menuName;
  private LocalDateTime lastUpdated;

  public Menu(String menuName){
      this.menuName = menuName;
      this.lastUpdated = LocalDateTime.now();
  }
  public String getMenuName(){
      return menuName;
    }
    public LocalDateTime getLastUpdated(){
      return lastUpdated;
    }
    public void setLastUpdated(){
      this.lastUpdated = LocalDateTime.now();
    }

    public static void main(String args[]){
      Menu danBam = new Menu("DanBam (따뜻한 밤)");
      MenuItem gimmari = new MenuItem("appetizer","Gimmari (김말이)", "Deliciously crispy seaweed noodle rolls " +
              "made of glass noodles rolled in seaweed paper (gim) and then deep fried.", "$6", false);
      MenuItem tteokbokki = new MenuItem("main course", "Tteokbokki (떡볶이)", "A popular street dish in Korea--" +
              "This dish is sweet, savory, and spicy and has a mild, garlicky aftertaste. Made from small-sized garae-tteok (rice cakes), " +
              "eomuk (fish cakes), boiled eggs, and scallions. Seasoned to perfection with house-made gochujang. (this one is spicy!!)", "$14", false);
      MenuItem hotteok = new MenuItem("dessert", "Hotteok (호떡)", "Chewy, sweet pancakes chock full of warm flavors. " +
              "When you break into their crispy outer shell, you’ll find a delicious filling made from cinnamon, brown sugar, and chopped walnuts." +
              " (NUT ALLERGEN WARNING)", "$9", true);
      System.out.println("Welcome to " + danBam.menuName + "\n");
      System.out.println(gimmari.getPrice()+ " "+ gimmari.getName()+ ": \n"+ gimmari.getType()+"\n"+ gimmari.getDescription() +"\n" );
      System.out.println(tteokbokki.getPrice()+ " "+ tteokbokki.getName()+ ": \n"+ tteokbokki.getType()+"\n"+ tteokbokki.getDescription() +"\n" );
      System.out.println(hotteok.getPrice()+ " "+ hotteok.getName()+ ": \n"+ hotteok.getType()+"\n"+ hotteok.getDescription() +"\n" +"");
      System.out.println("Menu was updated on "+ danBam.lastUpdated);
      System.out.println("geonbae & jeongmal gomapseumnida!!!");
    }
}
