package lab2;

public class GameWorld {
    private String MapArea;

    public GameWorld(String MapArea){
        /*input validation for MapArea
         * Possibly would be more ideal for the input 
         * to  be a Map class or something
         */
        this.loadWorld(MapArea);
    }
    
    public void loadWorld(String MapArea) {
        /*input validation for MapArea
         * Possibly would be more ideal for the input 
         * to  be a Map class or something
         */
        this.loadAssets(MapArea);
        this.loadEnemies(MapArea);
        this.loadTextures(MapArea);

    }

    //Must be done BEFORE TEXTURES are loaded
    //Needs a Map Area parameter to know what assets to load
    private void loadAssets(String MapArea) {
        /*All necessary non-static objects loaded into game world
         * Example: Power-ups, movable objects (I.E. a crate), 
         * Treasure chests
         */
    }

    //Must be done BEFORE TEXTURES are loaded
    //Needs a Map Area parameter to know what enemies to load
    private void loadEnemies(String MapArea) {
        //Load enemies into world
    }
    
    //Must be done AFTER ASSETS and ENEMIES are loaded
    //Needs a Map Area parameter to know what textures to load
    private void loadTextures(String MapArea) {
        //All necessary textures loaded into memory
    }

    public void updateView() {
        //This method updates the screen view
        //For example: if you walk forward or turn around
    }
}
