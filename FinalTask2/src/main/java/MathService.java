public class MathService {

    public int getD(int a, int b, int c) {
        return b * b - 4 * a * c;
    }
    public Pair<Double, Double> getRoots(int a, int b, int c) throws NotFoundAnswerException {
        int d = getD(a, b, c);

        if (d < 0) {
            throw new NotFoundAnswerException("The equation has no real roots.");
        }
        if (d == 0) {)
            double x = (-b) / (2.0 * a);
            return new Pair<>(x, x);
        }
        double x1 = (-b + Math.sqrt(d)) / (2.0 * a);
        double x2 = (-b - Math.sqrt(d)) / (2.0 * a);
        return new Pair<>(x1, x2);
    }
}
