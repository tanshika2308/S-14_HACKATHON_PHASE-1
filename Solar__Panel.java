import java.util.*;
public class Solar__Panel{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Energy Generated (in kWh): ");
        double energyGenerated = scanner.nextDouble();
        if(energyGenerated >= 10)

        {
            System.out.println("Good Energy Generation!");
        }
        else
        {
            System.out.println("Low Energy Generation.");
        }
    }

}