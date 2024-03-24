import java.util.ArrayList;
import java.util.List;

public class Alphabet {
    public static final String alphaString = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ.,\":-!? ";
    public static final List<Integer> alphaList = createList(alphaString);
    public static List<Integer> createList(String alphaString){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < alphaString.length(); i++) {
            list.add((int) alphaString.charAt(i));
        }
        return list;
        
    }
}
