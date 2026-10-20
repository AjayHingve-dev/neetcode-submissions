class Solution {
    public boolean isPalindrome(String s) {
        char ch[]= s.toLowerCase().toCharArray();
        int start = 0;
        int end = ch.length-1;
        while(start<end){

                 while (start < end && !Character.isLetterOrDigit(ch[start])) {
                start++;
            }

            while (start < end && !Character.isLetterOrDigit(ch[end])) {
                end--;
            }
            if(ch[start]!=ch[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
        
    }
}
