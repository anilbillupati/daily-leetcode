class Solution {
    public String customSortString(String order, String s) {
        int freq[]=new int[26];
        for(char ch: s.toCharArray()){
            freq[ch-'a']++;
        }
        StringBuilder ans=new StringBuilder();
        for(char orderchar:order.toCharArray()){
            while (freq[orderchar-'a']>0){
                ans.append(orderchar);
                freq[orderchar-'a']--;
            }

        }
        for(int i=0;i<26;i++){
            int freqchar=freq[i];
            while(freqchar>0){
                ans.append((char)(i+'a'));
                freqchar--;
            }
        }
        return ans.toString();
    }
}
