/*
 * Copyright 2023 Salesforce, Inc. All rights reserved.
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.api.annotation.jpms;

import static java.lang.annotation.ElementType.MODULE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Marks a JPMS Module as the entry point of a Mule Service.
 * 
 * @since 1.6
 */
@Documented
@Retention(RUNTIME)
@Target(MODULE)
public @interface ServiceModule {

}
