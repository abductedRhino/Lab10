import java.util.HashMap;

/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */

/*
 * HashMap f�r Ausg�nge. s.294
 * fields private machen
 * methode getExit(String direction)
 * 
 */
public class Room 
{
    private HashMap<String,Room> exits;
    private String description;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {
        this.description = description;
        exits = new HashMap<>();
    }
    public void setExit(String direction, Room neighbor) {
        exits.put(direction, neighbor);
    }
    public Room getExit(String direction) {
        return exits.get(direction);
    }
    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }
    public String getAllExits() {
        String ret = "";
        for (String room : exits.keySet()) {
            ret += room + " ";
        }
        return ret;
    }
    public String getLongDescription() {
        return "You are " + description + ".\n" + "Your exits are: \n   " + getAllExits();
    }
}
