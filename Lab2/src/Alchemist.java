public class Alchemist {
    private String name;
    private int age;
    private String region;

    public Alchemist(String name, int age, String region) {
        this.name = name;
        this.age = age;
        this.region = region;
    }

    public void getStock(String stocka[]){
        System.out.println("Stock: " + stocka);
    }

    public String showStock(String stocka[]){
        return "Stock: " + stocka;
    }

    public String sell(String stocka){
        return "Sold " + stocka;
    }

    public boolean verifypoison() {
        if(Math.random() > 0.5) {
            System.out.println("Poison is not danger!");
            return true;
        } else {
            System.out.println("Poison is danger!");
            return false;
        }
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
