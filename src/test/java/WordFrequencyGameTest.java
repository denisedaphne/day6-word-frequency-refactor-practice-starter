import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;

public class WordFrequencyGameTest {

    @Test
    public void should_get_the_1_when_input_the() {
        //Given
        String word = "the";
        String result = "the 1";
        validate_Input_words_process_to_expected_word(word, result);
    }

    @Test
    public void should_process_two_words() {
        //Given
        String input = "the is";
        String result = "the 1\nis 1";
        validate_Input_words_process_to_expected_word(input, result);
    }

    @Test
    public void should_process_two_words_with_special_spaces() {
        //Given
        String input = "the      is";
        String result = "the 1\nis 1";
        validate_Input_words_process_to_expected_word(input, result);
    }

    @Test
    public void should_process_two_words_with_special_enter() {
        //Given
        String input = "the   \n   is";
        String result = "the 1\nis 1";
        validate_Input_words_process_to_expected_word(input, result);
    }

    @Test
    public void should_process_two_same_words_with_sorted() {
        //Given
        String input = "the the is";
        String result = "the 2\nis 1";
        validate_Input_words_process_to_expected_word(input, result);
    }

    @Test
    public void should_process_sorted_with_count_descending() {
        //Given
        String input = "the is is";
        String result = "is 2\nthe 1";
        validate_Input_words_process_to_expected_word(input, result);
    }

    private void validate_Input_words_process_to_expected_word(String input, String actualResult) {
        WordFrequencyGame wordFrequencyGame = new WordFrequencyGame();
        //When
        String expectedResult = wordFrequencyGame.getResult(input);
        //Then
        assertThat(expectedResult).isEqualTo(actualResult);
    }
}
