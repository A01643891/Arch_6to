public class LavaGollem extends NPC {

    LavaGollem(){
        this.hp = 50;
        this.name = "Ruckus";
    }

    public void move(){
        System.out.println("Lava Gollem walks slowly");
    }

    public void attack(){
        System.out.println("Gollem throws a rock at you");
    }
}
