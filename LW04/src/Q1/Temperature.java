package Q1;

public class Temperature {
    private double celsius;

    public Temperature(){
        this.celsius = 0.0;
    }

    public Temperature(double celsius){
        this.celsius = celsius;
    }

    public double toCelsius() {
        return this.celsius;
    }

    public double toFahrenheit() {
        return (this.celsius* 9.0 / 5.0) + 32.0;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public void setFahrenheit(double fahrenheit) {
        this.celsius = (fahrenheit - 32.0) * 5.0 / 9.0;
    }
}
