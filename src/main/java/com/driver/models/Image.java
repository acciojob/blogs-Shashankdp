package com.driver.models;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
@Table(name="images")
public class Image{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String description;
    private String dimensions;

    @ManyToOne
    @JoinColumn
    private Blog blog;


    public Image() {
    }

    public Image(String description, String dimensions, Blog blog) {
        this.description = description;
        this.dimensions = dimensions;
        this.blog = blog;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Image(int id, String description, String dimensions, Blog blog) {
        this.id = id;
        this.description = description;
        this.dimensions = dimensions;
        this.blog = blog;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }
}