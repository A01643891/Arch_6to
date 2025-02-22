import java.util.ArrayList;
import java.util.List;

abstract class Level {
    List<NPC> enemies = new ArrayList<>();
    abstract void loadEnemies();

    public void startLevel(){
        loadEnemies();
        for (NPC npc : enemies){
            npc.move();
            npc.attack();
        }
    }
}
