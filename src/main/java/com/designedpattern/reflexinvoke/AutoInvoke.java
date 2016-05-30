package com.designedpattern.reflexinvoke;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by xiwen.yxw on 2016/5/27.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoInvoke {
    public int id();
    public String style() default "NOCALL";
}
