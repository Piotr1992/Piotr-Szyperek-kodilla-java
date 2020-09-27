package com.kodilla.stream.forumuser;

import com.kodilla.stream.forumuser.ForumUser;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Forum {
    private final List<ForumUser> listUsersOfForum = new ArrayList<>();

    public Forum() {
        listUsersOfForum.add( new ForumUser(2, "JanKowalski1990", 'M', LocalDate.of(1990, 2, 13), 1) );
        listUsersOfForum.add( new ForumUser(5, "AlicjaNowak1987", 'K', LocalDate.of(1987, 3, 24), 9) );
        listUsersOfForum.add( new ForumUser(22, "AdamKowal2001", 'M', LocalDate.of(2001, 11, 11), 7) );
        listUsersOfForum.add( new ForumUser(531, "JanuszAndruch1982", 'M', LocalDate.of(1982, 6, 20), 0) );
        listUsersOfForum.add( new ForumUser(34, "EwaMalicka1999", 'K', LocalDate.of(1999, 12, 21), 0) );
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(listUsersOfForum);
    }

}
