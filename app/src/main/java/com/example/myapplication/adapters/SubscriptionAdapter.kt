package com.example.myapplication.adapters

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.models.SubscriptionData

internal class SubscriptionAdapter (private var subscriptions: ArrayList<SubscriptionData>) :
    RecyclerView.Adapter<SubscriptionAdapter.MyViewHolder>() {

    private var listener: ((Int) -> Unit)? = null

    internal inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var text: TextView = view.findViewById(R.id.subscription_text)
        var price_text: TextView = view.findViewById(R.id.price)
        var image: ImageView = view.findViewById(R.id.image_item_subscription)
        var constraint:ConstraintLayout = view.findViewById(R.id.subscription_item)
    }
    @NonNull
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_subscription, parent, false)
        return MyViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val subscription = subscriptions[position]
        holder.text.text = subscription.subscription_text
        holder.price_text.text = subscription.price
        holder.image.setBackgroundResource(subscription.imgUrl)
        holder.constraint.setBackgroundResource(subscription.background)

        holder.price_text.setTextColor(Color.parseColor(subscription.textColor))
        holder.text.setTextColor(Color.parseColor(subscription.textColor))
        holder.constraint.setOnClickListener {
            listener?.invoke(position)
        }

    }
    override fun getItemCount(): Int {
        return subscriptions.size
    }


    fun setOnClickedListener(f: ((Int) -> Unit)?) {
        listener = f
    }
}