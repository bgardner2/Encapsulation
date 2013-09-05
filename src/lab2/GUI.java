package lab2;

public class GUI {
    private Game game;
    private String worldName;
    private String characterName;
    private String characterRace;
    
    public GUI(){
        /*Standard gui creation for JFrame, panels, 
         *buttons, text-fields, drop-downs, etc
         */

        
    }
    
    
    public void startButtonClickListener(){
        startGame();
    }
    
    //This method will be called with a button is clicked
    private void startGame(){
        //First need to get information for the worldName, characterName, and 
        //characterRace variables. Maybe JOption pane or text fields, or drop-downs, etc
        game = new Game(new GameWorld(worldName), new GameCharacter(characterName, characterRace) );
    }
    
    
    
    
    //Listener for W key
    public void KeyPressW(){
        game.move("Forward");
    }
    
    //Listener for S key
    public void KeyPressS(){
        game.move("Backward");
    }
    
    //Listener for A key
    public void KeyPressA(){
        game.move("Left");
    }
    
    //Listener for D key
    public void KeyPressD(){
        game.move("Right");
    }
    
    
}
