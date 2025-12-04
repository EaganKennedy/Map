import immutable.Map;

import java.util.ArrayList;

public class WordCount {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        String input = "The quick brown dog jumped over the lazy fox";
        java.util.Scanner scanner = new java.util.Scanner(input);

        ArrayList<String> words = new ArrayList<>();

        while (scanner.hasNext()){
            words.add(scanner.next());
        }

        Map m = Map.create();

        for (String word : words){
            Integer value = (Integer) m.getValue(word);
            if(value == null){
                m = m.setValue(word, 1);
            }
            else{
                m.setValue(word, ++value);
            }
        }
    }
}
