package com.example.QLTV.Model;

import jakarta.persistence.*;

@Entity
@Table(name="BOOK")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "AUTHOR")
    private String author;

    @Column(name = "COST")
    private int cost;

    @Column(name = "STATUS")
    private String status;

    public Book(){

    }

    public Book(String name, String author, int cost, String status){
        this.name = name;
        this.author = author;
        this.cost = cost;
        this.status = status;
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public Integer getCost(){
        return cost;
    }
    public void setCost(int cost){
        this.cost = cost;
    }

    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }

    @Override
    public String toString(){
        return "Book [id=" + id + ", name=" + name +", author=" + author + ", cost=" + cost +", status"+status+ "]";
    }
}
