class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            if (!isVowel(arr[l])) {
                l++;
            } else if (!isVowel(arr[r])) {
                r--;
            } else {
               swap(arr, l, r);
    l++;
    r--;
            }
        }
        return new String(arr);
    }
    public boolean isVowel(char ch) {
        return ch == 'A' || ch == 'a' ||
               ch == 'E' || ch == 'e' ||
               ch == 'I' || ch == 'i' ||
               ch == 'O' || ch == 'o' ||
               ch == 'U' || ch == 'u';
    }
    public void swap(char[] arr, int i, int j) {
    char temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
}
