import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindMostFrequentVC {
    public static void main(String[] args) {
        String s="successes";
        Map<Character,Integer> map=s.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.toMap(c->c,c->1,Integer::sum)); 
        System.out.println(map);
        List<Character> vowels=Arrays.asList('a','e','i','o','u');
         int maxOfVowel=IntStream.range(0, s.length())
                .filter(i->vowels.contains(s.charAt(i)))
                .map(i->map.get(s.charAt(i)))
                .max()
                .orElse(0);
        int maxOfConsonant=IntStream.range(0, s.length())
                .filter(i->!vowels.contains(s.charAt(i)))
                .map(i->map.get(s.charAt(i)))
                .max()
                .orElse(0);
        System.out.println(maxOfVowel+maxOfConsonant);
    }
}
