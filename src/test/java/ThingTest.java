import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ThingTest {

    @Test
    void it_should_not_fail() {
        assertThat(42).isEqualTo(42);
    }
}
