public class User {
    private static final String MATCHER_MAIL = ("\\w+@\\w+\\.\\w+");
    private final String login;
    private final String email;


    public User(String login, String email) {
        if (login != null && !login.isEmpty()) {
            this.login = login;
        } else {
            throw new IllegalArgumentException("Поле login пустое!");
        }
        if (email != null && !email.isEmpty() && email.matches(MATCHER_MAIL)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Поле email пустое!");
        }
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }
}
