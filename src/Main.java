public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmiCalculate = service.calculate(65.5, 1.73);
        System.out.println(bmiCalculate);


    }
}
