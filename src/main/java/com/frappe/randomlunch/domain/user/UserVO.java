package com.frappe.randomlunch.domain.user;

import com.frappe.randomlunch.domain.common.BaseTimeEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Table(name = "tb_user")
@Data
@EqualsAndHashCode( callSuper = false )
public class UserVO extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column( nullable = false, columnDefinition = "VARCHAR(20)" )
    private String id;

    @Column( nullable = false, columnDefinition = "VARCHAR(20)" )
    private String password;

    @Column( columnDefinition = "CHAR(11)" )
    private String cellPhone;

    @Column( columnDefinition = "VARCHAR(20)" )
    private String nickName;
}
