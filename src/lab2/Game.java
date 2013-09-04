package lab2;

public class Game {
    private GameCharacter character;
    private GameWorld world;
    
    public void move(String direction){
        //Validate direction
        character.walk(direction);
        world.updateView();
    }
    
    
}
