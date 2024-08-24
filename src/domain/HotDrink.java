package domain;

public class HotDrink extends Product{

    // Поля
    private int temperature;
    private float volume;

    // Конструктор
    public HotDrink(int price, int place, String name, long id, float volume, int temperature) {
        super(price, place, name, id);
        this.volume = volume;
        this.temperature = temperature;
    }

    // Геттеры и сеттеры
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

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
                + "volume = " + this.volume + "\n"
                + "temperature = " + this.temperature + "\n";
    }
}
