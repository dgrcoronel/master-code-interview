import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        test();

    }

    private static void test() {

        scenario1();
        scenario2();
        scenario3();

    }

    private static void scenario1() {

        System.out.println("\n### Scenario 1 - Happy path ###");

        Integer[] array = {1, 3, 7, 9, 2};
        int number = 11;

        List<Integer> indexes = getIndexes(array, number);
        
        System.out.println("The indexes that correspond the sum is: " + indexes);

    }

    private static void scenario2() {

        System.out.println("\n### Scenario 2 - Null Array ###");

        Integer[] array = {};
        int number = 11;

        List<Integer> indexes = getIndexes(array, number);
        
        System.out.println("The indexes that correspond the sum is: " + indexes);

    }

    private static void scenario3() {

        System.out.println("\n### Scenario 3 - Count 1 number Array ###");

        Integer[] array = {5};
        int number = 11;

        List<Integer> indexes = getIndexes(array, number);
        
        System.out.println("The indexes that correspond the sum is: " + indexes);

    }

    private static List<Integer> getIndexes(Integer[] array, int number) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[i] + array[j] == number) {
                    return List.of(i, j);
                }
            }
        }
        return null;
    }
}