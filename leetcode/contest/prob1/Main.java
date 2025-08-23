import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[][] nums = {
            {3, 1, 2, 4, 5},
            {1, 2, 3, 4},
            {3, 4, 5, 6}
        };

        System.out.println(nums[1][1]); // prints 2
        System.out.println(nums.length); // prints 3

        ArrayList<Integer> result = new ArrayList<>();

        // Step 1: Find common elements between first and second row
        for (int j = 0; j < nums[0].length; j++) {
            for (int k = 0; k < nums[1].length; k++) {
                if (nums[0][j] == nums[1][k]) {
                    if (!result.contains(nums[0][j])) {
                        result.add(nums[0][j]);
                    }
                }
            }
        }

        // Step 2: Keep only those elements that are in all other rows
        for (int i = 2; i < nums.length; i++) {
            Iterator<Integer> it = result.iterator();
            while (it.hasNext()) {
                int val = it.next();
                boolean found = false;
                for (int k = 0; k < nums[i].length; k++) {
                    if (nums[i][k] == val) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    it.remove();
                }
            }
        }

        System.out.println(result);
        
    }
}
