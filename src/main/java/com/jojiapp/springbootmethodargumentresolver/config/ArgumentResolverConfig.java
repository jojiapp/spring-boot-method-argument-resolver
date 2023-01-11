package com.jojiapp.springbootmethodargumentresolver.config;

import lombok.*;
import org.springframework.stereotype.*;
import org.springframework.web.method.support.*;
import org.springframework.web.servlet.config.annotation.*;

import java.util.*;

@Component
@RequiredArgsConstructor
public class ArgumentResolverConfig extends WebMvcConfigurationSupport {

    private final LoginIdArgumentResolver loginIdArgumentResolver;

    @Override
    protected void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        super.addArgumentResolvers(argumentResolvers);
        argumentResolvers.add(loginIdArgumentResolver);
    }
}
