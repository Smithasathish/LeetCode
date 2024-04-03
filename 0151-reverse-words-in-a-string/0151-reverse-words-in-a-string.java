class Solution {
    public String reverseWords(String s) {
        String[] word = s.split("\\s+");//hello smitha yes
        String reverseS = " ";
        for(int i = word.length-1; i>=0; i--){
            reverseS = reverseS+word[i];
            reverseS = reverseS+" ";

        }
        return reverseS.trim();


        
        
    }
}