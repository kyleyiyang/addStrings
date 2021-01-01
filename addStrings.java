class Solution {
    public String addStrings(String num1, String num2) {
        String ans = "";
        String s = num1;
        String l = num2;
        if (num1.length()>=num2.length()) {
            l = num1;
            s = num2;
        }
        int sum=0;
        for (int i=0;i<l.length();i++) {
            if (i<s.length()) {
                sum += ((l.charAt(l.length()-i-1) - '0') + (s.charAt(s.length()-i-1) - '0')) * (Math.pow(10,i));
                System.out.println(sum);
            } else {
                sum += ((l.charAt(l.length()-i-1) - '0') * (Math.pow(10,i)));
                System.out.println("i="+i+";"+String.valueOf(((l.charAt(l.length()-i-1) - '0') * (Math.pow(10,i)))));
                System.out.println("sum="+sum);
            }
        }
        return String.valueOf(sum);
    }
}
