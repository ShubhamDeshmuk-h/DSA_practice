import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter encrypted latitude:");
        String encryptedLatitude = scanner.nextLine().trim();
        
        System.out.println("Enter encrypted longitude:");
        String encryptedLongitude = scanner.nextLine().trim();
        
        
        String latitude = decryptCoordinate(encryptedLatitude, true);
        String longitude = decryptCoordinate(encryptedLongitude, false);

        
        System.out.println(latitude + " " + longitude);

        scanner.close();
    }

  
    private static String decryptCoordinate(String input, boolean isLatitude) {
        char direction = input.charAt(input.length() - 1);  
        String body = input.substring(0, input.length() - 1);  

        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : body.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

    
        int maxFreq = Collections.max(freqMap.values());
        int minFreq = Collections.min(freqMap.values());

        int value = maxFreq - minFreq;

        
        String directionString = "";
        if (isLatitude) {
            directionString = (direction == 'n') ? "North" : "South";
        } else {
            directionString = (direction == 'e') ? "East" : "West";
        }

        return value + " " + directionString;
    }
}