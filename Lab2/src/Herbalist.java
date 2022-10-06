public class Herbalist {
    private String name;
    private int age;
    private String region;

    public Herbalist(String name, int age, String region) {
        this.name = name;
        this.age = age;
        this.region = region;
    }

    public String colectingflowers(){
        return ("This is a rare type of flower, DragonFlower!");
    }

    public void getStock(String stockh[]){
        System.out.println("Stock: " + stockh);
    }

    public String showStock(String stockh[]) {
        return "Stock: " + stockh;
    }

    public String sell(String stockh) {
        return "Sold " + stockh;
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
