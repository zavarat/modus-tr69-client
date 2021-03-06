/**
 * Product Name : Modus TR-069 Orange
 *
 * Copyright c 2014 Orange
 *
 * This software is distributed under the Apache License, Version 2.0
 * (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 or see the "license.txt" file for
 * more details
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Author: Olivier Beyler - Orange
 */

package com.francetelecom.admindm.model;

import com.francetelecom.admindm.api.CheckCallBack;
import com.francetelecom.admindm.soap.Fault;
import com.francetelecom.admindm.soap.FaultUtil;

/**
 * The Class CheckMaximum.
 */
public class CheckMaximum implements CheckCallBack {

	/** The maximum allowed value. */
	private final long maximum;

	/**
	 * Instantiates a new check maximum.
	 * 
	 * @param pMaximum
	 *            the maximum
	 */
	public CheckMaximum(final long pMaximum) {
		this.maximum = pMaximum;
	}

	/**
	 * Check.
	 * 
	 * @param value
	 *            the value
	 * @throws Fault
	 *             the fault
	 * @see com.francetelecom.admindm.api.CheckCallBack#check(java.lang.Object)
	 */
	public final void check(final Object value) throws Fault {
		Long temp;
		try {
			temp = new Long(value.toString());
		} catch (NumberFormatException e) {
			StringBuffer error = new StringBuffer(FaultUtil.STR_FAULT_9007);
			error.append(" value :");
			error.append(value);
			error.append(" is not a number. ");
			throw new Fault(FaultUtil.FAULT_9007, error.toString(), e);
		}
		if (temp.longValue() > maximum) {
			StringBuffer error = new StringBuffer(FaultUtil.STR_FAULT_9007);
			error.append(" the maximum value allowed is ");
			error.append(maximum);
			error.append(".");
			throw new Fault(FaultUtil.FAULT_9007, error.toString());
		}
	}
}
