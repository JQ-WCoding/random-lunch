package com.frappe.randomlunch.domain.like;

import com.frappe.randomlunch.domain.common.BaseTimeEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Table;

@Data
@Table(name = "tb_like_transaction")
@EqualsAndHashCode(callSuper = false)
public class LikeVO extends BaseTimeEntity {

    @EmbeddedId
    private int likeTransaction;

    @Column(nullable = false, columnDefinition = "VARCHAR(20)")
    private String name;

    @Column(nullable = false, columnDefinition = "CHAR(1)")
    private String likeYn;
}
