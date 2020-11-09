package com.exue.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

/**
 * 添加创建时间
 * @author 86130
 */
@Aspect
@Component
public class UpdateAndAddToTimeAdvice {


    @Before("execution(public * *..*ServiceImpl.add*(*,..))")
    public void updateAndAdd(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        if (Objects.nonNull(args[0])) {
            Class<?> clazz = args[0].getClass();
            try {
                Field creationTime = clazz.getDeclaredField("creationTime");
                Field updateTime = clazz.getDeclaredField("updateTime");
                if (Objects.nonNull(creationTime)) {
                    creationTime.setAccessible(true);
                    updateTime.setAccessible(true);
                    creationTime.set(args[0], new Date());
                    updateTime.set(args[0], new Date());
                }
            } catch (NoSuchFieldException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }

    }

    @Before("execution(public * *..*ServiceImpl.update*(*,..))")
    public void update(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        if (Objects.nonNull(args[0])) {
            Class<?> clazz = args[0].getClass();
            try {
                Field updateTime = clazz.getDeclaredField("updateTime");
                if (Objects.nonNull(updateTime)) {
                    updateTime.setAccessible(true);
                    updateTime.set(args[0], new Date());
                }
            } catch (NoSuchFieldException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
