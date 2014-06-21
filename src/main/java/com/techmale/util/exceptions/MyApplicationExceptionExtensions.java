/**
 * Copyright (c) 2014, Techmale <oss@techmale.com>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.techmale.util.exceptions;

import com.techmale.exception_extension.ExceptionExtensions;

/**
 * Demonstration of extending your own Exception
 */
public class MyApplicationExceptionExtensions{

    public static final ExceptionExtensions<InstantiationException> InstantiationException = new ExceptionExtensions(InstantiationException.class);

}
