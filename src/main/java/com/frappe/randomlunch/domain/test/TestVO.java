package com.frappe.randomlunch.domain.test;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * test table vo
 */
@Entity( name = "test" )
@Data
@JsonInclude( JsonInclude.Include.NON_NULL )
public class TestVO {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private long idx;

    @Column( nullable = false, columnDefinition = "VARCHAR(20)" )
    private String title;

    @Column( columnDefinition = "VARCHAR(50)" )
    private String content;

}
