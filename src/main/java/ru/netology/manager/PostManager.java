package ru.netology.manager;
import ru.netology.domain.CommentsInfo;
import ru.netology.domain.Post;

public class PostManager {
    private Post[] post;

    public Post[] search (int ownerId, String domain, String query, boolean owners_only, int count, int offset) {
        return search(1, "domain", "query", true, 1, 0);
    }

    public void delete(int ownerId, int postId) { }
}

