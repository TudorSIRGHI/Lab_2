public class Archon {
    private String name;
    private int age;
    private String region;

    public Archon(String name, int age, String region) {
        this.name = name;
        this.age = age;
        this.region = region;
    }

    public King declareKing(String name, int age , String region) {
        System.out.println("The new King of Liyue is " + name + " !");
        return new King(name, age, region);
    }

    public  String declarepower(){
        return "I am your GOD, your Archon and your future!";
    }

    public int createLand(){
        return (int) (Math.random()*255-(3*5));
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
