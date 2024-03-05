package muuntaja;

public class FahrToCel {

    public static float convertFahr(float f){
        float c = (f-32)*5/9;
        return Math.round(c);
    }

    public static float kelvinToCel(float kel) {
        float c = kel - 273.15f;
        return Math.round(c);
    }

    public static float convertKeltoFahr(float kel) {
        float f = ((kel - 273.15f) * 9/5 + 32);
        return Math.round(f);
    }

    public static void main(String[] args) {
        float f = 32;
        System.out.println("Fahrenheit: " + f);
        System.out.println("Celsius: " + convertFahr(f));
        System.out.println("Kelvin to Fahrenheit: " + convertKeltoFahr(373.15f));
    }
}

