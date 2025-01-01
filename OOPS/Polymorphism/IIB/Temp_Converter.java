// 1. Temperature Converter: Create a class that converts temperatures between Celsius and Fahrenheit. Use an instance initializer block to set default conversion factors.

class Converter{
    double CelsiusFactor;
    double FahrenheitFactor;

    {
        System.out.println("This is Instance Intialized Block");
        CelsiusFactor = 9.0/5.0;
        FahrenheitFactor = 5.0/9.0;
    }
    
    
    double conversionC2F( double Celsius){
       return ( (Celsius * CelsiusFactor) + 32);
    }
    
    double conversionF2C( double Fahrenheit){
       return (Fahrenheit - 32)* FahrenheitFactor;
    }

    
}

public class Temp_Converter {
    public static void main(String[] args) {
        Converter tempCon = new Converter();

        double cel = 25.0;
        double fah = tempCon.conversionC2F(cel);
        System.out.println(cel + "°C = " + fah + "°F");

        double fvalue = 77.0;
        double celius = tempCon.conversionF2C(fvalue);
        System.out.println(fvalue + "°F = " + celius + "°C");
    }
}
