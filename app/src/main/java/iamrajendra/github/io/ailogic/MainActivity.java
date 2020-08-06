package iamrajendra.github.io.ailogic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

import org.json.JSONObject;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import iamrajendra.github.io.ailogic.calenderview.ClickOnCal;
import iamrajendra.github.io.ailogic.calenderview.CustomCalendarView;
import iamrajendra.github.io.ailogic.calenderview.model.Example;
import iamrajendra.github.io.ailogic.calenderview.model.GETCUSTOMERSCHEDULEDATum;
import iamrajendra.github.io.ailogic.rest.ApiClient;
import iamrajendra.github.io.ailogic.rest.ApiInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements CustomCalendarView.OnDateClickListener {
    private String TAG = MainActivity.class.getSimpleName();

    private LinearLayoutManager mLinearLayoutManager;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = findViewById(R.id.loading);

        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);
        apiService.appointmentByDate("GETCUSTOMERSCHEDULEDATA", "211682", "Customer", "07/01/2020")
                .enqueue(new Callback<Example>() {
                    @Override
                    public void onResponse(Call<Example> call, Response<Example> response) {
                        Log.i(TAG, "onResponse: " + response.body());
                        CustomerFactory.getCustomerFactory().parseData(response.body().getGETCUSTOMERSCHEDULEDATA());
                        intialCal(CustomerFactory.getCustomerFactory().getInitialDate(), CustomerFactory.getCustomerFactory().getFinalDate(), CustomerFactory.getCustomerFactory().getSortedList());
                        progressBar.setVisibility(View.GONE);

                    }

                    @Override
                    public void onFailure(Call<Example> call, Throwable t) {
                        Log.e(TAG, "onFailure: " + t);
                        progressBar.setVisibility(View.GONE);

                    }
                });

    }

    private void intialCal(Date initalDate, Date finalDate, List<GETCUSTOMERSCHEDULEDATum> scheduleList) {
        CustomCalendarView customCalendarView = (CustomCalendarView) findViewById(R.id.custom_calendar_view);
        customCalendarView.setDateClickListener(this);
        mLinearLayoutManager = new GridLayoutManager(this, 5);
        customCalendarView.setLayoutManger(mLinearLayoutManager);


        customCalendarView.setMinDate(initalDate);
        customCalendarView.setMaxDate(finalDate);
//        customCalendarView.setHighlightedDate(highlightCal.getTime());
        customCalendarView.setCusomterScheduleList(scheduleList);
        customCalendarView.generateCalendarView();
        customCalendarView.setClickOnCal(new ClickOnCal() {
            @Override
            public void onClick(CustomCalendarView.Selector selector) {
                Log.i(TAG, "onClick: " + selector.getTodayAppointment().size());
                if (selector.getTodayAppointment().size() > 0) {
                    Intent intent = new Intent(getApplicationContext(), ScheduleActivity.class);
                    Bundle bundle = new Bundle();

                    bundle.putSerializable("data", (Serializable) selector.getTodayAppointment());
                    intent.putExtras(bundle);
                    startActivity(intent);
                }

            }
        });

    }

    @Override
    public void onDateClicked(Date selectedDate) {

    }
}