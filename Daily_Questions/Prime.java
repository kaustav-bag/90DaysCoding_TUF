class Prime{
    public static void main(String[] args) {
        //System.out.println(ifPrime(8));
        int i=0;
        while(i<=100){
            if(ifPrime(i)){
                System.out.println(i);

            }
            i++;
        }
    }
    static boolean ifPrime(int num){
        if(num<2) return false;
        int i=2;
        while(i*i<=num){
            if(num%i==0) return false;
            i++;
        }
        return true;
    }
}