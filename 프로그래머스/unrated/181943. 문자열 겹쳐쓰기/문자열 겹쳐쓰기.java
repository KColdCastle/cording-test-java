class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        try {
            StringBuffer sb = new StringBuffer(my_string);
            // sb.replace(s, 12, overwrite_string);
            answer = sb
                    .replace(s, my_string.length() - (my_string.substring(s).length() - overwrite_string.length()),
                            overwrite_string)
                    .toString();
        } catch (StringIndexOutOfBoundsException e) {
        }
        return answer;
    }
}