class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charset = new HashSet<>();
        int max=0, l=s.length(), left=0;
        char ch;
        for(int i=0; i<l; i++) {
            char temp = s.charAt(i);
            if(!charset.contains(temp))
                charset.add(temp);
            else {
                int len = charset.size();
                if (len>max)
                    max=len;
                while (charset.contains(temp)) {
                    charset.remove(s.charAt(left));
                    left++;
                }
                charset.add(temp);
            }
        }
        if(charset.size()>max)
            max=charset.size();
        return max;
    }
}
