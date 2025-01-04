package stringPrograms;
public class FrequencyOfChar {

    void getFreqChar(String input) {
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            int count = 0;
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == currentChar) {
                    count++;
                }
            }
            if (input.indexOf(currentChar) == i) {
                System.out.println(currentChar + " -> " + count);
            }
        }
    }

    public static void main(String[] args) {
        FrequencyOfChar assignment32 = new FrequencyOfChar();
        assignment32.getFreqChar("aakanksha");
    }
}