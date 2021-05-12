package com.frappe.randomlunch.web.posts;

import com.frappe.randomlunch.domain.posts.Posts;
import com.frappe.randomlunch.service.posts.PostsService;
import com.frappe.randomlunch.domain.posts.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Slf4j
@Controller
@RequiredArgsConstructor
public class PostsController {
    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Posts save(@RequestBody PostsSaveRequestDto requestDto){
        return postsService.save( requestDto );
    }
}