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
 * Indicates that an interface must not be implemented by clients.
 *
 * <p/>
 * As an interface annotated with {@link NoImplement} must not be implemented, this means that the interface can include new non
 * default methods without breaking any implementation, so they can change without considering those changes as backwards
 * incompatible.
 * <p/>
 * WARNING: Ignoring the presence of this annotation can cause compile or runtime problems when a new version is available
 *
 * @since 1.0
 */
@Documented
@Target(value = {TYPE})
public @interface NoImplement {

}
