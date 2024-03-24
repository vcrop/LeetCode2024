package ru.vcrop;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Find_the_Duplicate_Number_287Test {

    public static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 4, 2, 2}, 2),
                Arguments.of(new int[]{3, 1, 3, 4, 2}, 3),
                Arguments.of(new int[]{3, 3, 3, 3, 3}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("source")
    void findDuplicate(int[] nums, int expected) {
        var findTheDuplicateNumber287 = new Find_the_Duplicate_Number_287();
        assertEquals(expected, findTheDuplicateNumber287.findDuplicate(nums));
    }

}