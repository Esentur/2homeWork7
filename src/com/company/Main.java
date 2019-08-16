package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, String[]> dictionary = new HashMap<>();

        dictionary.put("красный", new String[]{"лиловый", "бордовый", "красивый", "румяный", "срочный"});
        dictionary.put("большой", new String[]{"огромный", "громадный", "колоссальный", "великий"});
        dictionary.put("дом", new String[]{"жилище", "хата", "кров"});
        dictionary.put("человек", new String[]{"персона", "индивидуум", "лицо", "личность"});

        Map<String, String[]> dictionaryBig = new HashMap<>();

        Set<String> keys = dictionary.keySet();
        Iterator iter = keys.iterator();
        while (iter.hasNext()) {
            String key = iter.next().toString();
            String[] values = dictionary.get(key);
            dictionaryBig.put(key, values);

            for (int i = 0; i < values.length; i++) {
                String futureKey = values[i];

                ArrayList<String> newSynonyms = new ArrayList<>(values.length);
                newSynonyms.addAll(Arrays.asList(values));
                newSynonyms.remove(futureKey);
                newSynonyms.add(key);

                String[] newValues = new String[newSynonyms.size()];
                newValues = newSynonyms.toArray(newValues);

                System.out.println(futureKey + " - " + Arrays.toString(newValues));
                dictionaryBig.put(futureKey, newValues);
                //код Дмитрия Теплова
            }
        }
    }
}
