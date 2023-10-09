import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ThingTest {

    private final static Stream<Arguments> dummyEquality() {
        return Stream.of(
                Arguments.of(1, "1"),
                Arguments.of(2, "2")
        );
    }

    @ParameterizedTest
    @MethodSource("dummyEquality")
    void should_not_failed_using_parameters(int a, int b) {
        assertEquals(a, b);
    }

    @Test
    void should_not_fail() {
        assertThat(42).isEqualTo(42);
    }

    
}
