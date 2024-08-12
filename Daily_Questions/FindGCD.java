class FindGCD{
    public static void main(String[] args) {
        System.out.println(findGCD(12,18));

    }
    static int findGCD(int num1, int num2){
        int GCD=1;
        if(num1>num2) {
            int i = 1;
            while (i <= num2) {
                if (num1 % i == 0 && num2 % i == 0) {
                    GCD = i;
                }
                i++;
            }
            return GCD;
        }
           else{
                int i=1;
                while(i<=num1){
                    if(num1%i==0 && num2%i==0){
                        GCD=i;
                    }
                    i++;
                }
            return GCD;
           }
       //    return 1;
    }
}