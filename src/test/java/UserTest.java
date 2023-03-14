
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserTest {
    private final static String LOGIN = "Alex";
    private final static String EMAIL = "alex@gmail.com";
    private final static String INCORRECT_EMAIL = "alex@mailru";
    private final static String MATCHER_MAIL = ("\\w+@\\w+\\.\\w+");

    @Test
    void shouldCorrectUser() {
        User user= new User(LOGIN, EMAIL);
        Assertions.assertFalse(user.getLogin().isEmpty());
    }

    @Test
    void shouldIncorrectUser() {
        User user= new User("","");
        Assertions.assertTrue(user.getLogin().isEmpty());
    }

    @Test
    void checkingUserEmail(){
        User user= new User(LOGIN, EMAIL);
        User incorrectUser= new User(LOGIN,INCORRECT_EMAIL);

        Assertions.assertTrue(user.getEmail().matches(MATCHER_MAIL));
        Assertions.assertFalse(incorrectUser.getEmail().matches(MATCHER_MAIL));
    }
}