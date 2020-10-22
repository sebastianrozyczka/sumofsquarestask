import java.util.Scanner;

public class InformationGetter {
    Scanner scanner = new Scanner(System.in);
    public double[] getSizeAndCreateTable() {
        System.out.println("Podaj wielkość tablicy:");
        int arraySize = scanner.nextInt();
         
        return new double[arraySize];
    }

    public double[] getNumbersForTable(double[] numbers) {
        System.out.println("Podaj jakie numery powinny znaleźć się w tablicy: ");
        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Podaj liczbę dla indeksu " + i + ":" );
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }
}
