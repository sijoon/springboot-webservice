package com.lona.web.dto;

import com.lona.domain.post.Posts;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsUpdateRequestDto {

    private String title;
    private String content;
    private String author;


    public Posts toEntity() {
        return Posts.builder().title(title).content(content).author(author).build();
    }
}
