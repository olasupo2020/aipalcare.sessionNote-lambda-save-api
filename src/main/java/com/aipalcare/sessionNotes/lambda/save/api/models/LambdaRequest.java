package com.aipalcare.sessionNotes.lambda.save.api.models;

import lombok.Data;

@Data
public class LambdaRequest {
    private String nameOfChild1;
    private String dateOfBirth;
    private String age;
    private String serviceProviderAgen;
    private String timeIn;
    private String timeOut;
    private String units1;
    private String typeOfService1;
    private String typeOfSession;
    private String locationOfSession;
    private String outcomeFromIfsp;
    private String childFamilyOutUpdate;
    private String whatWeDidToday;
    private String progressInfoCollection;
    private String plans4NextSession;
    private String nameOfChild2;
    private String ifspDate;
    private String typeOfService2;
    private String units2;
    private String earlyInterventionistNameTitleSigPhone;
    private String parentCaregiverNameSign;
    private String coordinatorName;
    private String dateNextSession;
}
