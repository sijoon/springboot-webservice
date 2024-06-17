package com.lona.web.dto;

import com.lona.domain.post.Posts;
import lombok.Builder;
import lombok.Getter;

@Getter
public class PostsUpdateRequestDto {

    private final String title;
    private final String content;
    private final String author;

    @Builder
    public PostsUpdateRequestDto(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }


    public Posts toEntity() {
        return Posts.builder().title(title).content(content).author(author).build();
    }


}
