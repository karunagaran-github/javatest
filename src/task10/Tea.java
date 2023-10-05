package task10;

public class Tea {

    private boolean isPrepared;
    private boolean hasMilk;
    private boolean hasSugar;

    public Tea() {
        isPrepared = false;
        hasMilk = false;
        hasSugar = false;
    }

    // Method to prepare basic tea with hot water and tea leaves
    public void prepareTea() {
        if (!isPrepared) {
            System.out.println("Preparing basic tea with hot water and tea leaves.");
            isPrepared = true;
        } else {
            System.out.println("Tea is already prepared.");
        }
    }

    // Method to add milk to the basic tea
    public void addMilk() {
        if (isPrepared && !hasMilk) {
            System.out.println("Adding milk to the tea.");
            hasMilk = true;
        } else if (!isPrepared) {
            System.out.println("Tea needs to be prepared first.");
        } else {
            System.out.println("Milk is already added.");
        }
    }

    // Method to add sugar to the basic tea
    public void addSugar() {
        if (isPrepared && !hasSugar) {
            System.out.println("Adding sugar to the tea.");
            hasSugar = true;
        } else if (!isPrepared) {
            System.out.println("Tea needs to be prepared first.");
        } else {
            System.out.println("Sugar is already added.");
        }
    }

    public static void main(String[] args) {
        Tea myTea = new Tea();

        myTea.prepareTea();
        myTea.addMilk();
        myTea.addSugar();

        // Attempting to add milk and sugar again
        myTea.addMilk();
        myTea.addSugar();
    }
}
