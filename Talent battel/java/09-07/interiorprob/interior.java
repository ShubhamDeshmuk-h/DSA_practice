import java.util.*;
public class interior{
    public static void main(String[] args) {
        //we have cost of interios wall painting 18 and exteriour wall painting 12 per sqft
        
        //we hvae input number of walls interiour and exteriour wall

        //also we have input of surface area interior and exteriour in sq ft

        //if user puts value for interiour wall 0 it should not ask for area else it should ask
        //calculate cost to painting


        int interior_rate = 18;
        int exteriour_rate = 12;
        Scanner obj = new Scanner(System.in);
        int num_interiour_wall = obj.nextInt();
        int num_exteriour_wall = obj.nextInt();
        double total_area_interiour = 0;
        double total_area_exteriour = 0;
        
        for(int i = 0; i<=num_interiour_wall;i++){
            double interiour_area = obj.nextFloat();
            total_area_interiour += interiour_area; 
        }
        for(int i = 1; i<=num_exteriour_wall;i++){
            double exteriour_area = obj.nextFloat();
            total_area_exteriour += exteriour_area; 
        }
        double cost = (total_area_exteriour*exteriour_rate) + (total_area_interiour*interior_rate);

        System.out.println("Totl Estimated Cost:"+cost+"INR.");
        obj.close();
        

    }
}