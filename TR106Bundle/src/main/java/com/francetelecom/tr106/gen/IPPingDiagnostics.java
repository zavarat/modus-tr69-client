/**
 * Copyright France Telecom (Orange Labs R&D) 2008,  All Rights Reserved.
 *
 * This software is the confidential and proprietary information
 * of France Telecom (Orange Labs R&D). You shall not disclose
 * such Confidential Information and shall use it only in accordance
 * with the terms of the license agreement you entered into with
 * France Telecom (Orange Labs R&D)
 *
 * Project     : Modus
 * Software    : Library
 *
 * Author : Orange Labs R&D O.Beyler
 * Generated : 21 oct. 2009 by GenModel
 */

package com.francetelecom.tr106.gen;

import com.francetelecom.admindm.api.StorageMode;
import com.francetelecom.admindm.model.CheckEnum;
import com.francetelecom.admindm.model.CheckLength;
import com.francetelecom.admindm.model.CheckMaximum;
import com.francetelecom.admindm.model.CheckMinimum;
import com.francetelecom.admindm.model.IParameterData;
import com.francetelecom.admindm.model.ParameterType;
import com.francetelecom.admindm.soap.Fault;

/**
 * Class IPPingDiagnostics.
 * 
 * @author OrangeLabs R&D
 */
public class IPPingDiagnostics {
	/** The data. */
	private final IParameterData data;
	/** The base path. */
	private final String basePath;

	/**
	 * Default constructor.
	 * 
	 * @param pData
	 *            data model
	 * @param pBasePath
	 *            base path of attribute
	 * @param pPersist
	 *            persistence
	 */
	public IPPingDiagnostics(final IParameterData pData, final String pBasePath) {
		super();
		this.data = pData;
		this.basePath = pBasePath;
	}

	/**
	 * Get the data.
	 * 
	 * @return the data
	 */
	public final IParameterData getData() {
		return data;
	}

	/**
	 * Get the basePath.
	 * 
	 * @return the basePath
	 */
	public final String getBasePath() {
		return basePath;
	}

	/**
	 * Initialiser.
	 */
	public void initialize() throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = data.createOrRetrieveParameter(basePath);
		param.setType(ParameterType.ANY);

		paramTimeout = createTimeout();
		paramMinimumResponseTime = createMinimumResponseTime();
		paramFailureCount = createFailureCount();
		paramNumberOfRepetitions = createNumberOfRepetitions();
		paramHost = createHost();
		paramSuccessCount = createSuccessCount();
		paramAverageResponseTime = createAverageResponseTime();
		paramDSCP = createDSCP();
		paramDataBlockSize = createDataBlockSize();
		paramDiagnosticsState = createDiagnosticsState();
		paramMaximumResponseTime = createMaximumResponseTime();
	}

	/**
    *  
    */
	private com.francetelecom.admindm.model.Parameter paramTimeout;

	/**
	 * Getter method of Timeout.
	 * 
	 * @return _Timeout
	 */
	public final com.francetelecom.admindm.model.Parameter getParamTimeout() {
		return paramTimeout;
	}

	/**
	 * Create the parameter Timeout
	 * 
	 * @return Timeout
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createTimeout()
			throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = data.createOrRetrieveParameter(basePath + "Timeout");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setType(ParameterType.UINT);
		param.addCheck(new CheckMinimum(0));
		param.addCheck(new CheckMaximum(4294967295L));
		param.setValue(new Long(0));
		param.addCheck(new CheckMinimum(1));
		param.setWritable(true);
		return param;
	}

	/**
    *  
    */
	private com.francetelecom.admindm.model.Parameter paramMinimumResponseTime;

	/**
	 * Getter method of MinimumResponseTime.
	 * 
	 * @return _MinimumResponseTime
	 */
	public final com.francetelecom.admindm.model.Parameter getParamMinimumResponseTime() {
		return paramMinimumResponseTime;
	}

	/**
	 * Create the parameter MinimumResponseTime
	 * 
	 * @return MinimumResponseTime
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createMinimumResponseTime()
			throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = data
				.createOrRetrieveParameter(basePath + "MinimumResponseTime");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setActiveNotificationDenied(true);
		param.setType(ParameterType.UINT);
		param.addCheck(new CheckMinimum(0));
		param.addCheck(new CheckMaximum(4294967295L));
		param.setValue(new Long(0));
		param.setWritable(false);
		return param;
	}

	/**
    *  
    */
	private com.francetelecom.admindm.model.Parameter paramFailureCount;

	/**
	 * Getter method of FailureCount.
	 * 
	 * @return _FailureCount
	 */
	public final com.francetelecom.admindm.model.Parameter getParamFailureCount() {
		return paramFailureCount;
	}

	/**
	 * Create the parameter FailureCount
	 * 
	 * @return FailureCount
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createFailureCount()
			throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = data.createOrRetrieveParameter(basePath + "FailureCount");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setActiveNotificationDenied(true);
		param.setType(ParameterType.UINT);
		param.addCheck(new CheckMinimum(0));
		param.addCheck(new CheckMaximum(4294967295L));
		param.setValue(new Long(0));
		param.setWritable(false);
		return param;
	}

	/**
    *  
    */
	private com.francetelecom.admindm.model.Parameter paramNumberOfRepetitions;

	/**
	 * Getter method of NumberOfRepetitions.
	 * 
	 * @return _NumberOfRepetitions
	 */
	public final com.francetelecom.admindm.model.Parameter getParamNumberOfRepetitions() {
		return paramNumberOfRepetitions;
	}

	/**
	 * Create the parameter NumberOfRepetitions
	 * 
	 * @return NumberOfRepetitions
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createNumberOfRepetitions()
			throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = data
				.createOrRetrieveParameter(basePath + "NumberOfRepetitions");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setType(ParameterType.UINT);
		param.addCheck(new CheckMinimum(0));
		param.addCheck(new CheckMaximum(4294967295L));
		param.setValue(new Long(0));
		param.addCheck(new CheckMinimum(1));
		param.setWritable(true);
		return param;
	}

	/**
    *  
    */
	private com.francetelecom.admindm.model.Parameter paramHost;

	/**
	 * Getter method of Host.
	 * 
	 * @return _Host
	 */
	public final com.francetelecom.admindm.model.Parameter getParamHost() {
		return paramHost;
	}

	/**
	 * Create the parameter Host
	 * 
	 * @return Host
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createHost()
			throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = data.createOrRetrieveParameter(basePath + "Host");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setType(ParameterType.STRING);
		param.addCheck(new CheckLength(256));
		param.setValue("");
		param.setWritable(true);
		return param;
	}

	/**
    *  
    */
	private com.francetelecom.admindm.model.Parameter paramSuccessCount;

	/**
	 * Getter method of SuccessCount.
	 * 
	 * @return _SuccessCount
	 */
	public final com.francetelecom.admindm.model.Parameter getParamSuccessCount() {
		return paramSuccessCount;
	}

	/**
	 * Create the parameter SuccessCount
	 * 
	 * @return SuccessCount
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createSuccessCount()
			throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = data.createOrRetrieveParameter(basePath + "SuccessCount");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setActiveNotificationDenied(true);
		param.setType(ParameterType.UINT);
		param.addCheck(new CheckMinimum(0));
		param.addCheck(new CheckMaximum(4294967295L));
		param.setValue(new Long(0));
		param.setWritable(false);
		return param;
	}

	/**
    *  
    */
	private com.francetelecom.admindm.model.Parameter paramAverageResponseTime;

	/**
	 * Getter method of AverageResponseTime.
	 * 
	 * @return _AverageResponseTime
	 */
	public final com.francetelecom.admindm.model.Parameter getParamAverageResponseTime() {
		return paramAverageResponseTime;
	}

	/**
	 * Create the parameter AverageResponseTime
	 * 
	 * @return AverageResponseTime
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createAverageResponseTime()
			throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = data
				.createOrRetrieveParameter(basePath + "AverageResponseTime");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setActiveNotificationDenied(true);
		param.setType(ParameterType.UINT);
		param.addCheck(new CheckMinimum(0));
		param.addCheck(new CheckMaximum(4294967295L));
		param.setValue(new Long(0));
		param.setWritable(false);
		return param;
	}

	/**
	 * DiffServ codepoint to be used for the test packets. By default the SHOULD
	 * set this value to zero.
	 */
	private com.francetelecom.admindm.model.Parameter paramDSCP;

	/**
	 * Getter method of DSCP.
	 * 
	 * @return _DSCP
	 */
	public final com.francetelecom.admindm.model.Parameter getParamDSCP() {
		return paramDSCP;
	}

	/**
	 * Create the parameter DSCP
	 * 
	 * @return DSCP
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createDSCP()
			throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = data.createOrRetrieveParameter(basePath + "DSCP");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setType(ParameterType.UINT);
		param.addCheck(new CheckMinimum(0));
		param.addCheck(new CheckMaximum(4294967295L));
		param.setValue(new Long(0));
		param.addCheck(new CheckMinimum(0));
		param.addCheck(new CheckMaximum(63));
		param.setWritable(true);
		return param;
	}

	/**
    *  
    */
	private com.francetelecom.admindm.model.Parameter paramDataBlockSize;

	/**
	 * Getter method of DataBlockSize.
	 * 
	 * @return _DataBlockSize
	 */
	public final com.francetelecom.admindm.model.Parameter getParamDataBlockSize() {
		return paramDataBlockSize;
	}

	/**
	 * Create the parameter DataBlockSize
	 * 
	 * @return DataBlockSize
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createDataBlockSize()
			throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = data.createOrRetrieveParameter(basePath + "DataBlockSize");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setType(ParameterType.UINT);
		param.addCheck(new CheckMinimum(0));
		param.addCheck(new CheckMaximum(4294967295L));
		param.setValue(new Long(0));
		param.addCheck(new CheckMinimum(1));
		param.addCheck(new CheckMaximum(65535));
		param.setWritable(true);
		return param;
	}

	/**
	 * Indicates availability of diagnostic data. {{enum}} If the ACS sets value
	 * of this parameter to {{enum|Requested}}, the CPE MUST initiate
	 * corresponding diagnostic test. When writing, the only allowed value
	 * {{enum|Requested}}. To ensure the use of the proper test parameters
	 * writable parameters in this object), the test parameters MUST be set
	 * prior to or at the same time as (in the same SetParameterValues) the
	 * {{param}} to {{enum|Requested}}. When requested, the CPE SHOULD until
	 * after completion of the communication session with the ACS starting the
	 * diagnostic. When the test is completed, the value of parameter MUST be
	 * either {{enum|Complete}} (if the test completed or one of the ''Error''
	 * values listed above. If the value of this is anything other than
	 * {{enum|Complete}}, the values of the results for this test are
	 * indeterminate. When the diagnostic initiated by ACS is completed
	 * (successfully or not), the CPE MUST establish a new to the ACS to allow
	 * the ACS to view the results, indicating the code ''8 DIAGNOSTICS
	 * COMPLETE'' in the Inform message. After the is complete, the value of all
	 * result parameters (all read-only in this object) MUST be retained by the
	 * CPE until either this is run again, or the CPE reboots. After a reboot,
	 * if the CPE has not the result parameters from the most recent test, it
	 * MUST set the of this parameter to {{enum|None}}. Modifying any of the
	 * writable in this object except for this one MUST result in the value of
	 * this being set to {{enum|None}}. While the test is in progress, modifying
	 * of the writable parameters in this object except for this one MUST in the
	 * test being terminated and the value of this parameter being to
	 * {{enum|None}}. While the test is in progress, setting this to
	 * {{enum|Requested}} (and possibly modifying other writable in this object)
	 * MUST result in the test being terminated and then using the current
	 * values of the test parameters.
	 */
	private com.francetelecom.admindm.model.Parameter paramDiagnosticsState;

	/**
	 * Getter method of DiagnosticsState.
	 * 
	 * @return _DiagnosticsState
	 */
	public final com.francetelecom.admindm.model.Parameter getParamDiagnosticsState() {
		return paramDiagnosticsState;
	}

	/**
	 * Create the parameter DiagnosticsState
	 * 
	 * @return DiagnosticsState
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createDiagnosticsState()
			throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = data.createOrRetrieveParameter(basePath + "DiagnosticsState");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setActiveNotificationDenied(true);
		param.setType(ParameterType.STRING);
		param.setValue("");
		String[] values = { "None", "Requested", "Complete",
				"Error_CannotResolveHostName", "Error_Internal", "Error_Other", };
		param.addCheck(new CheckEnum(values));
		param.setWritable(true);
		return param;
	}

	/**
    *  
    */
	private com.francetelecom.admindm.model.Parameter paramMaximumResponseTime;

	/**
	 * Getter method of MaximumResponseTime.
	 * 
	 * @return _MaximumResponseTime
	 */
	public final com.francetelecom.admindm.model.Parameter getParamMaximumResponseTime() {
		return paramMaximumResponseTime;
	}

	/**
	 * Create the parameter MaximumResponseTime
	 * 
	 * @return MaximumResponseTime
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createMaximumResponseTime()
			throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = data
				.createOrRetrieveParameter(basePath + "MaximumResponseTime");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setActiveNotificationDenied(true);
		param.setType(ParameterType.UINT);
		param.addCheck(new CheckMinimum(0));
		param.addCheck(new CheckMaximum(4294967295L));
		param.setValue(new Long(0));
		param.setWritable(false);
		return param;
	}

}