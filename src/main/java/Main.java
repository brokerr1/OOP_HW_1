import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 * Home Work #1
 a. Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
 b. Создать класс ГорячихНапитковАвтомат наследующий от ТорговыйАвтомат и реализовать метод getProduct(String name, int volume, int temperature) выдающий продукт соответствующий имени, объему и температуре
 c. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику заложенную в программе
 d. Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
 */
public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>(
                Arrays.asList(
                        new Product("Mars", 100.5),
                        new Product("Twix", 50.00)
                )
        );

        Vending vending = new Vending(list);
        String key = "Mars";
        System.out.println(vending.getProductByName(key));

        List<Product> listDrink = new ArrayList<Product>(
                Arrays.asList(
                        new Drink("CocaCola", 99.90, 0.5),
                        new Drink("Sprite", 49.90, 0.75)
                )
        );
        Vending vendingDrink = new VendingDrink(listDrink);
        String keyDrink = "Sprite";
        System.out.println(vendingDrink.getProductByName(keyDrink));

        List<Product> listHotDrink = new ArrayList<Product>(
                Arrays.asList(
                        new HotDrink("Coffee", 99.90, 0.15, 45.2),
                        new HotDrink("Tea", 49.90, 0.35, 60.5)
                )
        );
        Vending vendingHotDrink = new VendingHotDrink(listHotDrink);
        String keyHotDrink = "Tea";
        System.out.println(vendingHotDrink.getProductByName(keyHotDrink));
        System.out.println(list);
        System.out.println(listDrink);
        System.out.println(listHotDrink);

    }
}
