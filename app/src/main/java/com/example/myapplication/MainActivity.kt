package com.example.myapplication

import android.content.Intent
import android.content.res.Resources
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.TextView
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.adapters.SubscriptionAdapter
import com.example.myapplication.models.SubscriptionData
import com.example.myapplication.utils.getSubscriptions

class MainActivity : AppCompatActivity() {
    lateinit var data: ArrayList<SubscriptionData>
    private lateinit var contactsAdapter: SubscriptionAdapter

    lateinit var text: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.layout_subscription)




        data = ArrayList<SubscriptionData>()
        data = getSubscriptions()

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        contactsAdapter = SubscriptionAdapter(data)
        val layoutManager = LinearLayoutManager(applicationContext)
        recyclerView.layoutManager = layoutManager
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.adapter = contactsAdapter


        //       text = findViewById(R.id.price)
//        text.setOnClickListener {
//            var intent = Intent(this, SignUpActivity::class.java)
//            startActivity(intent)
//        }

    }
}