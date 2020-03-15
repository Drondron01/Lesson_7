public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public boolean decreaseFood(int n) {
        if (food >= n) {
            food -= n;
            System.out.println("plate: " + food);
            return true;
        }
        else {
             return false;
        }
    }
    public void addFood(int n) {
        food = food + n;
    }

    public void info1() {
        System.out.println("plate: " + food);
    }
}
