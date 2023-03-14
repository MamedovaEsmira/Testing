public class User {
    private String login;
    private String email;

    public User(String login, String email) {
        this.login = login;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        if (login == null || login.isEmpty()) {
            throw new IllegalArgumentException("Поле логин пустое!");
        } else {
            this.login = login;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (login == null || email.isEmpty()) {
            throw new IllegalArgumentException("Поле email пустое!");
        } else {
            this.email = email;
        }
    }
}

