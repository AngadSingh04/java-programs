import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class java_EthCode {
    static void findMajority(int arr[], int n) {
        // Create a map to store the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Traverse the array and update the frequency map
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Find the maximum frequency
        int maxFrequency = 0;
        for (int frequency : frequencyMap.values()) {
            maxFrequency = Math.max(maxFrequency, frequency);
        }

        // Find the elements with the maximum frequency
        List<Integer> majorityElements = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int frequency = entry.getValue();
            if (frequency == maxFrequency) {
                majorityElements.add(entry.getKey());
            }
        }

        // Print the majority elements if they exist, otherwise print "No majority element"
        if (!majorityElements.isEmpty()) {
            System.out.println("Majority elements: " + majorityElements);
        } else {
            System.out.println("No majority element");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 3, 1, 3, 5, 3};
        findMajority(arr, arr.length);
    }
}
