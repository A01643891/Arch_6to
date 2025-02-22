public class Crocodile extends NPC {

    Crocodile(){
        this.hp = 10;
        this.name = "Chomper";
    }

    public void move(){
        System.out.println("Crocodile swims towards you");
    }

    public void attack(){
        System.out.println("Crocodile bites you");
    }
}
