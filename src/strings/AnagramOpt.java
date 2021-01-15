package strings;

public class AnagramOpt {
    public static void main(String[] args) {
        String str1 = "abdab";
        String str2 = "bbaa";
        //sorting algorithms O(logn);
        //frequency array method
        boolean isAnagram = true;
        int al[] = new int[256];

        for (char c : str1.toCharArray()) {
            int index = (int) c;
            al[index]++;
        }
        for (char c : str2.toCharArray()) {
            int index = (int) c;
            al[index]--;
        }
        for (int i = 0; i < 256; i++) {
            if (al[i] != 0) {
                isAnagram = false;
                break;

            }
        }
        if (isAnagram) {
            System.out.println("is Anagram");
        } else {
            System.out.println("not anagram");
        }

    }
}
