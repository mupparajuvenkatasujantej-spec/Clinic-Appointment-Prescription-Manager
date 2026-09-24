import java.util.Scanner;
public class Clinic{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice = 0;
        while (choice != 5) {
            System.out.println("=== Clinic ===");
            System.out.println("1) book");
            System.out.println("2) Reschedule");
            System.out.println("3)Prescribe");
            System.out.println("4) history");
            System.out.println("5) Exit");

            System.out.println("choice:");
            choice = s.nextInt();

            switch (choice) {
                 case 1:
                    System.out.println("Book appointment selected.");
                    break;
                case 2:
                    System.out.println("Reschedule appointment selected.");
                    break;
                    case 3:
                        System.out.println("Prescription selected.");
                        break;
                        case 4:
                        System.out.println("Patient history selected.");
                        break;
                        case 5:
                            System.out.println("Exit clinic.");
                            break;
                            default:
                                System.out.println("Invalid choice.");


            }
        }
        s.close();

    }
}