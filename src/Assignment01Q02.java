public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;

        /////////////////////////////////////////////
        // TODO: Fill in the Pi approxiamtion here
        /////////////////////////////////////////////
        double sum = 0.0;
        for (int i = 1; i <= 2 * Integer.parseInt(args[0]); i = i + 2) {
            if (i % 4 == 1) {
                sum += 1.0 / i;
            }
            else {
                sum -= 1.0 / i ;
            }
        }
        approxPi = sum * 4;      
        /////////////////////////////////////////////
        
        System.out.println(approxPi + " " + actualPi);
    }
}
