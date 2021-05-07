package com.frappe.randomlunch.service.test;

import com.frappe.randomlunch.domain.common.CustomSpecifications;
import com.frappe.randomlunch.domain.common.SearchCriteria;
import com.frappe.randomlunch.domain.test.TestRepository;
import com.frappe.randomlunch.domain.test.TestVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * test service
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class TestService {

    private final TestRepository testRepository;

    /**
     * JPA 검색 조회 샘플
     * @return tb_test 전체 리스트
     */
    public List<TestVO> selectTestList() {
        CustomSpecifications<TestVO> specifications = new CustomSpecifications<>();
        List<SearchCriteria<?>> list = new ArrayList<>();
        list.add( new SearchCriteria<>( "title", "test", SearchCriteria.SearchOperation.MATCH ) );
        specifications.add( list );

        return testRepository.findAll( specifications );
    }
}
