public class App {
    public static void main(String[] args) throws Exception {
        
        Level level1 = new SwampLevel();
        System.out.println("Level 1:");
        level1.startLevel();

        Level level2 = new LavaLevel();
        System.out.println("Level 2:");
        level2.startLevel();
    }
}
