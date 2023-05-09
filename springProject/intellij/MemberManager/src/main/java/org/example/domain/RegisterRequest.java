package org.example.domain;

public class RegisterRequest {

    // email, password, confirmPassword, name
    private String email;
    private String password;
    private String confirmPassword;
    private String name;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // 비밀번호=확인비밀번호 일치 여부 확인
    public boolean isConfirmPassword(){
        return this.password.equals(this.confirmPassword);
    }

}
