package iamrajendra.github.io.ailogic.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

//    public static final String BASE_URL = "https://lsp.totallanguage.com/Appointment/GetFormData?methodType=GETCUSTOMERSCHEDULEDATA&Customer=211682&UType=Customer&Date=07/01/2020";
    public static final String BASE_URL = "https://lsp.totallanguage.com/";
    private static Retrofit retrofit = null;


    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }



}
