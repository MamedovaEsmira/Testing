
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserTest {
    private  static final String LOGIN = "Alex";
    private  static final String EMAIL = "alex@gmail.com";
    private  static final String INCORRECT_EMAIL = "alex@mailru";
    private  static final String MATCHER_MAIL = ("\\w+@\\w+\\.\\w+");

    @Test
    void shouldEqualsUser() {
        User user= new User(LOGIN, EMAIL);
        Assertions.assertEquals(LOGIN,user.getLogin());
        Assertions.assertEquals(EMAIL,user.getEmail());
    }
    @Test
    void shouldIncorrectUser() {
        User user= new User(" "," ");
        Assertions.assertFalse(user.getLogin().isEmpty());
        Assertions.assertFalse(user.getEmail().isEmpty());
    }

    @Test
    void checkingUserEmail(){
        User user= new User(LOGIN, EMAIL);
        User incorrectUser= new User(LOGIN,INCORRECT_EMAIL);

        Assertions.assertTrue(user.getEmail().matches(MATCHER_MAIL));
        Assertions.assertFalse(incorrectUser.getEmail().matches(MATCHER_MAIL));
    }
}