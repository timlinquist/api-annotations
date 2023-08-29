/*
 * Copyright 2023 Salesforce, Inc. All rights reserved.
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.api.annotation;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Documented;
import java.lang.annotation.Target;

/**
 * Marks the annotated member as experimental. Experimental features are not to be considered production ready. MuleSoft does not
 * offer support on them nor guarantees backwards compatibility on them.
 *
 * You can try them if you want, but keep in mind that the final version to be GA might not be backwards compatible or even
 * removed completely.
 *
 * @since 1.0.2
 */
@Documented
@Target(value = {TYPE, METHOD, FIELD, CONSTRUCTOR})
public @interface Experimental {

}
