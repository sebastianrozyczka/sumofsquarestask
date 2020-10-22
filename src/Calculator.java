public class Calculator {
    public double calculateOfSumOfSquares(double [] numbers) {
        double sum = 0;
        for(double number : numbers) {
            double squareNumber = Math.pow(number, 2);
            sum += squareNumber;
        }
        return sum;
    }
}
