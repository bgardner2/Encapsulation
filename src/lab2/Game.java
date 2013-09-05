package lab2;

public class Game {
    private GameCharacter character;
    private GameWorld world;
    
    public Game(GameWorld newWorld, GameCharacter newCharacter){
        this.createGameWorld(newWorld);
        this.createGameCharacter(newCharacter);
    }
    
    //Should create world before character
    private void createGameWorld(GameWorld world){
        this.world.equals(world);
    }
    
    //Should create character after world is loaded
    private void createGameCharacter(GameCharacter character){
        this.character.equals(character);
    }
    
    public void move(String direction){
        //Validate direction
        //Validate character and world are not null
        character.walk(direction);
        world.updateView();
    }
    
    public void loadNewArea(String MapArea){
        world.loadWorld(MapArea);
    }
    
    
}
