public class Fisher {
    private String name;
    private int age;
    private String region;

    public Fisher(String name, int age, String region) {
        this.name = name;
        this.age = age;
        this.region = region;
    }

    public String fishing(){
        return ("A good place to fishing!");
    }

    public void getStock(String stockf[]){
        System.out.println("Stock: " + stockf);
    }

    public String showStock(String stockf[]) {
        return "Stock: " + stockf;
    }

    public String sell(String stockf) {
        return "Sold " + stockf;
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
