class Solution {
    public int maxDepth(String s) {
        String st="";
        for(int k=0;k<s.length();k++){
            if(s.charAt(k)=='(' || s.charAt(k)==')'){
                st+=s.charAt(k);
            }
        }
        int o=0;
        int o1=0;
        int c=0;

        for(int i=0;i<st.length();i++){
            if(st.charAt(i)=='('){
                o++;
                if(o>o1)
                o1=o;
            }
            else if(st.charAt(i)==')'){
                o--;
            }
        }
        return o1;
    }
}