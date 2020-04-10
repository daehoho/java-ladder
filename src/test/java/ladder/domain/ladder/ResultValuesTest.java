package ladder.domain.ladder;

import ladder.domain.ResultValues;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ResultValuesTest {
    @Test
    @DisplayName("결과 만들기")
    void constructorTest() {
        assertThat(ResultValues.of(Arrays.asList("꽝","5000","꽝","3000")).getResults())
                .containsAnyOf("3000")
                .hasSize(4);
    }

    @Test
    @DisplayName("2개 미만 예외처리")
    void expectExceptionTest() {
        assertThatThrownBy(() -> ResultValues.of(Collections.singletonList("꽝")))
                .isInstanceOf(RuntimeException.class);
    }

}
