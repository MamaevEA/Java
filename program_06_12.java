import java.util.Scanner;

/** Текст задачи:
Написать программу, которая запросит пользователя ввести <Имя> в консоли. 
Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
 * program
 */
public class program_06_12 {
    // public static void main(String[] args) {
    //     // Scanner scanner = new Scanner(System.in);
    //     // System.out.println("Введите ваше имя:");
    //     // String name = scanner.nextLine();
    //     // System.out.println("Привет, " + name + "!");
    //     int[] array = {1, 1, 0, 1, 1, 1};
    //     int result = method(array);
    //     System.out.println(result);
    // }
    // /**
    //  * Текст задачи:
    //  * Дан массив двоичных чисел, например [1,1,0,1,1,1], 
    //  * вывести максимальное количество подряд идущих 1.
    //  */
    //     //        int[] array = new int[5];
        
    
    
    // private static int method(int[] array) {
    //     // TODO: 06.12.2022 Найти максимальное количество подряд идущих единиц
    //     int curr = 0;
    //     int max = 0;
    //     for (int i = 0; i < array.length; i++) {
    //         int a = array[i];
    //         if (a == 1) {
    //             curr++;
    //         } else {
    //             if (curr > max) {
    //                 max = curr;
    //             }
    //             curr = 0;
    //         }
    //     }

    //     if (curr > max) {
    //         max = curr;
    //     }

    //     return max;
        
    // }

    /**
     * Текст задачи:
     * Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
     * Java по курс на пожаловать Добро
     */
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        //     System.out.println("Введите текст");
        //     String text = sc.nextLine(); // состоит из слов и пробелов

        //     // TODO: 06.12.2022 Развернуть строку и вывести в консоль.


        //     String wrd = "";
        //     int i = 0;
        //     String[] words = text.split(" ");
        //     for (i = words.length - 1; i >= 0; i--) {
        //         System.out.print(words[i] + " ");
        //     }

     
        // 📔 **Текст задачи:**

        // Задан массив, например, nums = [1,7,3,6,5,6]. 
        // Написать программу, которая найдет индекс i для этого массива такой, 
        // что сумма элементов с индексами < i равна сумме элементов с индексами > i.
        // Если такого индекса нет, то вывести -1
        int[] array = {1,7,3,6,5,6};
        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 1; i < array.length; i++){
            for (int j = 0; j < i; j++){
                sumLeft = sumLeft + array[j];
            }
            for (int h = i + 1; h < array.length; h++){
                sumRight = sumRight + array[h];
            }
            if (sumLeft == sumRight){

                System.out.println(i);
            }
            sumLeft = 0;
            sumRight = 0;
        }
    }

}

            