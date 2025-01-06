import java.util.*;
public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 3, 2, 7};
        findDuplicates(arr);
    }
    static void findDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num)) {
                duplicates.add(num);
            }
        }
        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found");
        } else {
            System.out.println("Duplicate elements: " + duplicates);
        }
    }
}

