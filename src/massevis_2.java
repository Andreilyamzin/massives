public class massevis_2 {
    public static void main(String[] args) {
        task1(); task2(); task3(); task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        int max = arr [0];
        int min = arr [0];
        for (int i = 0; i< arr.length; i++ ) {
            if (arr[i] > max){
                max = arr[i];

            }
            if (arr [i] < min ){
                min = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " +min + " рублей."
                + " Максимальная сумма трат за день составила " + max +" рублей");

    }
    public static void task3() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        int a = sum/ arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + a +" рублей" );
    }
    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i= reverseFullName.length -1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }
    }


}
