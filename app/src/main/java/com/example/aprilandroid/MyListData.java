package com.example.aprilandroid;

public class MyListData {
    private String name;
    private String desc;
    private int imageId;

    public MyListData(String name, String desc, int imageId) {
        this.name = name;
        this.desc = desc;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
