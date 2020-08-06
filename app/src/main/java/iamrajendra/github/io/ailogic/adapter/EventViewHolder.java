package iamrajendra.github.io.ailogic.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import iamrajendra.github.io.ailogic.R;

public class EventViewHolder extends RecyclerView.ViewHolder {
    public TextView eventCircle;
    public EventViewHolder(@NonNull View itemView) {
        super(itemView);
        eventCircle = itemView.findViewById(R.id.event_circle_tv);
    }
}
