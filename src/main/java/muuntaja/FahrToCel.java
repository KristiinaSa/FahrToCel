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

    public static void main(String[] args) {
        float f = 32;
        System.out.println("Fahrenheit: " + f);
        System.out.println("Celsius: " + convertFahr(f));
    }
}

