package com.lona.web;

import com.lona.service.PostsService;
import com.lona.web.dto.PostsSaveRequestDto;
import com.lona.web.dto.PostsUpdateRequestDto;
import lombok.Builder;
import org.springframework.web.bind.annotation.*;

@RestController
@Builder
public class PostsApiController {
    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

}
