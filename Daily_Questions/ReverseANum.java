class ReverseANum{
    public static void main(String[] args) {
        int num=12345;
        int revNum=0;

        while(num>0){
             int rem=num%10;
           // System.out.print(revnum);
            revNum=(revNum*10)+rem;
            num=num/10;
        }
        System.out.println(revNum);
    }
}