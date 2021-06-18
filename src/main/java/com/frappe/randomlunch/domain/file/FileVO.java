package com.frappe.randomlunch.domain.file;

import com.frappe.randomlunch.domain.common.BaseTimeEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "tb_file")
public class FileVO extends BaseTimeEntity {
    @EmbeddedId
    private int fileKey;

    @Column(nullable = false, columnDefinition = "VARCHAR(200)")
    private String name;
}
