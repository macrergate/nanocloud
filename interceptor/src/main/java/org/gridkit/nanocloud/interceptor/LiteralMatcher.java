/**
 * Copyright 2013 Alexey Ragozin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gridkit.nanocloud.interceptor;

import java.io.Serializable;

import org.gridkit.nanocloud.interceptor.Intercept.ParamMatcher;

class LiteralMatcher implements ParamMatcher, Serializable {

	private static final long serialVersionUID = 20130621L;
	
	private final Object value;
	
	public LiteralMatcher(Object value) {
		this.value = value;
	}

	@Override
	public boolean matches(Object param) {
		return (value == null && param == null) || (value != null && value.equals(param));
	}
}
