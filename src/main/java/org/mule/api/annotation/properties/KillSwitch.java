/*
 * Copyright 2023 Salesforce, Inc. All rights reserved.
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.api.annotation.properties;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;


/**
 * Indicates that the annotated constant is a system property that functions as a kill-switch.
 * <p>
 * A kill-switch is a property to disable a risky feature/code change that in theory should be transparent.
 */
@Documented
@Retention(RUNTIME)
@Target(FIELD)
public @interface KillSwitch {

}
