package com.jojiapp.springbootmethodargumentresolver.member;

import com.jojiapp.springbootmethodargumentresolver.config.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/argument-resolver")
public class ArgumentResolverController {

    @GetMapping
    public Long getId(
            @LoginId final Long id
    ) {

        return id;
    }

}
