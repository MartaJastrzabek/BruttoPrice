public class Product {
    private String name;
    private String description;
    private double priceNetto;
    private String category;

    public Product(String name, String description, double priceNetto, String category) {
        this.name = name;
        this.description = description;
        this.priceNetto = priceNetto;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPriceNetto() {
        return priceNetto;
    }

    public void setPriceNetto(double priceNetto) {
        this.priceNetto = priceNetto;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getInfo(){
        return name + ", " + description + ", " + category + ", cena netto " + priceNetto;
    }


}
