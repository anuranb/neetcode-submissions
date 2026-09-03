class Solution {
    public boolean isPalindrome(String s) {
        char[] chs = s.toCharArray();
        int l=0, r=chs.length-1;
        while(l<=r){
            while(!checkValidCharacter(chs[l]) && l<chs.length-1)
                l+=1;
            while(!checkValidCharacter(chs[r]) && r>0)
                r-=1;
            if(l>r) break;
            System.out.println(l+", "+r);
            System.out.println(chs[l]+", "+chs[r]);
            if(Character.toLowerCase(chs[l]) != Character.toLowerCase(chs[r]))
                return false;
            l++;
            r--;
        }
        System.out.println(chs);
        return true;
    }

    public boolean checkValidCharacter(char ch) {
        if (ch >= 'a' && ch <= 'z') return true;
        if (ch >= 'A' && ch <= 'Z') return true;
        if (ch >= '0' && ch <= '9') return true;
        return false;
    }
}
