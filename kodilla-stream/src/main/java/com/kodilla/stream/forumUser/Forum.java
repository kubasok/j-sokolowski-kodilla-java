package com.kodilla.stream.forumUser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum{

    public static List<ForumUser> getUserList() {
        final List<ForumUser> forumUserList = new ArrayList<>();
        forumUserList.add(new ForumUser(1,"anton",'M',LocalDate.of (1961,5,17),12));
        forumUserList.add(new ForumUser(2,"kalax",'F',LocalDate.of (1992,5,12),1));
        forumUserList.add(new ForumUser(3,"Chan",'M',LocalDate.of (2001,1,8),0));
        forumUserList.add(new ForumUser(4,"Gandalf",'F',LocalDate.of (1989,3,21),123));
        forumUserList.add(new ForumUser(5,"aragon",'M',LocalDate.of (1971,12,15),9));
        forumUserList.add(new ForumUser(6,"hhhjal",'F',LocalDate.of (1912,5,23),0));
        forumUserList.add(new ForumUser(7,"Charon",'M',LocalDate.of (1991,1,1),0));
        forumUserList.add(new ForumUser(8,"Hades",'F',LocalDate.of (1999,11,11),192));
        forumUserList.add(new ForumUser(9,"desan",'M',LocalDate.of (1978,5,18),1));
        forumUserList.add(new ForumUser(10,"komar",'f',LocalDate.of (1981,6,13),13));
        return new ArrayList<ForumUser>(forumUserList);
    }
}
