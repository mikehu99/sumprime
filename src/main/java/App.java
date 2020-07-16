public class App {
    public static void main(String[] args) {

        System.out.println(sumPrime(1, 100000)+sumPrime(100001, 200000));
        System.out.println("solution1:Multithreaded execution");
        System.out.println("solution2:Break up a number into smaller Numbers" );

    }
    private static long sumPrime(long from,long to) {
        long sum=0;
        if (from==2 || from==1){
            sum=2;
        }
        if (from%2==0){
            from++;
        }
        for(long x=from;x<=to;x+=2) {
            if(isPrime(x)) {
                sum+=x;
            }
        }
        return sum;
    }

    private static boolean isPrime(long num) {
        if(num<2)
            return false;
        if(num==2)
            return true;
        for(long i=2;i<=Math.sqrt(num);i++) {
            if(num%i==0)
                return false;
        }
        return true;
    }

}
