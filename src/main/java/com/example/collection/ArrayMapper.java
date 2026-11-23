package com.example.collection;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.UnaryOperator;

public final class ArrayMapper {

    private ArrayMapper() {}

    public static <T> T[] arrayMapping(T[] array, UnaryOperator<T> function) {
        Objects.requireNonNull(array, "array must not be null");
        Objects.requireNonNull(function, "function must not be null");

        T[] result = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            result[i] = function.apply(array[i]);
        }
        return result;
    }
}