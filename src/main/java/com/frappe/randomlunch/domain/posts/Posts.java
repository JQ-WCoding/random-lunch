package com.frappe.randomlunch.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Entity
public class Posts {
    @Id

    @GeneratedValue ( strategy = GenerationType.IDENTITY )
    private Long id;

    @Column ( length = 500, nullable = false )
    private String title;

    @Column ( columnDefinition = "TEXT", nullable = false )
    private String content;

    private String author;

    private LocalDateTime createDate;
    private LocalDateTime modifiedDate;

    @Builder
    public Posts( Long id, String title, String content, String author, LocalDateTime createDate, LocalDateTime modifiedDate ) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.createDate = createDate;
        this.modifiedDate = modifiedDate;
    }

    public void update( String title, String content) {
        this.title = title;
        this.content = content;
    }
}
