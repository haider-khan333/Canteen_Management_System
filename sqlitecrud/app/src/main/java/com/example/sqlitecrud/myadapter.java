package com.example.sqlitecrud;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myadapter extends RecyclerView.Adapter<myadapter.myviewholder>
{
  ArrayList<model> dataholder;

    public myadapter(ArrayList<model> dataholder) {
        this.dataholder = dataholder;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow,parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position)
    {
        holder.tvOrderStatus.setText(dataholder.get(position).getOrderStatus());
        holder.tvUpdateStatus.setText(dataholder.get(position).getUpdateStatus());
        holder.tvDeliveryInfo.setText(dataholder.get(position).getDeliveryInfo());
        holder.tvChatWindow.setText(dataholder.get(position).getVisitChat());
        holder.tvDeliveryLocation.setText(dataholder.get(position).getDeliveryLocation());
        holder.tvCancelOrder.setText(dataholder.get(position).getCancelOrder());
        holder.tvDashboard.setText(dataholder.get(position).getDashBoard());
    }

    @Override
    public int getItemCount() {
        return dataholder.size();
    }

    class myviewholder extends RecyclerView.ViewHolder
    {
        TextView tvOrderStatus, tvUpdateStatus, tvDeliveryInfo, tvChatWindow, tvDeliveryLocation, tvCancelOrder, tvDashboard;
        public myviewholder(@NonNull View itemView)
        {
            super(itemView);
            tvOrderStatus=(TextView)itemView.findViewById(R.id.tvShowOrderStatus);
            tvUpdateStatus=(TextView)itemView.findViewById(R.id.tvShowUpdateStatus);
            tvDeliveryInfo=(TextView)itemView.findViewById(R.id.tvShowDeliveryInfo);
            tvChatWindow=(TextView)itemView.findViewById(R.id.tvShowVisitChat);
            tvDeliveryLocation=(TextView)itemView.findViewById(R.id.tvShowDeliveryLocation);
            tvCancelOrder=(TextView)itemView.findViewById(R.id.tvShowCancelOrder);
            tvDashboard=(TextView)itemView.findViewById(R.id.tvShowDashBoard);

        }
    }

}
