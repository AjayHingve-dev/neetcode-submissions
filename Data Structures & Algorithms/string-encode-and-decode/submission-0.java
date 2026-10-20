

class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();

        for (String str : strs) {
            // Store the string length, delimiter, and string
            encoded.append(str.length())
                   .append("#")
                   .append(str);
        }

        return encoded.toString();
    }

    public List<String> decode(String encodedString) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < encodedString.length()) {
            // Find the delimiter after the length
            int j = i;

            while (encodedString.charAt(j) != '#') {
                j++;
            }

            // Extract the length
            int length = Integer.parseInt(
                encodedString.substring(i, j)
            );

            // Extract exactly 'length' characters
            int start = j + 1;
            int end = start + length;

            result.add(encodedString.substring(start, end));

            // Move to the next encoded string
            i = end;
        }

        return result;
    }
}
