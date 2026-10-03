import java.util.Scanner;
public class Solarpanel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Panel ID: ");
        int panelID = scanner.nextInt();
        System.out.println("Enter Energy generated");
        double energyGenerated = scanner.nextDouble();
        System.out.println("Enter number of solar panels");
        int numberOfPanels = scanner.nextInt();
        System.out.println("Enter system status");
        char systemStatus = scanner.next().charAt(0);
        System.out.println("Rooftop solar panel system details:");
        System.out.println("Energy generated: " + energyGenerated);
        System.out.println("Number of solar panels: " + numberOfPanels);
        System.out.println("System status: " + systemStatus);
        System.out.println("Panel ID: " + panelID);
    }
    
}
