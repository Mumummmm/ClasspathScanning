package com.pansy;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Scope("prototype")
@Primary
@Repository
public class MovieFinderImpl implements MovieFinder{
}
