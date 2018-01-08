/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.api.annotation;

import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Documented;
import java.lang.annotation.Target;

/**
 * Indicates that a class must not be instantiated by clients.
 * <p/>
 * As a class annotated with {@link NoInstantiate} must not be instantiated, the constructors parts of this class definition will
 * not be considered part of the API, so they can change without considering those changes as backwards incompatible. Note that
 * classes annotated with {@link NoInstantiate} will imply also the same constraints defined by {@link NoExtend}
 * <p/>
 * WARNING: Ignoring the presence of this annotation can cause compile or runtime problems when a new version is available
 *
 * @since 1.0
 */
@Documented
@Target(value = {TYPE})
public @interface NoInstantiate {

}
