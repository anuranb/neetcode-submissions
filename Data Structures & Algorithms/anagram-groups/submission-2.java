class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupMap = new HashMap<String, List<String>>();
        for (int i=0; i< strs.length; i++) {
            String key = returnKey(strs[i]);
            if (groupMap.containsKey(key))
                groupMap.get(key).add(strs[i]);
            else {
                List<String> newList = new ArrayList<String>();
                newList.add(strs[i]);
                groupMap.put(key, newList);
            }
        }
        List<List<String>> returnVal = new ArrayList<List<String>>(groupMap.values());
        return returnVal;
    }

    public String returnKey(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
