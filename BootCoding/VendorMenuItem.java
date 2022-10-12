public class VendorMenuItem {
    private long menutItemId;
    private String menuItem;
    private double price;
    private String category;
    private boolean isVeg;
    
    public long getMenutItemId() {
        return menutItemId;
    }
    public void setMenutItemId(long menutItemId) {
        this.menutItemId = menutItemId;
    }
    public String getMenuItem() {
        return menuItem;
    }
    public void setMenuItem(String menuItem) {
        this.menuItem = menuItem;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public boolean isVeg() {
        return isVeg;
    }
    public void setVeg(boolean isVeg) {
        this.isVeg = isVeg;
    }
    
}
