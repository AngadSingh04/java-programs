import java.util.HashMap;
import java.util.Map;

public class java_EthCode {
    static void findMajority(int arr[], int n) {
        // Create a map to store the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Traverse the array and update the frequency map
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Find the element with maximum frequency
        int maxFrequency = 0;
        int majorityElement = -1;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int frequency = entry.getValue();
            if (frequency > maxFrequency && frequency > n / 2) {
                maxFrequency = frequency;
                majorityElement = entry.getKey();
            }
        }

        // Print the majority element if it exists, otherwise print null
        if (maxFrequency > n / 2) {
            System.out.println("Majority element: " + majorityElement);
        } else {
            System.out.println("No majority element");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 3, 1, 3, 5, 3 };
        findMajority(arr, arr.length);
    }
}
