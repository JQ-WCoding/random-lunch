package com.frappe.randomlunch.service.posts;

import com.frappe.randomlunch.domain.posts.Posts;
import com.frappe.randomlunch.domain.posts.PostsRepository;
import com.frappe.randomlunch.domain.posts.PostsSaveRequestDto;
import com.frappe.randomlunch.domain.posts.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Posts save(PostsSaveRequestDto requestDto) {
        return postsRepository.save( requestDto.toEntity() );
    }

    @Transactional
    public Long update(Long id, PostsUpdateRequestDto requestDto) {
        Posts posts = postsRepository.findById( id ).orElseThrow( () -> new IllegalArgumentException( "해당 게시글이 없습니다. Id = " + id ) );

        posts.update( requestDto.getTitle(), requestDto.getContent() );

        return id;
    }
}
