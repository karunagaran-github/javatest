package task10;

 class T2 {
    protected boolean isPrepared;

    public T2() {
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

class BlackTea extends T2 {
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

class GreenTea extends T2 {
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

class HerbalTea extends T2 {
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
public class Tea2 {
    public static void main(String[] args) {
        Tea basicTea = new Tea();
        BlackTea blackTea = new BlackTea();
        GreenTea greenTea = new GreenTea();
        HerbalTea herbalTea = new HerbalTea();

        basicTea.prepareTea();
        basicTea.addMilk();
        basicTea.addSugar();

        blackTea.prepareTea();
        blackTea.addMilk();
        blackTea.addSugar();

        greenTea.prepareTea();
        greenTea.addMilk();
        greenTea.addSugar();

        herbalTea.prepareTea();
        herbalTea.addMilk();
        herbalTea.addSugar();
    }
}
