public class Factorial {
    private final int n;

    public Factorial(int i) {
        n=i;
    }

    public int calculateFactorial() {
        if(n==1)
        {
            return 1;
        }
        if(n<0)
        {
            return 0;
        }
        int result=1;
        for(int i=1;i<=n;i++)
        {
            result=result*i;
        }
        return result;
    }
}
