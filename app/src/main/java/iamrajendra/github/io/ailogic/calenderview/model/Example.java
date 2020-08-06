
package iamrajendra.github.io.ailogic.calenderview.model;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example implements Serializable
{

    @SerializedName("GETCUSTOMERSCHEDULEDATA")
    @Expose
    private List<GETCUSTOMERSCHEDULEDATum> gETCUSTOMERSCHEDULEDATA = null;
    @SerializedName("AppointmentStatus")
    @Expose
    private List<Appointmentstatus> appointmentStatus = null;
    private final static long serialVersionUID = 8200205313288303179L;

    public List<GETCUSTOMERSCHEDULEDATum> getGETCUSTOMERSCHEDULEDATA() {
        return gETCUSTOMERSCHEDULEDATA;
    }

    public void setGETCUSTOMERSCHEDULEDATA(List<GETCUSTOMERSCHEDULEDATum> gETCUSTOMERSCHEDULEDATA) {
        this.gETCUSTOMERSCHEDULEDATA = gETCUSTOMERSCHEDULEDATA;
    }

    public List<Appointmentstatus> getAppointmentStatus() {
        return appointmentStatus;
    }

    public void setAppointmentStatus(List<Appointmentstatus> appointmentStatus) {
        this.appointmentStatus = appointmentStatus;
    }


}
