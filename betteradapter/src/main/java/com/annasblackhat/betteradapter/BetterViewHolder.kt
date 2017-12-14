package com.annasblackhat.betteradapter

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.view.View

/**
 * Created by ANNASBlackHat on 15/12/17.
 */
class BetterViewHolder (itemView: View?) : RecyclerView.ViewHolder(itemView) {

    private val binding: ViewDataBinding = DataBindingUtil.bind(itemView)

    fun onBind(variable: Int, value: Any?){
        value?.let {
            binding.setVariable(variable, value)
            binding.executePendingBindings()
        }
    }
}