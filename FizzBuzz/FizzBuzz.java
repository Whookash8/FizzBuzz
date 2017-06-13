package FizzBuzz;

/**
 * Created by Łukasz on 2017-06-13.
 */
public class FizzBuzz {
    public static void main(String[] args){
        System.out.println("Program prints the numbers from 1 to 100.\n" +
                "But for multiples of three print “Fizz” instead of the number" +
                " and for the multiples of five print “Buzz”. For numbers which are multiples " +
                "of both three and five print “FizzBuzz”");

        for(int i=1 ; i<=100 ; i++){
            if(i%3==0)
                System.out.print("Fizz");
            if(i%5==0)
                System.out.print("Buzz");
            if(i%3!=0 && i%5!=0)
                System.out.print(i);
            System.out.print(", ");
        }
    }
}
