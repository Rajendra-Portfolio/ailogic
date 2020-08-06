package iamrajendra.github.io.ailogic.rest;

import org.json.JSONObject;

import iamrajendra.github.io.ailogic.calenderview.model.Example;
import okhttp3.Response;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("Appointment/GetFormData")
    public Call<Example> appointmentByDate(@Query("methodType") String methodType, @Query("Customer") String customer, @Query("UType") String type, @Query("Date")String  date);

}
