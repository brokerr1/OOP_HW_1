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
                        new Product("Twix", 50.00),
                        new Product("Snickers", 70.00),
                        new Product("Bounty", 80.00),
                        new Product("Milka", 120.00)
                )
        );

        Vending vending = new Vending(list);
        String key = "Bounty";
        System.out.println(vending.getProductByName(key));

        List<Product> listDrink = new ArrayList<Product>(
                Arrays.asList(
                        new Drink("CocaCola", 99.90, 0.5),
                        new Drink("Sprite", 49.90, 0.75),
                        new Drink("Fanta", 69.90, 0.75),
                        new Drink("ColaZero", 89.90, 0.5),
                        new Drink("CocaCola", 49.90, 1.5)
                )
        );
        Vending vendingDrink = new VendingDrink(listDrink);
        String keyDrink = "Sprite";
        System.out.println(vendingDrink.getProductByName(keyDrink));

        List<Product> listHotDrink = new ArrayList<Product>(
                Arrays.asList(
                        new HotDrink("Coffee", 99.90, 0.150, 45.2),
                        new HotDrink("Tea", 49.90, 0.5, 60.5),
                        new HotDrink("Coffee", 149.90, 0.200, 40.5),
                        new HotDrink("Coffee", 59.90, 0.250, 42.5),
                        new HotDrink("Tea", 49.90, 0.45, 70.5),
                        new HotDrink("Coffee", 79.90, 0.235, 36.6),
                        new HotDrink("Tea", 49.90, 0.44, 80.5),
                        new HotDrink("Coffee", 79.90, 0.350, 50.5)
                )
        );
        VendingHotDrink vendingHotDrink = new VendingHotDrink(listHotDrink);
        String keyHotDrinkName = "Tea";
        Double keyVolume = 0.45;
        Double keyTemp = 70.5;
        System.out.println(vendingHotDrink.getProductByName(keyHotDrinkName));
        System.out.println(vendingHotDrink.getProduct(keyHotDrinkName,keyVolume,keyTemp));

    }
}
