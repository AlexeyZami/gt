import java.util.Scanner;

public class UserInteraction {
    private static int code;
    private static String path;
    
    public static String createPath(){
        System.out.println("Введите путь к файлу с текстом:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static int createCode(){
        System.out.println("Введите числовой код для шифрования:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int getCode() {
        return code;
    }

    public static String getPath() {
        return path;
    }
}
