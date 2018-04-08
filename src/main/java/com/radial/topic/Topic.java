package com.radial.topic;

public class Topic {
    private String name;
    private String description;
    public Topic(String name,String description,String id) {
        this.description=description;
        this.name=name;
        this.id=id;
    }
    public Topic(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;
}
