

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserTest {
    private static final String LOGIN = "Alex";
    private static final String EMAIL = "alex@gmail.com";
    private static final String INCORRECT_EMAIL = "alex@mailru";
    private static final String MATCHER_MAIL = ("\\w+@\\w+\\.\\w+");

    @Test
    void shouldEqualsUser() {
        User user = new User(LOGIN, EMAIL);
        Assertions.assertEquals(LOGIN, user.getLogin());
        Assertions.assertEquals(EMAIL, user.getEmail());
    }

    @Test
    void shouldTrueUser() {
        User user = new User(LOGIN, EMAIL);
        Assertions.assertTrue(user.getEmail().matches(MATCHER_MAIL), EMAIL);
    }

    @Test
    void shouldIncorrectUser() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            User user = new User(LOGIN, INCORRECT_EMAIL);
        });
    }

    @Test
    void expectedIlLegalArgumentExceptionEmail() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            User incorrectUser = new User(MATCHER_MAIL, INCORRECT_EMAIL);
        });
    }

    @Test
    void shouldIncorrectUserNoParameters() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            User user = new User(null, null);
        });
    }
}