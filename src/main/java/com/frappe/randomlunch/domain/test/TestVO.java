package com.frappe.randomlunch.domain.test;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.frappe.randomlunch.domain.common.BaseTimeEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * test table vo
 */
@Entity( name = "test" )
@Data
@EqualsAndHashCode( callSuper = true )
@JsonInclude( JsonInclude.Include.NON_NULL )
public class TestVO extends BaseTimeEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private long idx;
    @Column( nullable = false, columnDefinition = "VARCHAR(20)" )
    private String title;
    @Column( columnDefinition = "VARCHAR(50)" )
    private String content;

}
