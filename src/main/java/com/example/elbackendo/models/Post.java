package com.example.elbackendo.models;

import javax.persistence.*;

@Table(name = "Post")
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private Long Id;

    @Column
    private String name;

    @Column
    private String postDescription;

    @Column
    private String postDate;

    public Post(String name, String postDescription, String postDate) {
        this.name = name;
        this.postDescription = postDescription;
        this.postDate = postDate;
    }

    public Post() {

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostDescription() {
        return postDescription;
    }

    public void setPostDescription(String postDescription) {
        this.postDescription = postDescription;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }
}


