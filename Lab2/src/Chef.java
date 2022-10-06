public class Chef {
    private String name;
    private int age;
    private String region;

    public Chef(String name, int age, String region) {
        this.name = name;
        this.age = age;
        this.region = region;
    }

    public String coooking(){
        return (" I am cooking everything in this world!");
    }

    public void getStock(String stockc[]){
        System.out.println("Stock: " + stockc);
    }

    public String showStock(String stockc[]) {
        return "Stock: " + stockc;
    }

    public String sell(String stockc) {
        return "Sold " + stockc;
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
