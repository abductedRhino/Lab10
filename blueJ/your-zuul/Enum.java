/**
 * Enumeration class CommandWord - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum Enum {
    GO("go"),
    QUIT("quit"),
    HELP("help"),
    EAT("eat"),
    LOOK("look"),
    JUMP("jump"),
    UNKNOWN("?");
    private String keyWord;
    Enum(String keyWord) {
        this.keyWord = keyWord;
    }
    @Override
    public String toString() {
        return keyWord;
    }
}