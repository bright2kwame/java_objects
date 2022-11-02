package org.example;

public class TryConst {
    private String username;
    private String password;

    public void setUsername(String username) {
        if (username.trim().length() > 5){
            this.username = username;
        }
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return "**********";
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TryConst(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static void main(String[] args) {
        TryConst tryConst = new TryConst("bright", "12345");
        tryConst.setUsername("hell");
        System.out.println(tryConst.getUsername());
    }

}
