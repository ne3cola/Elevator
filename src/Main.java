import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Elevator elevator = new Elevator(30, 0);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер этажа");
            int floor = scanner.nextInt();
            System.out.println("Этаж: " + elevator.getCurrentFloor());
            elevator.move(floor);
        }
    }
}
