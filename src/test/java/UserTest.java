
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.regex.Pattern;

class UserTest {
    private final static String LOGIN = "Alex";
    private final static String EMAIL = "alex@gmail.com";
    private final static String INCORRECT_EMAIL = "alex@mailru";
    private final static String MATCHER_MAIL = ("\\w+@\\w+\\.\\w+");
    private static User userTest;

    @BeforeEach
    void createUser(){
        userTest = new User(LOGIN, EMAIL);
    }

    @Test
    void shouldCorrectSetLogin() {
        userTest.setLogin(LOGIN);
        Assertions.assertEquals(LOGIN, userTest.getLogin());
    }

    @Test
    void shouldCorrectSetEmail() {
        userTest.setEmail(EMAIL);
        Assertions.assertEquals(EMAIL, userTest.getEmail());
    }

    @Test
    void shouldNotVerifyIncorrectEmail(){
        userTest.setEmail(INCORRECT_EMAIL);
        Assertions.assertFalse(Pattern.matches(MATCHER_MAIL, userTest.getEmail()));
    }
}