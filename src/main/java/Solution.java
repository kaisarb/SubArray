import java.io.*;
import java.util.*;

public class Solution {
    static int subArraySum(int[] b) {
        int n = 0;
        for (int i = 0; i < b.length; i++) {

            n = n + b[i];

        }
        return n;
    }  // int subArraySum(int[] b) {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // прочитать символ переноса строки
        String input;
        input = scanner.nextLine();
        String[] tokens = input.split(" "); // разбиваем строку на подстроки
        int[] arr = new int[n //tokens.length
                ];
        for (int i = 0; i < n //tokens.length
                ; i++) {
            arr[i] = Integer.parseInt(tokens[i]); // преобразуем каждую подстроку в число
        }
        scanner.close(); // закрываем Scanner после использования
        int k = 0;
        int[] subArray;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                subArray = Arrays.copyOfRange(arr, i,j);
                if (subArraySum(subArray) < 0) {
                    k++;
                }
            }
        }
        System.out.println(k);
    } // public static void main(String[] args) {

}
