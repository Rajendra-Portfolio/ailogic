package iamrajendra.github.io.ailogic.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import iamrajendra.github.io.ailogic.R;
import iamrajendra.github.io.ailogic.calenderview.model.GETCUSTOMERSCHEDULEDATum;

public class ScheduleAdapter extends RecyclerView.Adapter<ScheduleAdapter.ScheduleViewHolder> {
    private List<GETCUSTOMERSCHEDULEDATum> dataList;

    public ScheduleAdapter(List<GETCUSTOMERSCHEDULEDATum> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public ScheduleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.shedule_adapter,parent,false);
        return new ScheduleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ScheduleViewHolder holder, int position) {
        holder.venue.setText(dataList.get(position).getVenueName());
        holder.startDate.setText("Start Date"+dataList.get(position).getStartDateTime());
        holder.endDate.setText("End Date "+dataList.get(position).getEndDateTime());

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class ScheduleViewHolder extends RecyclerView.ViewHolder {
        private TextView venue,startDate,endDate;
        public ScheduleViewHolder(@NonNull View itemView) {
            super(itemView);
            venue = itemView.findViewById(R.id.venue_tv);
            startDate = itemView.findViewById(R.id.start_tv);
            endDate = itemView.findViewById(R.id.end_tv);
        }
    }
}
