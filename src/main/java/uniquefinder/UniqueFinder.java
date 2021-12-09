package uniquefinder;

import java.util.ArrayList;
import java.util.List;

public class UniqueFinder {

    public List<Character> getUniqueChars(String word) {
        List<Character> result = new ArrayList<>();

        if (word == null) {
            throw new IllegalArgumentException("Text is null.");
        } else {
            for (int i = 0; i < word.length(); i++) {
                if (containsList(result, word.charAt(i)) == false) {
                    result.add(word.charAt(i));
                }
            }
        }
        return result;
    }

    private boolean containsList(List<Character> result, char a) {
        for (Character c : result) {
            if (a == c) {
                return true;
            }
        }
        return false;
    }
}
