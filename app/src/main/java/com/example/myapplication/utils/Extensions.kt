package com.example.myapplication.utils

import com.example.myapplication.R
import com.example.myapplication.models.SubscriptionData

fun getSubscriptions():ArrayList<SubscriptionData>{
    var data  =ArrayList<SubscriptionData>()
    data.add(SubscriptionData("Online Training vip","39.99 € per month", R.drawable.fitness_icon_1,R.drawable.item_back_1,"#451A5A"))
    data.add(SubscriptionData("Online Training silver","19.99 € per month", R.drawable.fitness_icon_2,R.drawable.item_back_2,"#3D625B"))
    data.add(SubscriptionData("Training schedule only","9.99 € per month", R.drawable.fitness_icon_3,R.drawable.item_back_3,"#6A695F"))
    data.add(SubscriptionData("Healthy food program","9.99 € per month", R.drawable.fitness_icon_4,R.drawable.item_back_4,"#0C6AB5"))
    data.add(SubscriptionData("General information section for free","0.00 € per month", R.drawable.fitness_icon_1,R.drawable.item_back_5,"#9C2D23"))
    return data
}