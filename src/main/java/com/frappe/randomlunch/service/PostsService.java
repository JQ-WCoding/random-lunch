package com.frappe.randomlunch.service;

import com.frappe.randomlunch.domain.posts.Posts;
import com.frappe.randomlunch.domain.posts.PostsRepository;
import com.frappe.randomlunch.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Posts save(PostsSaveRequestDto requestDto){
        return postsRepository.save( requestDto.toEntity());
    }
}
