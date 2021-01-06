package ru.netology.domain;

public class LikesInfo {
    private int id;
    private int fromId;
    private int count;
    private boolean canLike;
    private boolean canUnLike;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean getCanUnlike() {
        return canUnLike;
    }

    public void setCanUnLike(boolean canUnLike) {
        this.canUnLike = canUnLike;
    }

    public boolean getCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

}
