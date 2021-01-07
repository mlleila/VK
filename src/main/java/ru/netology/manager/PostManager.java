package ru.netology.manager;
import ru.netology.domain.CommentsInfo;
import ru.netology.domain.Post;

public class PostManager {
    private int ownerId;
    private String domain;
    private String query;
    private boolean owners_only;
    private int count;
    private int offset;
    private Post[] post;

    public Post[] search (int ownerId) {
        return search(ownerId);
    }

    public Post[] delete(Post[] post) {
        return null;
    }
}

