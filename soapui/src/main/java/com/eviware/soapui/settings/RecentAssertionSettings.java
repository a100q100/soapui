/*
 * Copyright 2004-2014 SmartBear Software
 *
 * Licensed under the EUPL, Version 1.1 or - as soon as they will be approved by the European Commission - subsequent
 * versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://ec.europa.eu/idabc/eupl
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is
 * distributed on an "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the Licence for the specific language governing permissions and limitations
 * under the Licence.
*/

package com.eviware.soapui.settings;

import com.eviware.soapui.settings.Setting.SettingType;

public interface RecentAssertionSettings
{
	@Setting( name = "Recent assertions", description = "last recently used assertions", type = SettingType.STRINGLIST )
	public final static String RECENT_ASSERTIONS = RecentAssertionSettings.class.getSimpleName() + "@"
			+ "recent-assertions";
}
