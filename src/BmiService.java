public class BmiService {
    public double calculate(double height, double weight) {
        double doubleHeight = height * height;
        double imt = weight/doubleHeight;
        return imt;
    }
}
