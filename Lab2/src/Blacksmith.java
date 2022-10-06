
public class Blacksmith {
    private String name;
    private int age;
    private String region;

    public Blacksmith(String name, int age, String region) {
        this.name = name;
        this.age = age;
        this.region = region;
    }

    public void getStock(String stockb[]){
        System.out.println("Stock: " + stockb);
    }

    public String showStock(String stockb[]) {
        return "Stock: " + stockb;
    }

    public String sell(String stockb) {
        return "Sold " + stockb;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRegion() {
        return region;
    }
}