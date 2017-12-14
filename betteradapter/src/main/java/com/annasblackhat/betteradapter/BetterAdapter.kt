package com.annasblackhat.betteradapter

import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by ANNASBlackHat on 15/12/17.
 */
class BetterAdapter (@field:LayoutRes private val layoutId: Int,
                     private val listData: List<*>? = null,
                     private val variable: Int,
                     private val viewNoData: View? = null): RecyclerView.Adapter<BetterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): BetterViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(layoutId, parent, false)
        return BetterViewHolder(view)
    }

    override fun getItemCount(): Int {
        viewNoData?.let { it.visibility = if(listData?.isNotEmpty() == true) View.GONE else View.VISIBLE }
        return listData?.size ?: 0
    }

    override fun onBindViewHolder(holder: BetterViewHolder, position: Int) {
        listData?.apply {  holder.onBind(variable, listData[position]) }
    }

}