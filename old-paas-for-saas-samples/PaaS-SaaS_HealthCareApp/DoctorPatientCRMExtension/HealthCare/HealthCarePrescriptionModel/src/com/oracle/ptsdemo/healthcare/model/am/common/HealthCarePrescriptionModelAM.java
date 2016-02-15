package com.oracle.ptsdemo.healthcare.model.am.common;

import com.oracle.ptsdemo.healthcare.business.HealthCareException;
import com.oracle.ptsdemo.healthcare.wsclient.osc.opty.ServiceException;

import oracle.jbo.ApplicationModule;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jan 13 10:25:05 BRST 2014
// ---------------------------------------------------------------------
public interface HealthCarePrescriptionModelAM extends ApplicationModule {
    void createAndInitPrescription(String visitId, String username, String doctorId, String patientId, String doctorName, String patientName);


    void updateOSCFields(String patientId, String jwtToken) throws ServiceException;

    void sendPrescriptionToPharmacy(String doctorName, String jwtToken);
}