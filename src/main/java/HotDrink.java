public class HotDrink extends Drink{
    Double temp;
    public HotDrink(String name, Double cost, Double volume, Double temp) {
        super(name, cost, volume);
        this.temp = temp;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }
}
