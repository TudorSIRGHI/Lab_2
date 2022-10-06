public class Servant {
    private String name;
    private int age;
    private String region;

    public Servant(String name, int age, String region) {
        this.name = name;
        this.age = age;
        this.region = region;
    }
    public Alchemist declareServant(String name, int age, String region){
        System.out.println("New Alchimist of Liyue is " + name + "!");
        return new Alchemist(name, age, region);
    }
    public Blacksmith declareBlacksmith(String name, int age, String region){
        System.out.println("New Blacksmith of Liyue is " + name + "!");
        return new Blacksmith(name, age, region);
    }
    public Chef declareChef(String name, int age, String region){
        System.out.println("New Chef of Liyue is " + name + "!");
        return new Chef(name, age, region);
    }
    public Fisher declareFisher(String name, int age, String region){
        System.out.println("New Fisher of Liyue is " + name + "!");
        return new Fisher(name, age, region);
    }
    public Herbalist declareHerbalist(String name, int age, String region){
        System.out.println("New Herbalist of Liyue is " + name + "!");
        return new Herbalist(name, age, region);
    }
    public Miner declareMiner(String name, int age, String region){
        System.out.println("New Miner of Liyue is " + name + "!");
        return new Miner(name, age, region);
    }
    public String getName(){
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getRegion() {
        return region;
    }
}
