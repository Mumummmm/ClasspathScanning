package com.pansy;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

@Configuration
@ComponentScan(basePackages = "com.pansy",
        //3.10.4
        includeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*Stub.*Repository"),
        excludeFilters = @ComponentScan.Filter(Repository.class),
        //3.10.6
        nameGenerator = MyNameGenerator.class,
        //3.10.7
        scopeResolver = MyScopeResolver.class,
        scopedProxy = ScopedProxyMode.INTERFACES)
public class AppConfig {
}
