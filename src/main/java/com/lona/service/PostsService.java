package com.lona.service;

import com.lona.domain.post.Posts;
import com.lona.domain.post.PostsRepository;
import com.lona.web.dto.PostsListResponseDto;
import com.lona.web.dto.PostsResponseDto;
import com.lona.web.dto.PostsSaveRequestDto;
import com.lona.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;


@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    public Long save(PostsSaveRequestDto postsSaveRequestDto) {
        return postsRepository.save(postsSaveRequestDto.toEntity()).getId();
    }

    @Transactional(readOnly = true)
    public List<PostsListResponseDto> findAllDesc() {
        return postsRepository.findAllDesc().stream().map(PostsListResponseDto::new).collect(Collectors.toList());
    }


    public Long update(Long id, PostsUpdateRequestDto requestDto) {
        Posts posts = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당사용자가 없습니다. id=" + id));
        posts.update(requestDto.getTitle(), requestDto.getContent());
        postsRepository.save(posts);
        return id;
    }

    public PostsResponseDto findById(Long id) {
        Posts entity = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당사용자가 없습니다. id=" + id));
        return new PostsResponseDto(entity);
    }

    @Transactional
    public void delete(Long id) {
        Posts posts = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));
        postsRepository.delete(posts);
    }


}
