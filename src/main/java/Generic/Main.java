package Generic;

public class Main {
    public static void main(String[] args) {
        genericClass<Integer> intDeger = new genericClass<>(3453);
        intDeger.Yazdir();

        genericClass<String> stringDeger = new genericClass<>("Gönül Çetin");
        stringDeger.Yazdir();

        genericClass<Double> doubleDeger = new genericClass<>(4.45);
        doubleDeger.Yazdir();
    }
}
