/*
 * Copyright 2023 Salesforce, Inc. All rights reserved.
 */
package org.mule.api.annotation;

import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Documented;
import java.lang.annotation.Target;

/**
 * Indicates that a class must not be extended by clients.
 * <p/>
 * As a class annotated with {@link NoExtend} must not be extended, the protected parts of this class definition will not be
 * considered part of the API, so they can change without considering those changes as backwards incompatible.
 * <p/>
 * WARNING: Ignoring the presence of this annotation can cause compile or runtime problems when a new version is available
 *
 * @since 1.0
 */
@Documented
@Target(value = {TYPE})
public @interface NoExtend {

}
