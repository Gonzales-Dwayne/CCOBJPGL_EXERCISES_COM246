public class User {
    private String username;
    private String password;

    User(String uname, String pword) {
        this.username = uname;
        this.password = pword;
    }

    public String getUsername() {
        return this.username;
    }

}
