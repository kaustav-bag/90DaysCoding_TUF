class MaxWordCount2{
    public static void main(String[] args) {
        String[] sentences={"Alice and bob like Coding","I think too","this is great thank you so much"};
        int maxLen=0;
        for(String word:sentences){
            String[] splittedStr=word.split(" ");
            int splittedWordLen= splittedStr.length;
            if (splittedWordLen>maxLen) maxLen=splittedWordLen;
        }
        System.out.println(maxLen);
    }

}