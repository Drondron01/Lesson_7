import java.lang.reflect.Array;

public class MainOne {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Barsik", 45, false);
        cats[1] = new Cat("Vaska", 40, false);
        cats[2] = new Cat("Red", 20, false);
        cats[3] = new Cat("Simka", 40, false);
        cats[4] = new Cat("Petka", 30, false);
        Plate[] plats = new Plate[3];
        plats[0] = new Plate(80);
        plats[1] = new Plate(100);
        plats[2] = new Plate(10);
        boolean hun;
        int j = 0;                      //перебор тарелок
        for (int i = 0; i<5; i++){      //перебор котов
            hun = cats[i].eat(plats[j]);
            if (!hun){
                i--;
                if (j<2){       //перебор тарелок
                    j++;
                } else {
                    break;
                }
            }
        }
        for (int i = 0; i<5; i++){ //вывод состояния котов
            cats[i].info();
        }
        plats[0].addFood(300); // пополнение тарелки
        plats[0].info1();
        plats[1].info1();
        plats[2].info1();
    }
}