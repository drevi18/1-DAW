
public class Temperatura {

    private double celsius;
    private double fahrenheit;

    public Temperatura(){
        this.celsius=1;
        this.fahrenheit=1;
    }

    public Temperatura(double c,double f){
        celsius=c;
        fahrenheit=f;
    }

    public double celsiusToFahrenheit() {

        return (celsius * 9 / 5) + 32;
    }

    public double fahrenheitToCelsius() {

        return (fahrenheit - 32) * 5 / 9;
    }
    
}
