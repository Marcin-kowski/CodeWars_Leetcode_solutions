package org.example.solutions.MostFrequentlyUsedWords;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TopWords {

    public static List<String> top3(String s) {
        Map<String, Integer> stringCountMap = new HashMap<String, Integer>();

        Matcher matcher = Pattern.compile("'*[a-z][a-z']*").matcher(s.toLowerCase());
        while (matcher.find()) {
            String key = matcher.group(0);
            stringCountMap.put(key, stringCountMap.getOrDefault(key, 0) + 1);
        }

        return List.of(stringCountMap.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .limit(3)
                .map(Map.Entry::getKey)
                .toArray(String[]::new));
    }
}
