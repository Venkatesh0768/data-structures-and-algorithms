package org.venky.hashmap;

import java.util.*;

public class HashMapPractice {

    static void frequencyCount(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int ele : arr) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }

    //find the element with the max freq
    static void maxFrequencyCount(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();


        for (int ele : arr) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        int maxFreq = 0;
        int maxFreqKey = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (maxFreq < entry.getValue()) {
                maxFreq = entry.getValue();
                maxFreqKey = entry.getKey();
            }
        }
        System.out.println("Max Freq Key -> " + maxFreqKey);
        System.out.println("Max Key Freq Value -> " + maxFreq);
    }


    //Iteration Of map way
    static void usingKeySet(HashMap<Integer, Integer> map) {
        for (int key : map.keySet()) {
            System.out.println(key);
        }
    }

    static void usingKeyValue(HashMap<Integer, Integer> map) {
        for (int values : map.values()) {
            System.out.println("map values -> " + values);
        }
    }

    //No Repeating Characters
    static boolean repatingCharacters(String s){
        int n = s.length();

        HashMap<Character , Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()){
            map.put(ch , map.getOrDefault(ch , 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if (entry.getValue() > 1) return  false;
        }

        return true;
    }

    //Grouping
    static void groupingAnagram(String[] strs){
        HashMap<String , List<String>> map = new HashMap<>();

        for (String str : strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key  = new String(arr);

            map.computeIfAbsent(key  , k -> new ArrayList<>()).add(str);
        }

        for (List<String> group : map.values()){
            System.out.println(group);
        }
     }


     static void frequencySort(HashMap<Integer , Integer> map){
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a , b) -> map.get(b) - map.get(a));

         System.out.println(list);
     }


    /**
     * Demonstrates frequency counting using different methods
     */
    static void main() {
        int[] arr = {1, 1, 1, 2, 4, 5, 7, 33, 3, 3,};

        String s = "rtyurtyrty";
        String c ="qwertyuio";
        System.out.println(repatingCharacters(s));
        System.out.println(repatingCharacters(c));

        HashMap<Integer, Integer> map = new HashMap<>();


        for (int ele : arr) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        frequencySort(map);

        usingKeyValue(map);
        frequencyCount(arr);
        maxFrequencyCount(arr);
    }
}
