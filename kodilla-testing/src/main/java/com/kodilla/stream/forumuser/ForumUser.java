package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    public int userId;
    public String userName;
    public char sex;
    public LocalDate dateOfBirth;
    public int quantityPosts;

    public ForumUser(int userId, String userName, char sex, LocalDate dateOfBirth, int quantityPosts) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.quantityPosts = quantityPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getQuantityPosts() {
        return quantityPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", quantityPosts=" + quantityPosts +
                '}';
    }
}
