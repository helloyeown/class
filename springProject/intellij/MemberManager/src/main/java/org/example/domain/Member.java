package org.example.domain;

import java.util.Date;

public class Member {

    private long id;
    private String email;
    private String password;
    private String name;
    private Date regDate;

    public Member() {
    }

    public Member(long id, String email, String password, String name, Date regDate) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.regDate = regDate;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", regDate=" + regDate +
                '}';
    }


    // 이전(현재) 비밀번호, 새로운 비밀번호 받아서 변경 처리
    public void changePassword(String oldPassword, String newPassword){

        // 현재 저장된 비밀번호와 전달받은 비밀번호 비교
        if(this.password.equals(oldPassword)){
            this.password = newPassword;
            System.out.println("변경되었습니다.");
        } else {
            System.out.println("현재 비밀번호와 입력하신 비밀번호가 일치하지 않습니다.");
        }

    }

}
