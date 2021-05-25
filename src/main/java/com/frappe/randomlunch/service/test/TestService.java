package com.frappe.randomlunch.service.test;

import com.frappe.randomlunch.domain.common.CustomSpecifications;
import com.frappe.randomlunch.domain.common.SearchCriteria;
import com.frappe.randomlunch.domain.test.TestRepository;
import com.frappe.randomlunch.domain.test.TestVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
     *
     * @return tb_test 해당되는 리스트
     */
    public List<TestVO> selectTestList() {
        CustomSpecifications<TestVO> specifications = new CustomSpecifications<>();
        specifications.add(
                SearchCriteria.builder().key( "title" ).value( "test1" ).operation( SearchCriteria.SearchOperation.MATCH ).build(),
                SearchCriteria.builder().key( "title" ).value( "test2" ).operation( SearchCriteria.SearchOperation.MATCH ).build()
        );
        specifications.add(
                SearchCriteria.builder().key( "idx" ).value( 1 ).operation( SearchCriteria.SearchOperation.EQUAL ).build()
        );

        return testRepository.findAll( specifications );
    }
}
