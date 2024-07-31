class Pattern14{
    public static void main(String[] args) {
        int start=1;
        int i=1;
        int n=5;
        while(i<=5){
            if(i%2==0) start=0;
            else start=1;
            for(int j=1;j<=i;j++){
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
            i++;
        }
    }
}