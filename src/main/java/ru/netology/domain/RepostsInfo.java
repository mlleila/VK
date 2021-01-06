package ru.netology.domain;

public class RepostsInfo {
    private int id;
    private int fromId;
    private int count;
    private boolean canRepost;
    private boolean canUnRepost;

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

    public boolean getCanUnRepost() {
        return canUnRepost;
    }

    public void setCanUnRepost(boolean canUnRepost) {
        this.canUnRepost = canUnRepost;
    }

    public boolean getCanRepost() {
        return canRepost;
    }

    public void setCanRepost(boolean canRepost) {
        this.canRepost = canRepost;
    }

}
