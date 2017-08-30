import java.util.Scanner;

public class Dz2 {

    static String teststr = "Я хороший разработчик автотестов";


    public static void main(String[] args) {


        System.out.println(teststr.substring(10, 21));//вывод "разработчик"
        System.out.println(teststr.replace("хороший", "какой есть")); //замена слова

    }
}
