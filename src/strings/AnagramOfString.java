package strings;

public class AnagramOfString {
    public static void main(String[] args) {
        String str1 = "aab";
        String str2 = "abc";
        boolean isAnagram = false;
        boolean visited[] = new boolean[str1.length()];
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                char c = str1.charAt(i);
                isAnagram = false;
                for (int j = 0; j < str2.length(); j++) {
                    if (str2.charAt(j) == c && !visited[j]) {
                        visited[j] = true;
                        isAnagram = true;
                        break;
                    }
                }
                if (!isAnagram) {
                    break;
                }
            }//O(n^2)
            System.out.println(isAnagram);
        }
    }
}
