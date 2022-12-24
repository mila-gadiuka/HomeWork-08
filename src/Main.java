import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Первая часть по теме массивы");

        System.out.println();

        //1

        int[] fruitBasket = new int[3]; //Объявление целочисленного массива
        fruitBasket[0] = 1;
        fruitBasket[1] = 2;
        fruitBasket[2] = 3;
        for (int i = 0; i != fruitBasket.length; i++) { //Распечатывание объектов массива в прямом порядке
            if (fruitBasket.length - 1 == i) {
                System.out.print(fruitBasket[i]);
            } else {
                System.out.print(fruitBasket[i] + ", ");
            }
        }
        System.out.println();
        for (int i = fruitBasket.length - 1; i >= 0; i--) { //Распечатывание объектов массива в обратном порядке
            if (i != 0) {
                System.out.print(fruitBasket[i] + ", ");
            } else {
                System.out.print(fruitBasket[i]);
            }
        }

        System.out.println();
        for (int i = 0; i != fruitBasket.length; i++) { //Переделывание несчетных целочисленных объектов массива на четные
            if (fruitBasket[i] % 2 == 1) {
                fruitBasket[i]++;
                System.out.print(fruitBasket[i] + " ");
            } else {
                System.out.print(fruitBasket[i] + " ");
            }
        }
        System.out.println();

        //2

        double[] arrDouble1 = {1.57, 7.654, 9.986}; //Объявление массива с дробными значениями
        int e = 0;
        while (e != arrDouble1.length) { //Распечатывание объектов массива в прямом порядке
            if (arrDouble1.length - 1 > e) {
                System.out.print(arrDouble1[e] + ", ");
            } else System.out.print(arrDouble1[e]);
            e++;
        }
        System.out.println();
        e = arrDouble1.length - 1; //Распечатывание объектов массива в обратном порядке
        while (e != -1) {
            if (e != 0) {
                System.out.print(arrDouble1[e] + ", ");
            } else System.out.print(arrDouble1[e]);
            e--;
        }
        System.out.println();

        //3

        int[] prom = {2, 5, 45, 78, 1}; //Объявление произвольного массива
        String q = Arrays.toString(prom);
        String help = String.join(", ", q);
        System.out.println(help.substring(1, help.length() - 1)); //Распечатывание объектов массива в прямом порядке
        //как запустить метод .reverse ?

        for (int i = prom.length - 1; i >= 0; i--) { //Распечатывание объектов массива в обратном порядке
            if (i != 0) {
                System.out.print(prom[i] + ", ");
            } else {
                System.out.print(prom[i]);
            }
        }
        System.out.println();
    }
}
