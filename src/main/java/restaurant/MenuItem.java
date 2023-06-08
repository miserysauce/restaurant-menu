package restaurant;

public class MenuItem {
    private String type;
    private String name;
    private String description;
    private String price;
    private boolean newItem;

    public MenuItem(String type, String name, String description, String price, boolean newItem) {
        this.type = type;
        this.name = name;
        this.description = description;
        this.price = price;
        this.newItem = newItem;
    }

    public String getType() {
        return type;
    }

    public void setType() {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }
    public String getDescription(){return description;}
    public void setDescription(){
        this.description = description;
    }
    public String getPrice(){
        return price;
    }
    public void setPrice(){
        this.price = price;
    }
    public boolean isNewItem(){
        return newItem;
    }

    public void setNewItem(){
        this.newItem = newItem;
    }

}
