package com.lona.web.dto;

import com.lona.domain.post.Posts;
import lombok.Builder;

public class PostsResponseDto {

    private final Long id;
    private final String title;
    private final String content;
    private final String author;

    @Builder
    public PostsResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();

    }
}
