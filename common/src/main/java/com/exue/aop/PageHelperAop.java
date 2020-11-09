package com.exue.aop;

import com.github.pagehelper.PageHelper;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 实现分页
 * @author 86130
 */
@Aspect
@Component
public class PageHelperAop {
    private final String PAGE_NUM_NAME = "pageNum";
    private final String PAGE_SIZE_NAME = "pageSize";

    @Before("@annotation(com.exue.annotation.PageAnnotation)")
    public void page(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        String[] argNames = ((MethodSignature)joinPoint.getSignature()).getParameterNames();
        Integer pageNum = 1;
        Integer pageSize = 1;
        for (int i = 0; i < argNames.length; i++) {
            if (PAGE_NUM_NAME.equals(argNames[i])) {
                pageNum = Math.max(pageNum, Integer.parseInt(args[i].toString()));
            }

            if (PAGE_SIZE_NAME.equals(argNames[i])) {
                pageSize = Math.max(pageSize, Integer.parseInt(args[i].toString()));
            }
        }
    }
}
