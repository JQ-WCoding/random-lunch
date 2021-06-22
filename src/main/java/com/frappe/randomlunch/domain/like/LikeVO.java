package com.frappe.randomlunch.domain.like;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * 좋아요 이력 테이블
 */
@Data
@Entity( name = "tb_like_transaction" )
@EqualsAndHashCode( callSuper = false )
public class LikeVO {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private long key;

    @Column( nullable = false, columnDefinition = "VARCHAR(20)" )
    private String name;

    @Column( nullable = false, columnDefinition = "CHAR(1)" )
    private String likeYn;

    private LocalDateTime regDatetime;

    private long userKey;
}
