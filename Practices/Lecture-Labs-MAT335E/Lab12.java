public class Lab12{
    public static double fahrenheitToKelvin(double fahrenheit){
        return (fahrenheit-32)/1.8 + 273.15;
    } 
    public static double kelvinToFahrenheit(double kelvin){
        return (kelvin-273.15)*1.8 + 32;
    }   
    public static void main(String[] args){
        
        double fTemp = 62;
        double kTemp = 230;
        System.out.printf("%.2f Fahrenheit = %.2f Kelvin'dir.%n",fTemp, fahrenheitToKelvin(fTemp));
        System.out.printf("%.2f Kelvin = %.2f Fahrenheit'tir.", kTemp, kelvinToFahrenheit(kTemp));
    }
}