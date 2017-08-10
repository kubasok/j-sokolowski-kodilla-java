package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {
    int userCount = 0;
    double postsPerUser = 0;
    double commentsPerUser = 0;
    double commentsPerPost = 0;
    int postsNumber = 0;
    int commentsNumber = 0;

    public void calculateAdvStatistics(Statistics statistics){
        userCount = statistics.usersNames().size();
        postsNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();
        if(userCount==0) {
            postsPerUser = 0;
            commentsPerUser = 0;
        }else{
            postsPerUser = (double)postsNumber / userCount;
            commentsPerUser = (double)commentsNumber / userCount;
        }
        if(postsNumber==0) {
            commentsPerPost = 0;
        }else{
            commentsPerPost = (double)commentsNumber / postsNumber;
        }
    }
    public void showStatistics(){
        System.out.println("Number of users: " + userCount);
        System.out.println("Number of posts: " + postsNumber);
        System.out.println("Number of comments: " + commentsNumber);
        System.out.println("Average number of posts per user: " + postsPerUser);
        System.out.println("Average number of comments per user: " + commentsPerUser);
        System.out.println("Average number of comments per post: " + commentsPerPost);
    }

    public int getUserCount() {
        return userCount;
    }

    public double getPostsPerUser() {
        return postsPerUser;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommentsPerPost() {
        return commentsPerPost;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public int getCommentsNumber() {
        return commentsNumber;
    }
}
