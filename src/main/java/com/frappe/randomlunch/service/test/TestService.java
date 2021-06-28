package com.frappe.randomlunch.service.test;

import com.frappe.randomlunch.domain.common.CustomSpecifications;
import com.frappe.randomlunch.domain.common.SearchCriteria;
import com.frappe.randomlunch.domain.test.TestRepository;
import com.frappe.randomlunch.domain.test.TestVO;
import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.handler.timeout.WriteTimeoutHandler;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import reactor.netty.http.client.HttpClient;

import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

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

    public String testWebClient() {
        HttpClient httpClient = HttpClient.create()
                .option( ChannelOption.CONNECT_TIMEOUT_MILLIS, 5000 )
                .responseTimeout( Duration.ofMillis( 5000 ) )
                .doOnConnected( connection ->
                        connection.addHandlerLast( new ReadTimeoutHandler( 5000, TimeUnit.MILLISECONDS ) )
                                .addHandlerLast( new WriteTimeoutHandler( 5000, TimeUnit.MILLISECONDS ) )
                );

        WebClient client = WebClient.builder()
                .clientConnector( new ReactorClientHttpConnector( httpClient ) )
                .defaultHeader( HttpHeaders.CONTENT_TYPE, MediaType.TEXT_HTML_VALUE )
                .build();

        WebClient.ResponseSpec responseSpec = client.get()
                .uri( "https://www.siksinhot.com/search?keywords=강남역" )
                .retrieve();

        ResponseEntity<String> response = responseSpec.toEntity( String.class ).block();

        assert response != null;
        log.debug( "response code -> {}, header -> {}, body -> {}", response.getStatusCode(), response.getHeaders(), response.getBody() );
        log.debug( "response auth -> {}", response.getHeaders().get( "siksinoauth" ) );
        return response.getBody();
    }
}
