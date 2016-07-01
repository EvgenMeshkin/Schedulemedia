package evgen.epam.com.schedulemedia.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import evgen.epam.com.schedulemedia.R;

/**
 * Created by Yauheni_Meshkin on 6/30/2016.
 */
public class ScheduleAdapter extends RecyclerView.Adapter<ScheduleAdapter.ViewHolder> {

    private final ArrayList<String> mDataSet;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_item_schedule, parent, false);
        return new ViewHolder(v);
    }

    public ArrayList<String> getDataSet() {
        return mDataSet;
    }

    public ScheduleAdapter(ArrayList<String> dataSet) {
        mDataSet = dataSet;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        TextView textView = holder.getText();
        textView.setText("Test");

    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView getText() {
            return text;
        }

        private TextView text;

        public ViewHolder(View v) {
            super(v);
            text = (TextView) v.findViewById(R.id.text);
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                }
            });

        }
    }

}
