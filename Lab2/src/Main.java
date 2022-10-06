import java.util.ArrayList;

public  class Main {
    public static void main(String[] args) {

        Archon archon = new Archon("GeoDragon", 20000, "Liyue");
        System.out.println(archon.getName() + " is a Archon from " + archon.getRegion() + " and is " + archon.getAge() + " years old.");




        NPC npc = new NPC("Colei", 25, "Summeru");
        System.out.println("The Chef is " + npc.getName() + " , " + npc.getRegion() + " , " + npc.getAge() + " years old.");



        Servant servant= new Servant("Eldy", 30, "Inazuma");
        System.out.println("The Servant is " + servant.getName() + " , " + servant.getRegion() + " , " + servant.getAge() + " years old.");

        System.out.println(servant.getName() + " declares " + npc.getName() + " a Chef!");

        Chef chef = servant.declareChef(npc.getName(), npc.getAge(), npc.getRegion());

        System.out.println("The Chef is " + chef.getName() + " , " + chef.getRegion() + " , " + chef.getAge() + " years old.");



    }
}
