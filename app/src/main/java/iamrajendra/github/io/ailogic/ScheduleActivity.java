package iamrajendra.github.io.ailogic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

import iamrajendra.github.io.ailogic.adapter.ScheduleAdapter;
import iamrajendra.github.io.ailogic.calenderview.model.GETCUSTOMERSCHEDULEDATum;

public class ScheduleActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        recyclerView = findViewById(R.id.scheduleList);
        Bundle bundle = getIntent().getExtras();
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                LinearLayoutManager.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);

        recyclerView.setAdapter(new ScheduleAdapter((List<GETCUSTOMERSCHEDULEDATum>) getIntent().getExtras().getSerializable("data")));

    }
}