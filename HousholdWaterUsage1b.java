import java.util.Scanner;

public class HousholdWaterUsage1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter water comsumption in litres");
        double consumption = sc.nextDouble();
        
        if(consumption <= 500) {
            System.out.println("The bill is Rs.100.");
        }else{
            System.out.println("The bill is Rs.200.");
        }
        sc.close();

    }

    
}
