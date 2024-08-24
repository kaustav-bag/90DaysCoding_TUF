class ReverseWordsInSentence{
    
    /* Sample Input--> "My Name Is Kaustav"
    Sample Output-->"Kaustav Is Name My"
     */
    
    //Asked In Capgemini

    public static void main(String[] args) {
        String str="My Name Is Kaustav";
        System.out.println(reverseWordsInSentence2(str).trim());
    }
    
    public static String reverseWordsInSentence(String str){
      String[] words=str.split(" ");
      StringBuilder builder=new StringBuilder();
      int i=words.length-1;
      
      while(i>=0){
          builder.append(words[i]+" ");
          i--;
      }
      return builder.toString();
    }

    public static String reverseWordsInSentence2(String str){
        String[] words=str.split(" ");
        String reverseWords="";
        int i= words.length-1;
        
        while(i>=0){
            reverseWords+=words[i]+" ";
            i--;
        }
        return reverseWords;
    }


}