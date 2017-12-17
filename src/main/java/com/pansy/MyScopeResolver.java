package com.pansy;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ScopeMetadata;
import org.springframework.context.annotation.ScopeMetadataResolver;

public class MyScopeResolver implements ScopeMetadataResolver{

    public MyScopeResolver() {
    }

    public ScopeMetadata resolveScopeMetadata(BeanDefinition beanDefinition) {
        return null;
    }
}
