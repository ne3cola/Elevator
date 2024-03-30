public class Elevator {
    private final int maxFloor;
    private final int minFloor;
    private int currentFloor;

    public Elevator(int maxFloor, int minFloor) {
        this.maxFloor = maxFloor;
        this.minFloor = minFloor;
        currentFloor = 1;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveUp() {
        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
        System.out.println("Этаж: " + currentFloor);
    }

    public void moveDown() {
        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
        System.out.println("Этаж: " + currentFloor);
    }

    public void move(int floor) {
        if (floor > maxFloor || floor < minFloor || floor == currentFloor) {
            System.out.println("Введён невырный этаж!");
        } else if (floor < currentFloor) {
            for (int i = currentFloor; i > floor; i--) {
                moveDown();
            }
        } else {
            for (int i = currentFloor; i < floor; i++) {
                moveUp();
            }
        }
    }
}
