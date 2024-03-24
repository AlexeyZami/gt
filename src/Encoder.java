import java.io.FileNotFoundException;
import java.util.List;

public class Encoder {
    public static List<Integer> inputList;

    static {
        try {
            inputList = convertToList(UserInteraction.getPath());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static List<Character> encryptedList = encryption(inputList);
}
