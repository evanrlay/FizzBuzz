public class ThirdFizzBuzz {
    public static void main(String[] args)
    {
        System.out.println(getSolutionForNumber(20));
    }

    public static String getSolutionForNumber(int targetNumber) {
        StringBuilder output = new StringBuilder();
        int lucky, fizz, buzz, fizzbuzz, integer;
        lucky = fizz= buzz = fizzbuzz = integer = 0;

        for(int i = 1; i <= targetNumber; i++){
            String number = String.valueOf(i);
            if(number.contains("3")) {
                output.append("lucky ");
                lucky++;
            }
            else if(i%3 == 0 && i%5 == 0){
                output.append("fizzbuzz ");
                fizzbuzz++;
            }
            else if (i%3 == 0){
                output.append("fizz ");
                fizz++;
            }
            else if(i%5 == 0){
                output.append("buzz ");
                buzz++;
            }
            else {
                output.append(i + " ");
                integer++;
            }
        }

        output.append("\nfizz: " + fizz);
        output.append("\nbuzz: " + buzz);
        output.append("\nfizzbuzz: " + fizzbuzz);
        output.append("\nlucky: " + lucky);
        output.append("\ninteger: " + integer);
        return output.toString();
    }
}
