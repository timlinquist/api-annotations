/*
 * Copyright 2023 Salesforce, Inc. All rights reserved.
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
