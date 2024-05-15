package TryCatch;

public class User {
    private String user;
    private Integer id;

    public User(UserGitHubAPI myUserGit){
        this.user= myUserGit.login();
        this.id = myUserGit.id();

    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
