/**
 * Copyright (C) 2015 Bonitasoft S.A.
 * Bonitasoft, 32 rue Gustave Eiffel - 38000 Grenoble
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2.0 of the License, or
 * (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.bonitasoft.web.extension.rest;

import java.util.Locale;

import org.bonitasoft.engine.api.APIClient;
import org.bonitasoft.engine.api.IdentityAPI;
import org.bonitasoft.engine.api.ProcessAPI;
import org.bonitasoft.engine.session.APISession;
import org.bonitasoft.web.extension.ResourceProvider;

/**
 * This class provide access to the data relative to the context in which the Rest API extension is called
 *
 * @since 7.2.0
 */
public interface RestAPIContext {

    /**
     * The {@link APIClient} is used to access business data and Bonita BPM APIs such as:
     * <ul>
     * <li>{@link IdentityAPI},</li>
     * <li>{@link ProcessAPI},</li>
     * <li>...</li>
     * </ul>
     * 
     * @return an engine {@link APIClient} logged to the current {@link APISession}
     */
    public APIClient getApiClient();

    /**
     * @return Current engine {@link APISession}
     */
    public APISession getApiSession();

    /**
     * @return Current selected {@link Locale} in BonitaBPM Portal
     */
    public Locale getLocale();

    /**
     * @return a {@link ResourceProvider} to retrieve resources location
     */
    public ResourceProvider getResourceProvider();

}
