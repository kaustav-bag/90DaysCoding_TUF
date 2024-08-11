class GetNumberOfDigits{
    public static void main(String[] args) {
        int originalNum=17;
        int num=17;
        int count=0;
        while(num>0){
            int digit=num%10;
            if(digit!=0){
                if (originalNum%digit==0){
                    count++;
                }
            }
            num=num/10;
        }
        System.out.println(count);
    }
}