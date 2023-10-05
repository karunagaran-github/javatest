package task10;
class T {
    protected boolean isPrepared;

    public T() {
        isPrepared = false;
    }

    public void prepareTea() {
        if (!isPrepared) {
            System.out.println("Preparing basic tea with hot water and tea leaves.");
            isPrepared = true;
        } else {
            System.out.println("Tea is already prepared.");
        }
    }

    public void addMilk() {
        if (isPrepared) {
            System.out.println("Adding milk to the tea.");
        } else {
            System.out.println("Tea needs to be prepared first.");
        }
    }

    public void addSugar() {
        if (isPrepared) {
            System.out.println("Adding sugar to the tea.");
        } else {
            System.out.println("Tea needs to be prepared first.");
        }
    }
}

class BlackT extends T {
    @Override
    public void prepareTea() {
        if (!isPrepared) {
            System.out.println("Preparing Black Tea with hot water, tea leaves, and boiling for 5 minutes.");
            isPrepared = true;
        } else {
            System.out.println("Black Tea is already prepared.");
        }
    }
}

class GreenT extends T {
    @Override
    public void prepareTea() {
        if (!isPrepared) {
            System.out.println("Preparing Green Tea with hot water and green tea leaves, and steeping for 2 minutes.");
            isPrepared = true;
        } else {
            System.out.println("Green Tea is already prepared.");
        }
    }
}

class HerbalT extends T {
    @Override
    public void prepareTea() {
        if (!isPrepared) {
            System.out.println("Preparing Herbal Tea with hot water, herbs, and steeping for 3 minutes.");
            isPrepared = true;
        } else {
            System.out.println("Herbal Tea is already prepared.");
        }
    }
}

public class Tea3 {
    public static void main(String[] args) {
        T[] teass = new T[4]; // Create an array of Tea objects

        teass[0] = new T();       // Basic Tea
        teass[1] = new BlackT();  // Black Tea
        teass[2] = new GreenT();  // Green Tea
        teass[3] = new HerbalT(); // Herbal Tea

        for (T t : teass) {
            t.prepareTea();
            t.addMilk();
            t.addSugar();
            System.out.println();
        }
    }
}