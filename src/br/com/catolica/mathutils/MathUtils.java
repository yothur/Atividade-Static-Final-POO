package br.com.catolica.mathutils;

public class MathUtils {


    public static int calcularFatorial(int numero){
        int fatorial = 1;
        for (int i = numero; i >= 1; i--) {
            fatorial *= i;
        }
        return fatorial;
    }



    public static void primo(int numero) {
        int cont = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                cont++;
            }
        }
        if (cont == 2) {
            System.out.printf("%d É primo!\n", numero);
        }else {
            System.out.printf("%d Não é primo!\n", numero);
        }
    }

    public static void converterCelsiusParaFahrenheitKelvin(double temperatura){
        double fahrenheit = (temperatura * 1.8) + 32;
        double kelvin = temperatura + 273;
        System.out.printf("%.1f°C em Fahrenheit é %.1fF\n", temperatura, fahrenheit);
        System.out.printf("%.1f°C em Kelvin é %.1fK\n", temperatura, kelvin);
    }

    public static void converterFahrenheitParaCelsiusKelvin(double temperatura){
        double celsius = (temperatura - 32) / 1.8;
        double kelvin = (temperatura - 32) * 5/9 + 273.15;
        System.out.printf("%.1fF em Celsius é %.1f°C\n", temperatura, celsius);
        System.out.printf("%.1fF em Kelvin é %.1fK\n", temperatura, kelvin);
    }

    public static void converterKelvinParaCelsiusFahrenheit(double temperatura){
        double celsius = temperatura - 273.15;
        double fahrenheit = (temperatura - 273.15) * 1.8 + 32;
        System.out.printf("%.1fK em Celsius é %.1f°C\n", temperatura, celsius);
        System.out.printf("%.1fK em Fahrenheit é %.1fF\n", temperatura, fahrenheit);
    }

    public static void main(String[] args) {

        System.out.println(calcularFatorial(5));
        primo(3);
        primo(6);
        primo(7);
        converterCelsiusParaFahrenheitKelvin(20);
        converterFahrenheitParaCelsiusKelvin(20);
        converterKelvinParaCelsiusFahrenheit(20);
    }
}
