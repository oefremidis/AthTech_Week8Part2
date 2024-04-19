public class CoffeeCup {
    private int temperature;
    private int content;

    public CoffeeCup(int temperature, int content) {
        this.temperature = temperature;
        this.content = content;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "CoffeeCup{" +
                "temperature=" + temperature +
                ", content=" + content +
                '}';
    }
}
