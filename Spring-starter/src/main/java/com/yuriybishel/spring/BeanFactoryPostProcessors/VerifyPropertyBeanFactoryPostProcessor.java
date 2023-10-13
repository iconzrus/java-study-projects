package com.yuriybishel.spring.BeanFactoryPostProcessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.Ordered;

public class VerifyPropertyBeanFactoryPostProcessor implements org.springframework.beans.factory.config.BeanFactoryPostProcessor, Ordered {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException{
        System.out.println();
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
