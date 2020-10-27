package com.example.items;

public class Item {
    private String title;
    private String subtitle;
    private String description;

    public Item(String title, String subtitle, String description){
        this.title=title;
        this.subtitle=subtitle;
        this.description=description;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getdescription() {
        return description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public void setdescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Item{" +
                "title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
