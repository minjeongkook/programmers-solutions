import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (a, b) -> {
            char ca = a.charAt(n);
            char cb = b.charAt(n);

            if(ca == cb) {
                return a.compareTo(b);
            }

            return Character.compare(ca,  cb);
        });

        return strings;
    }
}
