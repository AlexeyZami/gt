import java.io.*;
import java.util.ArrayList;
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
    public static List<Character> encryption(List<Integer> inputList) {
        List<Character> encryptedList = new ArrayList<>();
        for (Integer integer : inputList) {
            if (Alphabet.alphaList.contains(integer)) {
                encryptedList.add((char)(((int) integer) + UserInteraction.getCode()));
            } else {
                encryptedList.add((char)((int) integer));
            }
        }
        return encryptedList;
    }
    public static String recordingEncryptedText(){
        String encryptedFilePath = "/Users/aleksejlalakin/IdeaProjects/PracticeJR/src/caesar/encryptedFile.txt";
        try {
            FileWriter writer = new FileWriter(encryptedFilePath);
            StringBuilder sb = new StringBuilder();
            for (Character character : encryptedList) {
                sb.append(character.toString());
            }
            String str = sb.toString();
            writer.write(str);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return encryptedFilePath;
    }
}
