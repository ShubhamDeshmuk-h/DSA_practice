import java.util.*;

public class Main {

    /*static class Monster {
        int power;
        int bonus;

        Monster(int power, int bonus) {
            this.power = power;
            this.bonus = bonus;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int n = sc.nextInt(); // number of monsters
        int exp = sc.nextInt(); // initial experience

        Monster[] monsters = new Monster[n];
        for (int i = 0; i < n; i++) {
            int power = sc.nextInt();
            int bonus = sc.nextInt();
            monsters[i] = new Monster(power, bonus);
        }

        // Sort monsters by power
        Arrays.sort(monsters, (a, b) -> Integer.compare(a.power, b.power));

        // Process monsters
        int count = 0;
        for (Monster m : monsters) {
            if (exp > m.power) {
                exp += m.bonus;
                count++;
            }
        }

        System.out.println(count);
    }*/
   public static void main(String[] args) {
       Scanner obj = new Scanner(System.in);
       int numb_monster = obj.nextInt();
       int my_experience = obj.nextInt();
       int[] arr = new int[numb_monster];
       int[] bonus = new int[numb_monster];
       for (int i = 0; i < numb_monster; i++) {
           arr[i] = obj.nextInt();
       }
       for (int i = 0; i < numb_monster; i++) {
           bonus[i] = obj.nextInt();
       }


       int count = 0;
       for (int i = 0; i < numb_monster; i++) {
           if(my_experience >= arr[i]){
            my_experience += bonus[i];
            count++;
            }
        }
       System.out.println("Monsters killed "+count);

   }
}
