package lotto;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InputValidatorTest {

    @Test
    void 입력이_숫자면_아무일_없음() {
        String input = "10000";

        assertThatCode(() -> InputValidator.validateIsNumeric(input)).doesNotThrowAnyException();
    }

    @Test
    void 입력이_숫자가_아니면_예외() {
        String input = "ads";

        assertThatThrownBy(() -> InputValidator.validateIsNumeric(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR] 숫자를 입력해야 합니다.");
    }

    @Test
    void 금액_천원_단위면_아무일_없음() {
        int number = 100000;

        assertThatCode(() -> InputValidator.validateDivision1000(number)).doesNotThrowAnyException();
    }

    @Test
    void 구매_금액_천원_단위_아니면_예외() {
        int number = 8400;
        assertThatThrownBy(() -> InputValidator.validateDivision1000(number))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR] 구입 금액은 1000으로 나누어 떨어져야 합니다.");
    }
}