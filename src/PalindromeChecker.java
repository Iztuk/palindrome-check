public class PalindromeChecker {
    public boolean isPalindrome(String text){
        String newText = text.toLowerCase();
        newText = newText.replaceAll("\\s", "");
        String flippedNewText = "";
        for(int i = newText.length() - 1; i >= 0; i--){
            flippedNewText += newText.charAt(i);
        }
        return newText.equals(flippedNewText);
    }
}
