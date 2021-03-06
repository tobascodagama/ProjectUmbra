/**
 * InitiativeType.java: Enumeration of the kinds of initiative modes
 *     available.
 **
 * © 2011 Christopher E. Granade (cgranade@gmail.com).
 ** 
 * This file is part of UmbraCommons.
 *
 * UmbraCommons is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * UmbraCommons is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with UmbraCommons.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.cgranade.gamemodel.sr4;

public enum InitiativeType {
	PHYSICAL("P", "Physical"),
	MATRIX("M", "Matrix"),
	ASTRAL("A", "Astral");

	private final String abbrev, longName;
	
	private InitiativeType(String abbrev, String longName) {
		this.abbrev = abbrev;
		this.longName = longName;
	}
	
	public String getAbbrev() {
		return abbrev;
	}
	
	public String getLongName() {
		return longName;
	}
}
