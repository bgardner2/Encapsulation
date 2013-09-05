package lab2;

public class GameCharacter {
    private String characterName;
    private String race;
    private int health;
    
    public GameCharacter(String name, String race){
        this.characterName = name;
        this.race = race;
        health = 100;
    }
    
    /*This method would be nice to make a generic "useWeapon"
     *in the long term. However the methods inside would need
     * reworking as well. For example, axes are't necessarily 
     * sheathed, nor are bows
    */
    public void useSword(){
        
        this.unsheathSword();
        this.swingSword();
        this.sheathSword();
    }
    
    //Must be done first
    private void unsheathSword(){
        //Unsheath sword
    }
    
    //Must be done second
    private void swingSword(){
        //Swing sword
    }
    
    //Must be done third
    private void sheathSword(){
        //Sheath sword
    }
    
    public void walk(String direction){
        //Make character walk in the specified direction
        //Plays specificed animation
    }
    
    
    //Standard getters and setters
    public void setName(String name){
        //Validate proper name
        characterName = name;
    }
    
    public String getName(){
        return characterName;
    }
    
    public void setRace(String race){
        //Validate proper race
        this.race = race;
    }
    
    public String getRace(){
        return race;
    }
    
    public void setHealth(int health){
        //Validate proper health
        this.health = health;
    }
    
    public int getHealth(){
        return health;
    }
    
}
