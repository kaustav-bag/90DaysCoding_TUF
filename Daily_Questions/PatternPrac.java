class PatternPrac{
    public static void main(String[] args) {
        int i=1;
        int n=5;
       int j=0;
        while(i<n){
            for(int k=0;k<i;k++){
                j+=1;
                
                System.out.print(j+" ");
            }
            System.out.println();
            i++;
        }

    }
}