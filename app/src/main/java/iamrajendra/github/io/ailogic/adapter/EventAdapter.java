package iamrajendra.github.io.ailogic.adapter;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import iamrajendra.github.io.ailogic.R;
import iamrajendra.github.io.ailogic.calenderview.model.GETCUSTOMERSCHEDULEDATum;

public class EventAdapter  extends RecyclerView.Adapter {
    private List<GETCUSTOMERSCHEDULEDATum> events;

    public EventAdapter(List<GETCUSTOMERSCHEDULEDATum> events) {
        this.events = events;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view   = LayoutInflater.from(parent.getContext()).inflate(R.layout.events_adapter,parent,false);
        return new EventViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        EventViewHolder eventViewHolder  = (EventViewHolder) holder;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            int modeOf4  = position%4;

            switch (modeOf4){
                case 0:
                    eventViewHolder.eventCircle.setBackgroundTintList(holder.itemView.getResources().getColorStateList(R.color.red_500));

                    break;
                case 1:
                    eventViewHolder.eventCircle.setBackgroundTintList(holder.itemView.getResources().getColorStateList(R.color.yellow_500));

                    break;
                case 2:
                    eventViewHolder.eventCircle.setBackgroundTintList(holder.itemView.getResources().getColorStateList(R.color.orange_400));

                    break;
                case 3:
                    eventViewHolder.eventCircle.setBackgroundTintList(holder.itemView.getResources().getColorStateList(R.color.green_500));

                    break;
            }
        }


    }

    @Override
    public int getItemCount() {
        return events.size();
    }
}
