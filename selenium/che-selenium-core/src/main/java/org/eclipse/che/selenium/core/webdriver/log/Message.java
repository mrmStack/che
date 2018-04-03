/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.selenium.core.webdriver.log;

/**
 * This is POJO to extract message from web driver network log entry
 *
 * @author Dmytro Nochevnov
 */
public interface Message {
  String getMethod();

  void setMethod(String method);

  Params getParams();

  void setParams(Params params);
}
