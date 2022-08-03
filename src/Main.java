public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double height = 1.6;
        double weight = 50;
        double bmi = service.calculate(height, weight);
        System.out.println("Индекс массы тела = " + bmi);
    }

}
