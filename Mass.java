import java.util.Arrays;
import java.util.Scanner;

import static java.lang.String.format;

public class Mass {
    public static void main(String[] args) {
        int size;
        String enter;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        size = scanner.nextInt();
        int[] Array = new int[size];
        if (size % 10 > 4 || size % 10 == 0||size==11) {
            System.out.println(format("Введите %s чисел", size));
        } else if (size % 10 > 1) {
            System.out.println(format("Введите %s числа", size));
        } else {
            System.out.println(format("Введите %s число", size));
        }
        for (int i = 0; i < size; i++) {
            Array[i] = scanner.nextInt();
        }
        System.out.println("Введите 1,2,3 или q для выхода из программы");
        enter = scanner.next();
        //пытался сделать через свитч, не знаю как зациклить
        //switch (enter){
        //  case "1":sort(Array);break;
        //  case "2":summaxmin(Array);break;
        //  case "3":mostPopular(Array);break;
        //  case "q":break;
        //default:System.out.println("Введите 1,2,3 или q для выхода из программы");}
        for (int i = 0; i < 2; i++) {
            if (enter.equals("1")) {
                sort(Array);
                enter = scanner.next();
            } else {
                if (enter.equals("2")) {
                    summaxmin(Array);
                    enter = scanner.next();
                } else {
                    if (enter.equals("3")) {
                        mostPopular(Array);
                        enter = scanner.next();
                    } else {
                        if (enter.equals("q")) {
                            scanner.close();
                            break;
                        } else {
                            System.out.println("Введите 1,2,3 или q для выхода из программы");
                            enter = scanner.next();
                        }
                    }
                }

                //  scanner.close();
            }
            i = 0;
        }
    }


    public static void sort(int[] Array) {// метод сортировки по убыванию
        int temp;
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array.length; j++) {
                if (Array[i] > Array[j]) {
                    temp = Array[j];
                    Array[j] = Array[i];
                    Array[i] = temp;
                }
            }
        }
        for (int value : Array) {
            System.out.print(value + " ");
        }
        System.out.println(" ");
    }

    public static void summaxmin(int[] Array) { //метод поиска суммы макс и мин элементов
        int max = Array[1];
        int min = Array[1];
        for (int i = 0; i < Array.length; i++) {
            if (max < Array[i]) {
                max = Array[i];
            }
            if (min > Array[i]) {
                min = Array[i];
            }
        }

        System.out.println(format("Сумма максимального и минимального элементов равна: %s", max + min));
    }

    public static void mostPopular(int[] Array) { //метод поиска элемента повторяющегося наибольшее число раз
        Arrays.sort(Array);
        // int per = Array[0];
        int MaxCount = 1;
        int count = 1;
        int MaxArray = Array[0];
        for (int i = 0; i < Array.length - 1; i++) {
            if (Array[i] == Array[i + 1]) {
                count++;

                if (count > MaxCount) {
                    MaxCount = count;
                    MaxArray = Array[i];
                }
            } else {
                // if (count > MaxCount) {
                //  MaxCount = count;
                //   MaxArray = Array[i];


                // per = Array[i];
                count = 1;
            }
        }

        System.out.println(format("Элемент повторяющийся наибольшее количество раз: %s", MaxArray));

    }
}