import java.util.HashMap;
import java.util.HashSet;

class CommonWord{

    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> bannedWords = new HashSet<>();
        for(String i: banned){
            bannedWords.add(i);
        }

        HashMap<String, Integer> counts = new HashMap<> ();
        //REGEX  a to z between, ^ = start 
        for (String word: paragraph.replaceAll("[^a-zA-Z]", " ").toLowerCase().split(" ")){ 
            if( !bannedWords.contains(word)){
                counts.put(word, counts.getOrDefault(word, 0) + 1);
            }
            

        }

        String result = "";
        for(String key: counts.keySet()){
            if (result.equals("") || counts.get(key) > counts.get(result)){
                result = key;
            }

        }
        return result;


    }
}