public class King {
    private String name;
    private int age;
    private String region;

    public King(String name, int age, String region) {
        this.name = name;
        this.age = age;
        this.region = region;
    }
    public Servant declareServant(String name, int age, String region){
        System.out.println("My new Servant is" + name + "!");
        return new Servant(name, age, region);
    }

    public Judge declareJudge(String name, int age, String region){
        System.out.println("The person who will judge us will be" + name + "!");
        return new  Judge(name, age, region);
    }

    public String party() {
        return "New contract with new allies!";
    }

    public boolean verifycontracts() {
        if(Math.random() > 0.2) {
            System.out.println("I approve this contract!");
            return true;
        } else {
            System.out.println("This contract if falsificated!");
            return false;
        }
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
