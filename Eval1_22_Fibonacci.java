
/**
 *
 * @author moviles
 */
public class Eval1_22_Fibonacci {
    /*
    public static void main(String[] args) {
        int fibonacci = FibonacciNum(6);
        System.out.println(fibonacci);
    }

    public static int FibonacciNum(int n) {
        if (n == 0)
            return 0;
        else if (n <= 1)
            return 1;
        else

            return FibonacciNum(n - 1) + FibonacciNum(n - 2);
        
    }
    */
    public static void main(String[] args) {
        for (int i = 5; i >= 0; i--) {
            System.out.println(calcularFibo(i));
        }
        
    }
    public static int calcularFibo(int pos){
        //llamada recursiva
        //detener la llamada recursiva
        if(pos <=1)
            return 1;
        else
            return calcularFibo(pos -1)+calcularFibo(pos-2);
    }
    
}

