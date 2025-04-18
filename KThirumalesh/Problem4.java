import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the numbers separated by spaces:");
        String input = scanner.nextLine();
        

        List<Integer> inputList = new ArrayList<>();
        String[] inputArray = input.split(" ");
        for (String str : inputArray) {
            try {
                inputList.add(Integer.parseInt(str));
            } catch (NumberFormatException e) {
                System.out.println("Invalid number entered: " + str);
            }
        }

        
        Map<Integer, Integer> multiplesCount = countMultiples(inputList);
        
    
        System.out.println(multiplesCount);
        
        scanner.close();
    }

    public static Map<Integer, Integer> countMultiples(List<Integer> inputList) {
        Map<Integer, Integer> multiplesCount = new HashMap<>();
        
    
        for (int i = 1; i <= 9; i++) {
            multiplesCount.put(i, 0);
        }


        for (int num : inputList) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    multiplesCount.put(i, multiplesCount.get(i) + 1);
                }
            }
        }

        return multiplesCount;
    }
}
