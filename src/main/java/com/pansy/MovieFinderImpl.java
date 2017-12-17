package com.pansy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Scope("prototype")
@Primary
@Repository
@Qualifier("Action")
public class MovieFinderImpl implements MovieFinder{
}
