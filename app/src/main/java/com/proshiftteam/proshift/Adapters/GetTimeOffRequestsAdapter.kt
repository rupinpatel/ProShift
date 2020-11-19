package com.proshiftteam.proshift.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.proshiftteam.proshift.DataFiles.GetTimeOffRequestsObject
import com.proshiftteam.proshift.R
import kotlinx.android.synthetic.main.card_item_get_time_off_requests.view.*

class GetTimeOffRequestsAdapter(val tokenCode: String, private val timeOffRequestsList: List<GetTimeOffRequestsObject>) : RecyclerView.Adapter<GetTimeOffRequestsAdapter.ShowTimeOffRequestsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GetTimeOffRequestsAdapter.ShowTimeOffRequestsViewHolder {
        val timeOffRequestView = LayoutInflater.from(parent.context).inflate(R.layout.card_item_get_time_off_requests, parent, false)
        return ShowTimeOffRequestsViewHolder(timeOffRequestView)
    }

    override fun getItemCount(): Int {
        return timeOffRequestsList.size
    }

    override fun onBindViewHolder(holder: GetTimeOffRequestsAdapter.ShowTimeOffRequestsViewHolder, position: Int) {
        holder.company.text = timeOffRequestsList.get(position).company.toString()
        holder.employee_name.text = timeOffRequestsList.get(position).employee_name
        holder.start_date.text = timeOffRequestsList.get(position).start_date
        holder.end_date.text = timeOffRequestsList.get(position).end_date
        holder.time_start.text = timeOffRequestsList.get(position).time_start
        holder.time_end.text = timeOffRequestsList.get(position).time_end

        holder.itemView.card_get_time_off_requests_approve_button.setOnClickListener {v ->
            // Code for approving shifts
        }
        holder.itemView.card_get_time_off_requests_deny_button.setOnClickListener {v ->
            // Code for denying shifts
        }
    }

    class ShowTimeOffRequestsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val company: TextView = itemView.findViewById(R.id.card_get_time_off_requests_company_id)
        val employee_name: TextView = itemView.findViewById(R.id.card_get_time_off_requests_employee_name)
        val start_date: TextView = itemView.findViewById(R.id.card_get_time_off_requests_start_date)
        val end_date: TextView = itemView.findViewById(R.id.card_get_time_off_requests_end_date)
        val time_start: TextView = itemView.findViewById(R.id.card_get_time_off_requests_start_time)
        val time_end: TextView = itemView.findViewById(R.id.card_get_time_off_requests_end_time)
    }
}