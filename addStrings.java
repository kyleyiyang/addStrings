// very slow
class Solution {
    public String addStrings(String num1, String num2) {
        String ans = "";
        String s = num1;
        String l = num2;
        if (num1.length()>num2.length()) {
            l = num1;
            s = num2;
        }
        ans = l.substring(0,l.length()-s.length());
        for (int i=0;i<s.length();i++) {
            int sum = ((l.charAt(l.length()-s.length()+i) - '0') + (s.charAt(i) - '0'));
            if (sum<10) {
                ans += String.valueOf(sum);
            } else {
                int j = ans.length();
                if (j==0) ans = String.valueOf(sum);
                else {
                if (ans.charAt(j-1) != '9') {
                    ans = ans.substring(0,j-1) + String.valueOf((ans.charAt(j-1) -'0'+ 1))+String.valueOf(sum-10);
                } else {
                    ans += String.valueOf(sum-10);
                while (j>0 && ans.charAt(j-1) == '9') {
                    ans =  ans.substring(0,j-1) + "0"+ans.substring(j);
                    j--;
                }
                if (j==0) {
                    ans = "1" + ans;
                } else {
                    ans = ans.substring(0,j-1) + String.valueOf((ans.charAt(j-1)-'0' + 1)) + ans.substring(j);
                    
                }
                }
                }
            }
        }
        return ans;
    }
}
