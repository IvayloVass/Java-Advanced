package Lab07_Generics.P03_Scale;

public class Main {
    public static void main(String[] args) {
        Scale<Integer> scale = new Scale<>(5, 82);
        Scale<String> scale1 = new Scale<>("5", "82");
        Scale<Double> scale2 = new Scale<>(5.3, 8.2);

    }
}
