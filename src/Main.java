public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();
        double weight = 75;
        double height = 172;
        double result = bmiService.calculate(weight, height);
        System.out.println("Ваш индекс массы тела " + result);
    }
}
