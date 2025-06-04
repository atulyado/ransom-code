class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
         char[] note = ransomNote.toCharArray();
         char[] m = magazine.toCharArray();
         int[] count = new int[26];// for counting each letter (a-z)
         for(int n : m){// Count how many times each letter appears in magazine
            count[n - 'a']++;
         }
         for(int n : note){ // Try to use letters for ransomNote
            if(count[n - 'a'] == 0){
                return false;// not enough of this letter
            }
            count[n - 'a']--;// use one letter
         }
         return true;// all letters are available
    }
}