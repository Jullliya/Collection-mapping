package com.example;

import com.example.collection.ArrayMapper;

import java.util.Arrays;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

        String[] words = {"apple", "banana", "cherry"};
        String[] upper = ArrayMapper.arrayMapping(words, String::toUpperCase);
        System.out.println(Arrays.toString(upper));
        System.out.println(words[0]);

        Integer[] nums = {1, 2, 3, 4};
        Integer[] squares = ArrayMapper.arrayMapping(nums, x -> x * x);
        System.out.println(Arrays.toString(squares));

        record Point(int x, int y) {}
        Point[] points = { new Point(1, 2), new Point(3, 4) };
        Point[] shifted = ArrayMapper.arrayMapping(points, p -> new Point(p.x() + 10, p.y()));
        System.out.println(Arrays.toString(shifted));

        System.out.println(Arrays.toString(ArrayMapper.arrayMapping(new String[0], String::trim)));

        String[] copy = ArrayMapper.arrayMapping(words, UnaryOperator.identity());
        System.out.println(words == copy);
    }
}
