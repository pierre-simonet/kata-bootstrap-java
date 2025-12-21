package com.tdd.kata;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    void sampleJunitTest() {
        // Arrange

        // Act
        final int result = 1;

        // Assert
        assertEquals(1, result);
    }

    @ParameterizedTest
    @CsvSource({
            "1, 2, 3",
            "2, 3, 5",
            "10, 15, 25"
    })
    void sampleJunitParametrisedTest(final int a, final int b, final int expectedSum) {
        // Arrange

        // Act
        final int result = a + b;

        // Assert
        assertEquals(expectedSum, result);
    }

    @Test
    void sampleAssertJTest() {
        // Arrange

        // Act
        final String result = "hello";

        // Assert
        Assertions.assertThat(result)
                .isNotNull()
                .isEqualTo("hello");
    }

    @Test
    void sampleAssertJCollectionTest() {
        // Arrange

        // Act
        final List<Integer> result = List.of(1, 2, 3, 4, 5);

        // Assert
        Assertions.assertThat(result)
                .isNotNull()
                .hasSize(5)
                .containsExactly(1, 2, 3, 4, 5)
                .doesNotContain(6);
    }

    @ParameterizedTest
    @CsvSource({
            "1, 2, 3",
            "2, 3, 5",
            "10, 15, 25"
    })
    void sampleAssertJParametrisedTest(final int a, final int b, final int expectedSum) {
        // Arrange

        // Act
        final int result = a + b;

        // Assert
        Assertions.assertThat(result)
                .isEqualTo(expectedSum);
    }

}
