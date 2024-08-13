
class ArmStrongNumber{
    public static void main(String[] args) {
      //  System.out.println(armStrong(376));
        int i=1;
        while(i<=1000){
            if(armStrong(i)){
                System.out.println(i);
            }
            i++;
        }
    }
    static boolean armStrong(int num){
        int digitCount=0;
        int num1=num;
        int originalNum=num;
        while(num>0){
            int digit=num%10;
            digitCount++;
            num=num/10;
        }

        int sum=0;
        while(num1>0){
            int digit=num1%10;
            sum+=Math.pow(digit,digitCount);
            num1=num1/10;

        }
        if(sum==originalNum) return true;
        return false;
    }
}