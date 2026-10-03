import java.util.*;
public class Solar_Panel {

    static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter morning energy: ");
        double morningEnergy = scanner.nextDouble();

        System.out.print("Enter evening energy: ");
        double eveningEnergy = scanner.nextDouble();

        double totalEnergy = calculateTotalEnergy(morningEnergy, eveningEnergy);

        System.out.println("Total energy generated: " + totalEnergy + " kWh");
    }
}