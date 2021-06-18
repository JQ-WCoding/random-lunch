package com.frappe.randomlunch.domain.file;

import com.frappe.randomlunch.domain.common.BaseTimeEntity;
import com.frappe.randomlunch.domain.common.Key;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity(name = "TB_FILE")
public class FileVO extends BaseTimeEntity {
    @EmbeddedId
    private Key fileKey;

    @Column(nullable = false, columnDefinition = "VARCHAR(200)")
    private String name;
}
