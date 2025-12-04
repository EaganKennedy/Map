import immutable.Map;

import java.util.ArrayList;

public class WordCount {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        ArrayList<String> words = new ArrayList<>();

        while (scanner.hasNext()){
            String word = scanner.next();
            if(word.equals("quit")){
                break;
            }
            words.add(word);
        }

        Map m = Map.create();

        for (String word : words){
            Integer value = (Integer) m.getValue(word);
            if(value == null){
                m = m.setValue(word, 1);
            }
            else{
                m = m.setValue(word, ++value);
            }
        }

        System.out.println("Map has size " + m.size() + " with depth " + m.depth());

        ArrayList<Map.Entry> entries = new ArrayList<>();
        m.addEntries(entries);

        for (Map.Entry e : entries){
            String message = e.getKey() + ":" + e.getValue();
            System.out.println(message);
        }
    }
}
