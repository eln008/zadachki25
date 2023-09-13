
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
//        /*111111111111111111111111111111111111111*/
//        int[] num = {52,-12,23,4,-9};
//        int index = 0;
//        int firstNum=0;
//         while(index<num.length) {
//             if (num[index] < 0) {
//                 firstNum = num[index];
//                 break;
//             }
//             index++;
//         }
//        System.out.println("Первый отрицательный элемент: "+firstNum);
//        System.out.println("Порядковый номер: "+index+1);

        /*22222222222222222222222222222222222222*/

//        int[] a= {2,5,23,6,12};
//        for (int i = 0; i < a.length; i++) {
//            if (a[i]>10){
//                System.out.println("номера элементов которые a[i]>10: "+(i+1));
//            }
//        }

        /*33333333333333333333333333333333333*/

//        int[] dni ={2,1,-1,-2,3,-6,-3};
//        int sum=0;
//        int nizhe = 0;
//
//        for (int i = 0; i < dni.length; i++) {
//            sum=dni[i];
//        if (dni[i]<0){
//            nizhe++;
//        }}
//        System.out.println(nizhe+" разa температура была ниже 0°");
//        System.out.println("Средняя температура за неделю: "+sum);

        /*4444444444444444444444444444444444444444*/
//        int[] nums = {2, 4, 3, 6, 8, 7, 12};
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] % 2 == 0) {
//                System.out.println("Порядковый номер четного числа: " + (i+1));
//            }
//        }
//
//        for (int j = 0; j < nums.length; j++) {
//            if (nums[j] % 2 != 0) {
//                System.out.println("Порядковый номер нечетного числа: " + (j+1));
//            }
//        }

        /*555555555555555555555555555555555555555*/
//        int[] nums = {2, 4, 3, 6, 8, 7, 12};
//        for (int i = 0; i < nums.length-1; i++) {
//            if (nums[i] <= nums[i] + 1) {
//
//            }else {
//                System.out.println("Последовательность является убывающей.");
//            }
//        }                System.out.println("Последовательность не является убывающей.");

        /*66666666666666666666666666666666666666666666*/
//        int[] mass = {1, 7, 3, 5, 6, 12, 5};
//
//
//        int maxElement = mass[0];
//
//        for (int i = 1; i < mass.length; i++) {
//            if (mass[i] > maxElement) {
//                maxElement = mass[i];
//            }
//        }
//
//        System.out.println("Самый большой элемент в массиве: " + maxElement);


        /*77777777777777777777777777777777777777777777777*/
//        int[] arr = {10, 5, 8, 3, 15, 12};
//        findAndSwapLargest(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//
//    public static void findAndSwapLargest(int[] arr) {
//        if (arr == null || arr.length <= 1) {
//            return;
//        }
//
//        int max = 0;
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//        System.out.println(max);
//
//
//            }
//        }
        /*88888888888888888888888888888*/
//        int [] [] massiv=  {{5,20,3},{4,7,6,9},{12,8,3}};
//        int max= massiv[0][0];
//        int maxR=0;
//        int maxC=0;
//        for (int i = 0; i < massiv.length; i++) {
//            for (int j = 0; j < massiv [i].length; j++) {
//                if (massiv[i][j] > max) {
//                    max = massiv[i][j];
//                    maxR = i;
//                    maxC = j;
//                }
//            }
//        }
//        System.out.println("Наибольший элемент: " + max);
//        System.out.println("Номер строки: " + maxR);
//        System.out.println("Номер столбца: " + maxC);

        /*999999999999999999999999999999999999999*/
//        int[][] arr = {{3, 8, 6, 12, 7, 10}, {20, 9, 7}};
//
//        int sum = 0;
//        int count = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] % 2 == 0) {
//                    sum += arr[i][j];
//                    count++;
//
//                }
//            }
//        }
//        int result =  sum / count;
//        System.out.println("Среднее арифметическое чисел равно: " + result);

        /*1010101010101010101010101010101010101010101010101010101010101010*/
//        int arraySize = 20;
//        int maxValue = 100;
//
//        if (arraySize > maxValue) {
//            System.out.println("Размер массива больше, чем диапазон возможных чисел.");
//            return;
//        }
//
//        int[] randomArray = new int[arraySize];
//        Set<Integer> usedNumbers = new HashSet<>();
//        Random random = new Random();
//
//        for (int i = 0; i < arraySize; i++) {
//            int randomNumber;
//            do {
//                randomNumber = random.nextInt(maxValue);
//            } while (usedNumbers.contains(randomNumber));
//
//            randomArray[i] = randomNumber;
//            usedNumbers.add(randomNumber);
//        }
//
//        for (int i = 0; i < arraySize; i++) {
//            System.out.print(randomArray[i] + " ");
//        }

        /*11 11 11 11 11 11 11 11 11 11 11 11 11 11 11 11 11 11 11 11 11 11*/
//        int[][] matrix = {{2, 8, 5},{3, 7, 4},{9, 6, 4}};
//        method(matrix);
//        for (int[] row : matrix) {
//            for (int num : row) {
//                System.out.print(num + " ");
//            }
//            System.out.println();
//        }
//    }
//    public static void method(int[][] matrix) {
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = i; j < matrix.length; j++) {
//                matrix[i][j] = 0;
//            }
//        }

        /*12 12 12 12 12 12 12 12 12 12 12 12 12 12 12 12 12 12 12 12*/
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
//
//        int [][] matrix = new int[8][8];
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                matrix[i][j] = (int) Math.pow(numbers[j], i + 1);
//            }
//        }
//
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                System.out.print(matrix[i][j] + "\t");
//            }
//            System.out.println();
//        }
        /*13 13 13 13 13 13 13 13 13 13 13 13 13 13 13 13 13 13 13 13 13 13 13 13 13 13 */

//        int[][] array = {
//                {5, 10, 3, 7},
//                {8, 1, 6, 2},
//                {4, 9, 12, 11}
//        };
//
//        Arrays.sort(array[2]);
//        reverseArray(array[2]);
//
//        for (int[] row : array) {
//            System.out.println(Arrays.toString(row));
//        }
//        } public static void reverseArray(int[] arr) {
//            int left = 0;
//            int right = arr.length - 1;
//
//            while (left < right) {
//                int temp = arr[left];
//                arr[left] = arr[right];
//                arr[right] = temp;
//
//                left++;
//                right--;
//            }
//    }

        /*14 14 14 14 14 14 14 14 14 14 14 14 14 14 14 14 14 14 14 14 14 14 14*/
//        int[][] array = {
//                {10, 20},
//                {23, 12},
//                {50, 60},
//                {23, 80},
//                {90, 100}
//        };
//        Arrays.sort(array, Comparator.comparingInt(arr -> arr[1]));
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i][0] + " " + array[i][1]);
//
//        }

        /*15 15 15 15 15 15 15 15 15 15 15 15 15 15 15 15 15 15 15 15 15*/

//        Scanner sc = new Scanner(System.in);
//        int [] [] matrix={{12,34,5,},{123,5312,134}};
//        int string = 3;
//        int row = 3;
//         if (true){for (int i = 0; i < string; i++) {
//             for (int j = 0; j < row; j++) {
//                 matrix[j][i] = sc.nextInt();
//                 System.out.println(matrix[i][j]);
//             }
//         }
//        }
//        else {
//             for (int i = 0; i < string; i++) {
//                 System.out.println();
//                 for (int j = 0; j < row; j++) {
//
//
//                     System.out.println(matrix[i][j] + "");
//                 }
//
//             }
//         }
    }
}