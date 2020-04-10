package ladder.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class GamersTest {
    @Test
    @DisplayName("두명 미만 에러")
    void expectExceptionTest() {
        String name = "unit0";
        assertThatThrownBy(() -> Gamers.of(Collections.singletonList(name)))
                .isInstanceOf(RuntimeException.class);
    }
}
