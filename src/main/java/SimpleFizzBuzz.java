public class SimpleFizzBuzz {
    public static void main(String[] args)
    {
        System.out.println(getSolutionForNumber(20));
    }

    public static String getSolutionForNumber(int targetNumber) {
        StringBuilder output = new StringBuilder();

        for(int i = 1; i <= targetNumber; i++){
            if(i%3 == 0 && i%5 == 0){
                output.append("fizzbuzz ");
            }
            else if (i%3 == 0){
                output.append("fizz ");
            }
            else if(i%5 == 0){
                output.append("buzz ");
            }
            else {
                output.append(i + " ");
            }
        }
        return output.toString();
    }
}
