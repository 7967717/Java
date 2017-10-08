package com.romanrudenko.springInside;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author roman.rudenko on 31-Mar-16.
 */

@Retention(RetentionPolicy.RUNTIME)
public @interface InjectRandom {
    int min();
    int max();
}
