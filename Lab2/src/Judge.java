public class Judge {
    private String name;
    private int age;
    private String region;

    public Judge(String name, int age, String region) {
        this.name = name;
        this.age = age;
        this.region = region;
    }

    public String newlaw(){
        return ("In our Land appear new law!");
    }

    public boolean judge() {
        if(Math.random() > 0.5) {
            System.out.println("Guilty!");
            return true;
        } else {
            System.out.println("Not guilty!");
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
