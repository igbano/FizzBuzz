public class FizzBuzz {

    public String calc(Integer number) {

        String calcResult = "";

        if(number % 3 == 0) {
            calcResult += "Fizz";
        }
        if(number % 5 == 0) {
            calcResult += "Buzz";
        }
        if (calcResult.equals("")) {
            calcResult = String.valueOf(number);
        }

        return calcResult;
    }
}