import domain.Bottle;
import domain.HotDrink;
import domain.Product;
import services.CoinDispenser;
import services.Display;
import services.Holder;
import services.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) throws Exception {

        // Создание продуктов
        Product item1 = new Product(100, 12, "Lays", 1234);
        Product item2 = new Product(120, 14, "Nuts", 1235);
        Product item3 = new Product(90, 16, "Chips", 1236);
        Product item4 = new Product(20, 18, "Milka", 1237);
        Product item5 = new Product(60, 1, "3Korochki", 1238);
        Product item6 = new Product(150, 2, "Snikers", 1239);
        // Создание напитка
        Product item7 = new Bottle(150, 3, "Cola", 1240, 0.5f);
        // Создание горячих напитков
        Product item8 = new HotDrink(110, 4, "Coffee", 1241, 0.2f, 60);
        Product item9 = new HotDrink(100, 5, "Tee", 1242, 0.2f, 75);
        Product item10 = new HotDrink(120, 5, "Capuccino", 1243, 0.2f,60);

        // Создание сервисов
        Holder holder = new Holder();
        CoinDispenser coinDispenser = new CoinDispenser();
        Display display = new Display();

        // Создание списка продуктов
        List<Product> products = new ArrayList<>();

        // Добавление продуктов в список
        products.add(item1);
        products.add(item2);
        products.add(item3);
        products.add(item4);
        products.add(item5);
        products.add(item6);
        products.add(item7);
        products.add(item8);
        products.add(item9);
        products.add(item10);

        // Создание автомата продуктов
        VendingMachine vendingMachine = new VendingMachine(holder, coinDispenser, display, products);

        // Получение списка созданных продуктов
        for (Product p: vendingMachine.getProducts()) {
            System.out.println(p);
        }
    }
}