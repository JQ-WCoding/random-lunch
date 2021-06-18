package com.frappe.randomlunch.domain.like;

import com.frappe.randomlunch.domain.common.BaseTimeEntity;
import com.frappe.randomlunch.domain.common.Key;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Data
@Entity(name = "tb_like_transaction")
@EqualsAndHashCode(callSuper = false)
public class LikeVO extends BaseTimeEntity {

    @EmbeddedId
    private Key likeTransaction;

    @Column(nullable = false, columnDefinition = "VARCHAR(20)")
    private String name;

    @Column(nullable = false, columnDefinition = "CHAR(1)")
    private String likeYn;
}
