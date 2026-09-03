class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        Map<Character, Integer> freqMap = new HashMap<Character, Integer>();
        for(int i=0; i<s.length(); i++) {
            System.out.println(s.charAt(i));
            if(freqMap.containsKey(s.charAt(i))) {
                Integer x = freqMap.get(s.charAt(i)).intValue()+1;
                if(x.intValue()==0)
                    freqMap.remove(s.charAt(i));
                else freqMap.put(s.charAt(i), x);
            }                
            else 
                freqMap.put(s.charAt(i), 1);

            if(freqMap.containsKey(t.charAt(i))) {
                Integer x = freqMap.get(t.charAt(i)).intValue()-1;
                if (x.intValue()==0)
                    freqMap.remove(t.charAt(i)); 
                else freqMap.put(t.charAt(i), x);
            }    
            else 
                freqMap.put(t.charAt(i), -1);
        }
        if(freqMap.size() > 0)
            return false;
        return true;
    }
}
