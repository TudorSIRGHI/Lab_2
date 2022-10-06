public class NPC {
    private String name;
    private int age;
    private String region;

    public NPC(String name, int age, String region) {
        this.name = name;
        this.age = age;
        this.region = region;
    }

    public String coooking(){
        return ("Oh,shit, I am late to work");
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
