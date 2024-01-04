package org.sentrysoftware.winrm.service.client.auth.ntlm;

/*-
 * ╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲
 * WinRM Java Client
 * ჻჻჻჻჻჻
 * Copyright 2023 - 2024 Sentry Software
 * ჻჻჻჻჻჻
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱
 */

import org.apache.http.auth.AuthScheme;
import org.apache.http.impl.auth.NTLMSchemeFactory;
import org.apache.http.protocol.HttpContext;

/**
 * Code from io.cloudsoft.winrm4j.client.ntlm.NtlmMasqAsSpnegoSchemeFactory
 * release 0.12.3 @link https://github.com/cloudsoft/winrm4j
 */
public class NtlmMasqAsSpnegoSchemeFactory extends NTLMSchemeFactory {

	@Override
	public AuthScheme create(HttpContext context) {
		return new NtlmMasqAsSpnegoScheme();
	}
}
