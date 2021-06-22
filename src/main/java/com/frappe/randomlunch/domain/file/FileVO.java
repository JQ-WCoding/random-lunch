package com.frappe.randomlunch.domain.file;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * 파일 테이블
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Entity(name = "TB_FILE")
public class FileVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long key;
    @Column(nullable = false, columnDefinition = "VARCHAR(200)")
    private String name;
    private LocalDateTime regDatetime;
}
