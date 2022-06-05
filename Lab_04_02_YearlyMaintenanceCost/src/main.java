public class main {
    public static void main(String[] args) {
        double winterMaintenanceCost = 250.00;
        double springMaintenanceCost = 126.00;
        double summerMaintenanceCost = 267.00;
        double fallMaintenanceCost = 180.00;
        double totalMaintenanceCost;

        totalMaintenanceCost = winterMaintenanceCost + springMaintenanceCost + summerMaintenanceCost + fallMaintenanceCost;

        System.out.println("Your winter maintenance cost was " + winterMaintenanceCost + " dollars.");
        System.out.println("Your spring maintenance cost was " + springMaintenanceCost + " dollars.");
        System.out.println("Your summer maintenance cost was " + summerMaintenanceCost + " dollars.");
        System.out.println("Your fall maintenance cost was " + fallMaintenanceCost + " dollars.");
        System.out.println("Your total maintenance cost was " + totalMaintenanceCost + " dollars.");
    }
}
