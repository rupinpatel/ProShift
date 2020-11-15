package com.proshiftteam.proshift.Activities

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.proshiftteam.proshift.R

class ApproveShiftRequestActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_approve_shift_requests)

        val context = this
        val bundle: Bundle? = intent.extras
        val tokenCode: String? = bundle?.getString("tokenCode")

        findViewById<ImageView>(R.id.backArrowButtonApproveShiftRequests).setOnClickListener {
            val intentToManagerControlsActivity = Intent(context, ManagerControlsActivity::class.java)
            intentToManagerControlsActivity.putExtra("tokenCode", tokenCode)
            startActivity(intentToManagerControlsActivity)
        }

    }
}