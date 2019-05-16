package season1.IsPrimeLessLength;

public class isPrime1 {
    public static void main(String[] args) {
        System.out.printf("Cac so nguyen to nho hon 100: ");

        int N;
            for ( N=2;N<100;N++){
                boolean checkPrime = true;
                for (int i=2;i<=Math.sqrt(N); i++){
                    if (N%i==0){
                        checkPrime = false;
                        break;
                    }
                }
                if (checkPrime){
                    System.out.printf(" "+N);
                }
            }



    }
}
