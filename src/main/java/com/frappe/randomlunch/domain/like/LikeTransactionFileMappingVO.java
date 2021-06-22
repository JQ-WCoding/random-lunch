package com.frappe.randomlunch.domain.like;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * 좋아요 이력 - 파일 매핑 테이블
 */
@Entity( name = "tb_like_transaction_file_mapping" )
@Data
@JsonInclude( JsonInclude.Include.NON_NULL )
public class LikeTransactionFileMappingVO {
    @EmbeddedId
    private LikeFileMappingPK key;
}
