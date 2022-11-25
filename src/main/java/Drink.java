public class Drink extends Product{
    Double volume;
    public Drink(String name, Double cost, Double volume) {
        super(name, cost);
        this.volume = volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return  super.toString() +
                ", volume=" + volume;
    }
}
