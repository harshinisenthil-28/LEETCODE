class Solution {
public:
    int minAddToMakeValid(string s) {
        int count=s.size();
        stack <int> st;
        for(int i=0;i<s.size();i++){
            if(s[i]=='('){
                st.push(s[i]);
                count=count-1;
            }
            else{
                if(!st.empty()){
                    st.pop();
                    count=count-1;
            }
            }
            
        }
        int size=st.size()+count;
        return size;
    }
};