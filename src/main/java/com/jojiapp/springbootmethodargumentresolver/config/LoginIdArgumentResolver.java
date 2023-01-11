package com.jojiapp.springbootmethodargumentresolver.config;

import org.springframework.core.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.support.*;
import org.springframework.web.context.request.*;
import org.springframework.web.method.support.*;

@Component
public class LoginIdArgumentResolver implements HandlerMethodArgumentResolver {
    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.getParameterAnnotation(LoginId.class) != null &&
                parameter.getParameterType().equals(Long.class);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {

        return 1L;
    }
}
