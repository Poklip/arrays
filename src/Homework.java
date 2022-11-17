import java.util.Arrays;
public class Homework {
    //генератор массива на 30 случайных чисел от 10^5 до 2*10^5
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000) + 100000;
        }
        return arr;
    }
    //домашнее задание
    public static void main(String[] args) {

        //Задача №1.
        int[] dailyConsumptions = generateRandomArray();
        int totalConsumptionPerMonth = 0;
        for (int dailyConsumption : dailyConsumptions) {
            totalConsumptionPerMonth += dailyConsumption;
        }
        System.out.println(totalConsumptionPerMonth + "\n");

        //Задача №2.
        int maxConsumption = 0;
        int minConsumption = 200_000;
        for (int dailyConsumption : dailyConsumptions) {
            if (dailyConsumption > maxConsumption) {
                maxConsumption = dailyConsumption;
            }
            if (dailyConsumption < minConsumption) {
                minConsumption = dailyConsumption;
            }
        }
        System.out.println("Минимальная сумма трат в день: " + minConsumption + " рублей.\nМаксимальная сумма трат в день: " + maxConsumption + " рублей.\n");

        //Задача №3 без создания нового массива.
        System.out.println("Средняя сумма трат за месяц составила " + totalConsumptionPerMonth/30f + " рублей.\n");

        //Задача №4.
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println("\n");

        //Задача №5.
        char[][] matrix = new char [3][3];
        int rowCounter = 0;
        for (char[] row : matrix) {
            for (int column = 0; column < row.length; column += 1) {
                if ((rowCounter + column) % 2 == 0) {
                    row[column] = 1;
                }
            }
            rowCounter += 1;
        }
        for (char[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        System.out.println();

        //Задача №6.
        int[] errorArray = {6, 8, 13, 56, 987, 45, 1};
        int[] repairedArray = new int[errorArray.length];
        System.out.println(Arrays.toString(errorArray));
        for (int i = errorArray.length - 1; i >= 0; i --) {
            repairedArray[errorArray.length - 1 - i] = errorArray[i];
        }
        System.out.println(Arrays.toString(repairedArray) + "\n");

        //Задача №7.
        int buffer; //о создании переменных речи не было ¯\_(ツ)_/¯
        for (int i = 0; i < errorArray.length; i++) {
            buffer = errorArray[i];
            errorArray[i] = errorArray[errorArray.length - 1 - i];
            errorArray[errorArray.length - 1 - i] = buffer;
            if (i == errorArray.length / 2) {
                break;
            }
        }
        System.out.println(Arrays.toString(errorArray) + "\n");

        //Задача №8.
        int [] taskEightArray = {-6, -3, 5, -8, 8, 10, 4, -7, 6, 1};
        for (int i = 0; i < taskEightArray.length && taskEightArray[i] < 0; i++) {
            for (int k : taskEightArray) {
                if (taskEightArray[i] + k == -2) {
                    System.out.println(taskEightArray[i] + " & " + k + "\n");
                    i = taskEightArray.length;
                    break;
                    //последние две строки нужны для прекращения обоих циклов, выдачи только двух чисел (по условию) и ресурсов компьютера
                }
            }
        }

        //Задача №9.
        Arrays.sort(taskEightArray);
        for (int i = 0; i < taskEightArray.length && taskEightArray[i] < 0; i++) {
            for (int k : taskEightArray) {
                if (taskEightArray[i] + k == -2) {
                    System.out.println(taskEightArray[i] + " & " + k);
                }
            }
        }

    }
}
