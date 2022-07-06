import java.util.HashMap;

/**
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 * 
 * This class holds an enumeration of all command words known to the game.
 * It is used to recognise commands as they are typed in.
 *
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */


public class CommandWords
{
    // a constant array that holds all valid command words
    private HashMap<String, Enum> validCommands;

    /**
     * Constructor - initialise the command words.
     */
    public CommandWords() {
        validCommands = new HashMap<>();
        for (Enum ENUM : Enum.values()) {
            if (ENUM != Enum.UNKNOWN) {
                validCommands.put(ENUM.toString(), ENUM);
            }
        }
    }

    /**
     * Check whether a given String is a valid command word. 
     * @return true if a given string is a valid command,
     * false if it isn't.
     */
    public boolean isCommand(String keyWord)
    {
        return validCommands.containsKey(keyWord);
    }
    public Enum getEnum(String keyWord){
        return validCommands.get(keyWord);
    }
    @Override
    public String toString() {
        String ret = "";
        for (String keyWord : validCommands.keySet()) {
            ret+= keyWord + " ";
        }
        return ret;
    }
}
