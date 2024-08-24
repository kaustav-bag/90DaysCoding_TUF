class ReverseSpecificWordsInSentence{
    public static void main(String[] args) {
        String str="Have a good life and all";
        System.out.println(reverseSpecificWordsInSentence(str));
    }
    
    public static String reverseSpecificWordsInSentence(String str){
        String[] words=str.split(" ");
        String wordToReverse=words[2];
        
        StringBuilder builder=new StringBuilder();
        //StringBuilder builder1=new StringBuilder();
        for(String s:words){
            if(s.equals(wordToReverse)){
                String reverseWord=new StringBuilder(wordToReverse).reverse().toString();
                builder.append(reverseWord+" ");
            }
            else {
                builder.append(s+" ");
            }
           
        }
        return builder.toString();
        
    }
}