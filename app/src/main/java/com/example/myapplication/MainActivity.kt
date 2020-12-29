package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.cardview.widget.CardView
import com.example.myapplication.adapters.SubscriptionAdapter
import com.example.myapplication.models.SubscriptionData


class MainActivity : AppCompatActivity() {

    lateinit var card_1: CardView
    lateinit var datePicker: DatePicker

    lateinit var card_2: CardView
    lateinit var height_status: LinearLayout

    lateinit var card_3: CardView
    lateinit var weight_status: LinearLayout

    var birthday = false
    var weight = false
    var height = false


    lateinit var data: ArrayList<SubscriptionData>
    private lateinit var contactsAdapter: SubscriptionAdapter

    lateinit var text: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


//        window.setFlags(
//            WindowManager.LayoutParams.FLAG_FULLSCREEN,
//            WindowManager.LayoutParams.FLAG_FULLSCREEN
//        )
        setContentView(R.layout.sign_up_step_2)
        initViews()
        setOnClicks()

//For layout_subscription
//        data = ArrayList<SubscriptionData>()
//        data = getSubscriptions()
//
//        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
//        contactsAdapter = SubscriptionAdapter(data)
//        val layoutManager = LinearLayoutManager(applicationContext)
//        recyclerView.layoutManager = layoutManager
//        recyclerView.itemAnimator = DefaultItemAnimator()
//        recyclerView.adapter = contactsAdapter


        //       text = findViewById(R.id.price)
//        text.setOnClickListener {
//            var intent = Intent(this, SignUpActivity::class.java)
//            startActivity(intent)
//        }

    }

    fun initViews() {
        card_1 = findViewById(R.id.card_1)
        datePicker = findViewById(R.id.datePicker)


        card_2 = findViewById(R.id.card_2)
        height_status = findViewById(R.id.height_status)

        card_3 = findViewById(R.id.card_3)
        weight_status = findViewById(R.id.weight_status)
    }

    fun setOnClicks() {
        card_1.setOnClickListener {
            if (birthday) {
                datePicker.visibility = View.GONE
                birthday = false
            } else {
                birthday = true
                datePicker.visibility = View.VISIBLE

                height_status.visibility = View.GONE
                weight_status.visibility = View.GONE
            }

        }

        card_2.setOnClickListener {
            if (height) {
                height = false
                height_status.visibility = View.GONE
            } else {
                height = true
                height_status.visibility = View.VISIBLE

                weight_status.visibility = View.GONE
                datePicker.visibility = View.GONE

            }

        }


        card_3.setOnClickListener {
            if (weight) {
                weight = false
                weight_status.visibility = View.GONE
            } else {
                weight = true
                weight_status.visibility = View.VISIBLE

                height_status.visibility = View.GONE
                datePicker.visibility = View.GONE

            }

        }


    }
}
