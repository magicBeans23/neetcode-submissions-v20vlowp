class Solution {

    public String encode(List<String> strs) {
          StringBuilder result = new StringBuilder();
        for(String s : strs){
            int l = s.length();
                result.append(l).append("#").append(s);
        }
        return result.toString();
    }

    public List<String> decode(String str) {
           List<String> result = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            StringBuilder lengthBuilder = new StringBuilder();
            while (currentChar != '#') {
                lengthBuilder.append(currentChar);
                i++;
                currentChar = str.charAt(i);
            }
            int length = Integer.parseInt(lengthBuilder.toString());
            i++;
            String s = str.substring(i, i + length);
            result.add(s);
            i += length - 1;
        }
        return result;
    }
}
