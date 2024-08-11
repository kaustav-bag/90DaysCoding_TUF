class NumberPalindrome{
    public static void main(String[] args) {
        int num=10;
        int original=num;
        int revNum=0;
        while(num>0){
            int digit=num%10;
            revNum=(revNum*10)+digit;
            num=num/10;
        }
        if(original==revNum){
            System.out.println("Palindrome");
        }
        else System.out.println("Not Palindrome");
    }
}