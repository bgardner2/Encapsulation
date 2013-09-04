package lab2;

public class GameCharacter {
    private String characterName;
    private String race;
    private int health;
    
    public GameCharacter(){
        
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
    
    private void unsheathSword(){
        //Unsheath sword
    }
    
    private void swingSword(){
        //Swing sword
    }
    
    private void sheathSword(){
        //Sheath sword
    }
    
    public void walk(String direction){
        //Make character walk in the specified direction
        //Plays specificed animation
    }
    
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
