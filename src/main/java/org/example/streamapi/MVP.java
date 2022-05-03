package org.example.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toList;

public class MVP {

    /*
        Convert a List<String> to an object stream and for each element -> System,out.println.
     */

    public void printNames(List<String> names) {
        // Implement me :)
        names.stream()
                .forEach(
                (i) -> {
                    System.out.println(i);
                }
        );
    }

    /*
        Given a List<Integers>, return a List<Integer> with event numbers.
     */
    public List<Integer> returnEvenNumbers(List<Integer> numbers) {
        // Implement me :)
        List<Integer> evens = numbers
                .stream()
                .filter(i -> i % 2 == 0)
                .toList();
        return evens;
    }

    /*
        Given an int [], double the value of each int and return an int [].
    */
    public int[] doubleInts(int[] numbers) {
        // Implement me :)
        /*Can't do .forEach()/map() then .toArray() because those methods can only do one thing to each i, so must first
        convert numbers to an IntStream then use map to double each element in the stream. Then set that to a new stream
        then convert that new stream into an array of ints.
         */
        IntStream doubles = Arrays.stream(numbers);
        IntStream newStream = doubles.map(
                (i) -> {
                   return i *= 2;
                }
        );
        int [] endList = newStream.toArray();
       return endList;
    }

    /*
        Given a String, return a List<String>, all caps.
     */
    public List<String> splitToAllCapsList(String input) {
        // Implement me :)
        char [] letters = input.toCharArray();

        return null;
    }

    /*
    Given a list of animals:
     - filter the ones that start with a given letter
     - return sorted List<String>, all caps.
    */
    public List<String> filterByFirstLetterAndOrder(List<String> list, String letter) {
        // Implement me :)
        List<String> filtered = list
                .stream()
                .filter(i-> i.startsWith(letter))
                .map(
                        (i) -> {
                            return i.toUpperCase();
                        }
                ).sorted()
                .toList();
        return filtered;
    }

    /*
        Given a list of words, return elements that:
         - are shorter than the given number and
         - start with a given letter.
    */
    public List<String> filterWords(List<String> words, int maxLength, String firstLetter) {
        // Implement me :)
        List<String> wanted = words
                .stream()
                .filter(i -> i.length() < maxLength)
                .filter(i -> i.startsWith(firstLetter))
                .toList();
        return wanted;
    }
}