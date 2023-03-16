public class User {
    private  final String  login;
    private final String email;

    public User(String login, String email) {
        if (login == null || login.isEmpty() ) {
            throw new IllegalArgumentException("Поле логин пустое!");
        } else {
            this.login = login;
        }
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Поле email пустое!");
        } else {
            this.email = email;
        }
    }
    public String getLogin() {
        return login;
    }
    public String getEmail() {
        return email;
    }
}
