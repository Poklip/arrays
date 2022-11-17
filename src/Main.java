public class Main {
    public static void main(String[] args) {
        // int[] things | = new int[]   или {}
        // имя массива  | размер массива | перечесление значений массива
        // things[0] - призыв значения из массива

        int[] weights = {55, 49, 34, 65, 57, 45, 56, 53, 0, 0, 0, 0};
        int[] weightsCopy = {55, 49, 43, 65, 57, 45, 56, 53, 0, 0, 0, 0};

        //for (int i = 0; i < 12; i++) {
        //    weights[i] = 58 + (int) (Math.random() * 12);
        //}
        //for (int i = 0; i < weights.length; i++) {
        //    System.out.println(weights[i]);
        //}

        boolean arraysAreEqual = true;
        arraysAreEqual = weightsCopy.length == weights.length;
        if (arraysAreEqual) {
            for (int i = 0; i < weights.length; i++) {
                if (weightsCopy[i] != weights[i]) {
                    System.out.println("Arrays are different.");
                    arraysAreEqual = false;
                }
            }
        }
        if (arraysAreEqual) {
            System.out.println("Arrays are same.");
        }

        int maxWeight = weights[0];
        for (final int weight : weights) {
            if (weight > maxWeight) {
                maxWeight = weight;
            }
        }
        System.out.println(maxWeight);

        for (int i = 0; i < weights.length - 1 && weights[i + 1] > 0; i++) {
            System.out.println(-weights[i] + weights[i + 1]);
        }
    }
}