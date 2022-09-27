package com.cakiweb.easyscholar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ResultAdapter extends RecyclerView.Adapter<ResultAdapter.viewHolder> {
    ArrayList<ResultData> resultData;
    final Context context;

    public ResultAdapter(ArrayList<ResultData> resultData, Context context) {
        this.resultData =resultData;
        this.context = context;
    }

    @NonNull
    @Override
    public ResultAdapter.viewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.resultlist, parent, false);
        return new ResultAdapter.viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  ResultAdapter.viewHolder holder, int position) {
        final ResultData resultData1=resultData.get(position);
        int pos1=resultData.indexOf(resultData1);
        holder.className.setText(resultData1.getResultClass());
        holder.exam.setText(resultData1.getExamName());
        holder.view.setText(resultData1.getViewResult());

    }

    @Override
    public int getItemCount() {
        return resultData.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView className,exam,view;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            className=itemView.findViewById(R.id.result_class);
            exam=itemView.findViewById(R.id.result_Exam);
            view=itemView.findViewById(R.id.result_view);
        }
    }
}
