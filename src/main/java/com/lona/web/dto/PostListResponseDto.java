package com.lona.web.dto;

import com.lona.domain.post.Posts;
import lombok.Getter;

@Getter
public class PostListResponseDto {

    private final Long id;
    private final String title;
    private final String author;

    public PostListResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
    }
}
