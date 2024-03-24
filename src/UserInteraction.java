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
    public static void interaction(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какую операцию необходимо выполнить?");
        System.out.println("1 - зашифровать текст\n2 - расшифровать текст\n3 - взломать шифр");
        if (scanner.nextInt() == 1){
            path = createPath();
            code = createCode();
            System.out.println("Зашифрованный текст расположен по пути:");
            System.out.println(Encoder.writingCiphertext());
        }
    }

    public static int getCode() {
        return code;
    }

    public static String getPath() {
        return path;
    }
}
