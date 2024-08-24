package domain;

public class Bottle extends Product {

    // Поле
    private float volume;

    // Конструктор
    public Bottle(int price, int place, String name, long id, float volume) {
        super(price, place, name, id);
        this.volume = volume;
    }

    // Геттеры и сеттеры
    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    // Метод для печати экземпляра класса
    @Override
    public String toString() {
        return  super.toString()
                + "volume = " + this.volume + "\n";
    }
}
