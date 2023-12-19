import java.util.Scanner;

/**
 * @author Belitski Marat
 * @date 19.12.2023
 * @project TMS_AnOnl_17_Lesson_2
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Задача №1
        System.out.println("Hello world!");
        System.out.println();

        //Задача №2
        System.out.print("Введите имя пользователя: ");
        System.out.println("Hello " + scanner.nextLine() + "!");
        System.out.println();
    }
}