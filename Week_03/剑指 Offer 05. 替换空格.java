class Solution {
    public String replaceSpace(String s) {
        if (s == null || s == "")
            return s;
        var strBuilder = new StringBuilder();
        for (var i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                strBuilder.append("%20");
            } else {
                strBuilder.append(s.charAt(i));
            }
        }
        return strBuilder.toString();
    }
}