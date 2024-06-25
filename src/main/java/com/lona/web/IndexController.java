package com.lona.web;

import com.lona.config.auth.LoginUser;
import com.lona.config.auth.SessionUser;
import com.lona.service.PostsService;
import com.lona.web.dto.PostsResponseDto;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequiredArgsConstructor
@Controller
public class IndexController {
    private final PostsService postsService;
    private final HttpSession httpSession;

//    @GetMapping("/")
//    public String index() {
//        return "index";
//    }

    //    @GetMapping("/")
//    public String index(Model model) {
//        model.addAttribute("posts", postsService.findAllDesc());
//        return "index";
//    }
    @GetMapping("/")
    public String index(Model model, @LoginUser SessionUser sessionUser) {
        model.addAttribute("posts", postsService.findAllDesc());
        if (sessionUser != null) {
            model.addAttribute("userName", sessionUser.getName());
        }

        return "index";
    }


    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }

    @GetMapping("/posts/update/{id}")
    public String postUpdate(@PathVariable Long id, Model model) {
        PostsResponseDto dto = postsService.findById(id);
        model.addAttribute("post", dto);
        return "posts-update";
    }
}
