/*
 * Copyright (c) 2012, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package org.glassfish.jersey.internal.util;

import java.util.concurrent.Callable;

/**
 * This interface extends {@link java.util.concurrent.Callable} interface but removes the
 * exception from {@code call} declaration.
 * <p>
 * This convenience interface may be used in places where a task
 * producing a result needs to be executed in the request scope but no
 * {@link Exception checked exceptions} are thrown during the task
 * execution.
 * </p>
 *
 * @param <T> type of the produced result.
 *
 * @author Marek Potociar (marek.potociar at oracle.com)
 */
public interface Producer<T> extends Callable<T> {
    @Override
    T call();
}
