package com.thealienmann;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {
    @Test
    void test_whenInputIsEmpty_shouldReturnAnEmptyString() {
        String input = "";
        assertEquals(input, RemoveDuplicates.removeDupl(""));
    }

    @Test
    void test_whenLengthIsLessThanTwo_shouldReturnInput() {
        String input = "s";
        assertEquals(input, RemoveDuplicates.removeDupl("s"));
    }

    @Test
    void test_whenHasSpace_shouldRemoveSpaces() {
        assertEquals("str", RemoveDuplicates.removeDupl("s                sstr"));
    }

    @Test
    void test_whenContainsNumber_shouldRemoveNumbers() {
        assertEquals("str", RemoveDuplicates.removeDupl("s123   sstr"));
    }
}