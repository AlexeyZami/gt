import java.util.Scanner;

public class UserInteraction {
    private static int code;
    private static String path;
    private static String pathNewFile;

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
    public static String createPathNewFile(){
        System.out.println("Введите путь куда сохранить новый файл с текстом:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static void interaction(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какую операцию необходимо выполнить?");
        System.out.println("1 - зашифровать текст\n2 - расшифровать текст\n3 - взломать шифр (пока недоступно)");
        int input = scanner.nextInt();
        if (input == 1){
            path = createPath();
            code = createCode();
            pathNewFile = createPathNewFile();
            System.out.println("Зашифрованный текст расположен по пути:");
            System.out.println(Encoder.recordingEncryptedText());
        } else if (input == 2){
            path = createPath();
            code = createCode();
            pathNewFile = createPathNewFile();
            System.out.println("Расшифрованный текст расположен по пути:");
            System.out.println(Decoder.recordingDecryptedText());
        }
    }

    public static int getCode() {
        return code;
    }

    public static String getPath() {
        return path;
    }
    public static String getPathNewFile() {
        return pathNewFile;
    }
}
