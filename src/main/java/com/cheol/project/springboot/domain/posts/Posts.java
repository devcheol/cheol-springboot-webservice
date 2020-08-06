package com.cheol.project.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Posts extends BaseTimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    private String email;

    @Builder
    public Posts(String title, String content, String author, String email){
        this.title = title;
        this.content = content;
        this.author = author;
        this.email = email;
    }

    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }
}






