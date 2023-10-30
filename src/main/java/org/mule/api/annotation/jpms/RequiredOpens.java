/*
 * Copyright 2023 Salesforce, Inc. All rights reserved.
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.api.annotation.jpms;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

/**
 * Add reflective visibility to the annotated {@link ServiceModule}. The module reading this annotation must have the wanted
 * permissions itself, in order to properly propagate them to the annotated service module.
 *
 * @since 1.6
 */
@Documented
@Retention(RUNTIME)
public @interface RequiredOpens {

  /**
   * @return the name of the module in the boot layer to open the {@code packageNames} from.
   */
  String moduleName();

  /**
   * @return the names of the packages to open from {@code moduleName} to the annotated service module.
   */
  String[] packageNames();

}
