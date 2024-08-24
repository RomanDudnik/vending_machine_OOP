package services;

import domain.Product;

import java.util.List;

public class VendingMachine {

    // Поля (зависимости от классов)
    private Holder holder;
    private CoinDispenser coinDispenser;
    private Display display;
    private List<Product> products;

    // Конструктор
    public VendingMachine(Holder holder, CoinDispenser coinDispenser, Display display, List<Product> products) {
        this.holder = holder;
        this.coinDispenser = coinDispenser;
        this.display = display;
        this.products = products;
    }

    // Метод для покупки продукта
    public void buyProduct() {

    }

    // Метод для выдачи продукта
    public void releaseProduct() {

    }

    // Геттеры и сеттеры
    public Holder getHolder() {
        return holder;
    }

    public void setHolder(Holder holder) {
        this.holder = holder;
    }

    public CoinDispenser getCoinDispenser() {
        return coinDispenser;
    }

    public void setCoinDispenser(CoinDispenser coinDispenser) {
        this.coinDispenser = coinDispenser;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
