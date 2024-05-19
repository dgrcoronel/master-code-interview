import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        test();

    }

    private static void test() {

        scenario1();
        scenario2();
        scenario3();
        scenario4();

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

    private static void scenario4() {

        System.out.println("\n### Scenario 4 - LeetCode ###");

        Integer[] array = {2,5,5,11};
        int number = 10;

        List<Integer> indexes = getIndexes(array, number);
        
        System.out.println("The indexes that correspond the sum is: " + indexes);

    }

    private static List<Integer> getIndexes(Integer[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            int numberToFind = target - nums[i];
            // System.out.println("i = " + i);
            for (int j = i + 1; j < nums.length; j++) {
                // System.out.println("j = " + j);
                if (numberToFind == nums[j]) {
                    return List.of(i, j);
                }
            }
        }
        return null;
    }

    
}