import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Decoder {
    public static List<Integer> inputList;

    static {
        try {
            inputList = convertToList(UserInteraction.getPath());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static List<Character> decryptedList = decryption(inputList);
    public static List<Integer> convertToList(String path) throws FileNotFoundException {
        List<Integer> inputList = new ArrayList<>();
        InputStream inputStream = new FileInputStream(path);
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
            while (bufferedReader.ready()){
                inputList.add(bufferedReader.read());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputList;
    }
    public static List<Character> decryption(List<Integer> inputList) {
        List<Character> decryptedList = new ArrayList<>();
        for (Integer integer : inputList) {
            if (Alphabet.alphaList.contains((int)integer - UserInteraction.getCode())) {
                decryptedList.add((char)(((int) integer) - UserInteraction.getCode()));
            } else {
                decryptedList.add((char)((int) integer));
            }
        }
        return decryptedList;
    }
    public static String recordingDecryptedText(){
        String decryptedFilePath = UserInteraction.getPathNewFile();
        try {
            FileWriter writer = new FileWriter(decryptedFilePath);
            StringBuilder sb = new StringBuilder();
            for (Character character : decryptedList) {
                sb.append(character.toString());
            }
            String str = sb.toString();
            writer.write(str);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return decryptedFilePath;
    }
}
