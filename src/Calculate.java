public class Calculate {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        InformationGetter informationGetter = new InformationGetter();

        double[] emptyTable = informationGetter.getSizeAndCreateTable();
        double[] completedTable = informationGetter.getNumbersForTable(emptyTable);
        System.out.println(calculator.calculateOfSumOfSquares(completedTable));
    }
}
