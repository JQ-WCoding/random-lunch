package com.frappe.randomlunch.domain.like;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * 좋아요 이력 - 파일 매핑 테이블 복합키
 */
@Embeddable
public class LikeFileMappingPK implements Serializable {

    private static final long serialVersionUID = 2L;

    private long likeTransactionKey;
    private long fileKey;

}
