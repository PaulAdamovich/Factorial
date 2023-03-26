public class Factorial {
    private static Long calculate(long i){
        long result = 1;
        if(i < 0){
            System.out.println("Why do you need factorial from the negative number?");
            return null;
        }
        if (i == 0){
            return result;
        }
        result = i * calculate(i-1);//Recursion
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Factorial = " + Factorial.calculate(13));
    }
}