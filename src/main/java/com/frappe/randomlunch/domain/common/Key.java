package com.frappe.randomlunch.domain.common;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
public class Key implements Serializable {

    @Column(name = "LIKE_TRANSACTION")
    private int likeTransaction;

    @Column(name = "FILE_KEY")
    private int fileKey;
}
