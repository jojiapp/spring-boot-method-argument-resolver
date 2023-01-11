package com.jojiapp.springbootmethodargumentresolver.config;

import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginId {
}
