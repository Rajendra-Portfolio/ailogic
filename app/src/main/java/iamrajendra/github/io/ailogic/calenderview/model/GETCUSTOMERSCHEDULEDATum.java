
package iamrajendra.github.io.ailogic.calenderview.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GETCUSTOMERSCHEDULEDATum implements Serializable
{

    @SerializedName("AppointmentID")
    @Expose
    private Integer appointmentID;
    @SerializedName("AuthCode")
    @Expose
    private String authCode;
    @SerializedName("VenueName")
    @Expose
    private String venueName;
    @SerializedName("AppointmentTypeID")
    @Expose
    private Integer appointmentTypeID;
    @SerializedName("AppointmentStatusType")
    @Expose
    private String appointmentStatusType;
    @SerializedName("AppointmentType")
    @Expose
    private String appointmentType;
    @SerializedName("AppointmentStatusID")
    @Expose
    private String appointmentStatusID;
    @SerializedName("BillRate")
    @Expose
    private String billRate;
    @SerializedName("TimeFinishReview")
    @Expose
    private Integer timeFinishReview;
    @SerializedName("CompanyName")
    @Expose
    private String companyName;
    @SerializedName("LanguageID")
    @Expose
    private Integer languageID;
    @SerializedName("LanguageName")
    @Expose
    private String languageName;
    @SerializedName("CompanyID")
    @Expose
    private Integer companyID;
    @SerializedName("OSMillageRate")
    @Expose
    private String oSMillageRate;
    @SerializedName("CustomerID")
    @Expose
    private Integer customerID;
    @SerializedName("VendorName")
    @Expose
    private String vendorName;
    @SerializedName("OSPerHourFee")
    @Expose
    private String oSPerHourFee;
    @SerializedName("perHourFee")
    @Expose
    private String perHourFee;
    @SerializedName("StartDateTime")
    @Expose
    private String startDateTime;
    @SerializedName("EndDateTime")
    @Expose
    private String endDateTime;
    @SerializedName("decspt")
    @Expose
    private Boolean decspt;
    @SerializedName("CaseName")
    @Expose
    private String caseName;
    @SerializedName("ClientName")
    @Expose
    private String clientName;
    @SerializedName("CaseNumber")
    @Expose
    private String caseNumber;
    @SerializedName("TranslationInvoice")
    @Expose
    private Boolean translationInvoice;
    @SerializedName("TranslationConfirmed")
    @Expose
    private Boolean translationConfirmed;
    @SerializedName("TranslationWaitingList")
    @Expose
    private Boolean translationWaitingList;
    @SerializedName("TranslationCancellationFee")
    @Expose
    private Boolean translationCancellationFee;
    @SerializedName("TranslationPriority")
    @Expose
    private Boolean translationPriority;
    @SerializedName("Requestscounts")
    @Expose
    private Integer requestscounts;
    @SerializedName("AssignedByName")
    @Expose
    private String assignedByName;
    @SerializedName("Duration")
    @Expose
    private Integer duration;
    @SerializedName("CallServiceBit")
    @Expose
    private Boolean callServiceBit;
    @SerializedName("WordCount")
    @Expose
    private String wordCount;
    @SerializedName("WaitingList")
    @Expose
    private Boolean waitingList;
    @SerializedName("BookedBy")
    @Expose
    private Integer bookedBy;
    @SerializedName("BookedOn")
    @Expose
    private String bookedOn;
    @SerializedName("ConfirmedBy")
    @Expose
    private Integer confirmedBy;
    @SerializedName("ConfirmedByName")
    @Expose
    private String confirmedByName;
    @SerializedName("ConfirmedOn")
    @Expose
    private String confirmedOn;
    @SerializedName("RequestedBy")
    @Expose
    private Integer requestedBy;
    @SerializedName("RequestedByName")
    @Expose
    private String requestedByName;
    @SerializedName("UpdateDate")
    @Expose
    private String updateDate;
    @SerializedName("Priority")
    @Expose
    private Boolean priority;
    @SerializedName("AddedOn")
    @Expose
    private String addedOn;
    @SerializedName("CancellationFee")
    @Expose
    private Boolean cancellationFee;
    @SerializedName("DeleteStatus")
    @Expose
    private Boolean deleteStatus;
    @SerializedName("ChangeStatus")
    @Expose
    private Boolean changeStatus;
    @SerializedName("Priorityfee")
    @Expose
    private String priorityfee;
    @SerializedName("PublicPrivate")
    @Expose
    private Boolean publicPrivate;
    @SerializedName("ConfirmationBit")
    @Expose
    private Boolean confirmationBit;
    @SerializedName("InvoiceBit")
    @Expose
    private Boolean invoiceBit;
    @SerializedName("SyncBit")
    @Expose
    private Boolean syncBit;
    @SerializedName("CSyncBit")
    @Expose
    private Boolean cSyncBit;
    @SerializedName("readyToSync")
    @Expose
    private Boolean readyToSync;
    @SerializedName("CreadyToSync")
    @Expose
    private Boolean creadyToSync;
    @SerializedName("CustomerName")
    @Expose
    private String customerName;
    @SerializedName("Filecounts")
    @Expose
    private Integer filecounts;
    @SerializedName("VendorFilecounts")
    @Expose
    private Integer vendorFilecounts;
    @SerializedName("TRANTargetLanguagesRate")
    @Expose
    private Integer tRANTargetLanguagesRate;
    @SerializedName("InterpretorName")
    @Expose
    private String interpretorName;
    @SerializedName("Address")
    @Expose
    private String address;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("StateName")
    @Expose
    private String stateName;
    @SerializedName("Zipcode")
    @Expose
    private String zipcode;
    @SerializedName("VendorEmailConformation")
    @Expose
    private Integer vendorEmailConformation;
    @SerializedName("AppointmentTypeName")
    @Expose
    private String appointmentTypeName;
    @SerializedName("CustomerCancelRequest")
    @Expose
    private Integer customerCancelRequest;
    private final static long serialVersionUID = 332530001261639972L;

    public Integer getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(Integer appointmentID) {
        this.appointmentID = appointmentID;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public Integer getAppointmentTypeID() {
        return appointmentTypeID;
    }

    public void setAppointmentTypeID(Integer appointmentTypeID) {
        this.appointmentTypeID = appointmentTypeID;
    }

    public String getAppointmentStatusType() {
        return appointmentStatusType;
    }

    public void setAppointmentStatusType(String appointmentStatusType) {
        this.appointmentStatusType = appointmentStatusType;
    }

    public String getAppointmentType() {
        return appointmentType;
    }

    public void setAppointmentType(String appointmentType) {
        this.appointmentType = appointmentType;
    }

    public String getAppointmentStatusID() {
        return appointmentStatusID;
    }

    public void setAppointmentStatusID(String appointmentStatusID) {
        this.appointmentStatusID = appointmentStatusID;
    }

    public String getBillRate() {
        return billRate;
    }

    public void setBillRate(String billRate) {
        this.billRate = billRate;
    }

    public Integer getTimeFinishReview() {
        return timeFinishReview;
    }

    public void setTimeFinishReview(Integer timeFinishReview) {
        this.timeFinishReview = timeFinishReview;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getLanguageID() {
        return languageID;
    }

    public void setLanguageID(Integer languageID) {
        this.languageID = languageID;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public Integer getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Integer companyID) {
        this.companyID = companyID;
    }

    public String getOSMillageRate() {
        return oSMillageRate;
    }

    public void setOSMillageRate(String oSMillageRate) {
        this.oSMillageRate = oSMillageRate;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getOSPerHourFee() {
        return oSPerHourFee;
    }

    public void setOSPerHourFee(String oSPerHourFee) {
        this.oSPerHourFee = oSPerHourFee;
    }

    public String getPerHourFee() {
        return perHourFee;
    }

    public void setPerHourFee(String perHourFee) {
        this.perHourFee = perHourFee;
    }

    public String getStartDateTime() {

        return startDateTime;
    }

    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    public String getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }

    public Boolean getDecspt() {
        return decspt;
    }

    public void setDecspt(Boolean decspt) {
        this.decspt = decspt;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    public Boolean getTranslationInvoice() {
        return translationInvoice;
    }

    public void setTranslationInvoice(Boolean translationInvoice) {
        this.translationInvoice = translationInvoice;
    }

    public Boolean getTranslationConfirmed() {
        return translationConfirmed;
    }

    public void setTranslationConfirmed(Boolean translationConfirmed) {
        this.translationConfirmed = translationConfirmed;
    }

    public Boolean getTranslationWaitingList() {
        return translationWaitingList;
    }

    public void setTranslationWaitingList(Boolean translationWaitingList) {
        this.translationWaitingList = translationWaitingList;
    }

    public Boolean getTranslationCancellationFee() {
        return translationCancellationFee;
    }

    public void setTranslationCancellationFee(Boolean translationCancellationFee) {
        this.translationCancellationFee = translationCancellationFee;
    }

    public Boolean getTranslationPriority() {
        return translationPriority;
    }

    public void setTranslationPriority(Boolean translationPriority) {
        this.translationPriority = translationPriority;
    }

    public Integer getRequestscounts() {
        return requestscounts;
    }

    public void setRequestscounts(Integer requestscounts) {
        this.requestscounts = requestscounts;
    }

    public String getAssignedByName() {
        return assignedByName;
    }

    public void setAssignedByName(String assignedByName) {
        this.assignedByName = assignedByName;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Boolean getCallServiceBit() {
        return callServiceBit;
    }

    public void setCallServiceBit(Boolean callServiceBit) {
        this.callServiceBit = callServiceBit;
    }

    public String getWordCount() {
        return wordCount;
    }

    public void setWordCount(String wordCount) {
        this.wordCount = wordCount;
    }

    public Boolean getWaitingList() {
        return waitingList;
    }

    public void setWaitingList(Boolean waitingList) {
        this.waitingList = waitingList;
    }

    public Integer getBookedBy() {
        return bookedBy;
    }

    public void setBookedBy(Integer bookedBy) {
        this.bookedBy = bookedBy;
    }

    public String getBookedOn() {
        return bookedOn;
    }

    public void setBookedOn(String bookedOn) {
        this.bookedOn = bookedOn;
    }

    public Integer getConfirmedBy() {
        return confirmedBy;
    }

    public void setConfirmedBy(Integer confirmedBy) {
        this.confirmedBy = confirmedBy;
    }

    public String getConfirmedByName() {
        return confirmedByName;
    }

    public void setConfirmedByName(String confirmedByName) {
        this.confirmedByName = confirmedByName;
    }

    public String getConfirmedOn() {
        return confirmedOn;
    }

    public void setConfirmedOn(String confirmedOn) {
        this.confirmedOn = confirmedOn;
    }

    public Integer getRequestedBy() {
        return requestedBy;
    }

    public void setRequestedBy(Integer requestedBy) {
        this.requestedBy = requestedBy;
    }

    public String getRequestedByName() {
        return requestedByName;
    }

    public void setRequestedByName(String requestedByName) {
        this.requestedByName = requestedByName;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public Boolean getPriority() {
        return priority;
    }

    public void setPriority(Boolean priority) {
        this.priority = priority;
    }

    public String getAddedOn() {
        return addedOn;
    }

    public void setAddedOn(String addedOn) {
        this.addedOn = addedOn;
    }

    public Boolean getCancellationFee() {
        return cancellationFee;
    }

    public void setCancellationFee(Boolean cancellationFee) {
        this.cancellationFee = cancellationFee;
    }

    public Boolean getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Boolean deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Boolean getChangeStatus() {
        return changeStatus;
    }

    public void setChangeStatus(Boolean changeStatus) {
        this.changeStatus = changeStatus;
    }

    public String getPriorityfee() {
        return priorityfee;
    }

    public void setPriorityfee(String priorityfee) {
        this.priorityfee = priorityfee;
    }

    public Boolean getPublicPrivate() {
        return publicPrivate;
    }

    public void setPublicPrivate(Boolean publicPrivate) {
        this.publicPrivate = publicPrivate;
    }

    public Boolean getConfirmationBit() {
        return confirmationBit;
    }

    public void setConfirmationBit(Boolean confirmationBit) {
        this.confirmationBit = confirmationBit;
    }

    public Boolean getInvoiceBit() {
        return invoiceBit;
    }

    public void setInvoiceBit(Boolean invoiceBit) {
        this.invoiceBit = invoiceBit;
    }

    public Boolean getSyncBit() {
        return syncBit;
    }

    public void setSyncBit(Boolean syncBit) {
        this.syncBit = syncBit;
    }

    public Boolean getCSyncBit() {
        return cSyncBit;
    }

    public void setCSyncBit(Boolean cSyncBit) {
        this.cSyncBit = cSyncBit;
    }

    public Boolean getReadyToSync() {
        return readyToSync;
    }

    public void setReadyToSync(Boolean readyToSync) {
        this.readyToSync = readyToSync;
    }

    public Boolean getCreadyToSync() {
        return creadyToSync;
    }

    public void setCreadyToSync(Boolean creadyToSync) {
        this.creadyToSync = creadyToSync;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getFilecounts() {
        return filecounts;
    }

    public void setFilecounts(Integer filecounts) {
        this.filecounts = filecounts;
    }

    public Integer getVendorFilecounts() {
        return vendorFilecounts;
    }

    public void setVendorFilecounts(Integer vendorFilecounts) {
        this.vendorFilecounts = vendorFilecounts;
    }

    public Integer getTRANTargetLanguagesRate() {
        return tRANTargetLanguagesRate;
    }

    public void setTRANTargetLanguagesRate(Integer tRANTargetLanguagesRate) {
        this.tRANTargetLanguagesRate = tRANTargetLanguagesRate;
    }

    public String getInterpretorName() {
        return interpretorName;
    }

    public void setInterpretorName(String interpretorName) {
        this.interpretorName = interpretorName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Integer getVendorEmailConformation() {
        return vendorEmailConformation;
    }

    public void setVendorEmailConformation(Integer vendorEmailConformation) {
        this.vendorEmailConformation = vendorEmailConformation;
    }

    public String getAppointmentTypeName() {
        return appointmentTypeName;
    }

    public void setAppointmentTypeName(String appointmentTypeName) {
        this.appointmentTypeName = appointmentTypeName;
    }

    public Integer getCustomerCancelRequest() {
        return customerCancelRequest;
    }

    public void setCustomerCancelRequest(Integer customerCancelRequest) {
        this.customerCancelRequest = customerCancelRequest;
    }



}
