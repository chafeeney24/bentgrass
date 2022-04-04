package CodeWarsSandBox;

public class Factorial {

    public int factorial(int n) throws IllegalArgumentException {
        int total = 1;
        if(n == 0)
            total = 0;
       try {
           for (int i = 1; i <= n; i++) {
               total *= i;
           }
       } catch(IllegalArgumentException e){
           System.out.println("Number is ");
       }

        return total;
    }
}
