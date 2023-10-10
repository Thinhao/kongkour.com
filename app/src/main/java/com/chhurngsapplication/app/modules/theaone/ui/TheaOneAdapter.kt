package com.chhurngsapplication.app.modules.theaone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowTheaOneBinding
import com.chhurngsapplication.app.modules.theaone.`data`.model.TheaOneRowModel
import kotlin.Int
import kotlin.collections.List

class TheaOneAdapter(
  var list: List<TheaOneRowModel>
) : RecyclerView.Adapter<TheaOneAdapter.RowTheaOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowTheaOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_thea_one,parent,false)
    return RowTheaOneVH(view)
  }

  override fun onBindViewHolder(holder: RowTheaOneVH, position: Int) {
    val theaOneRowModel = TheaOneRowModel()
    // TODO uncomment following line after integration with data source
    // val theaOneRowModel = list[position]
    holder.binding.theaOneRowModel = theaOneRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<TheaOneRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: TheaOneRowModel
    ) {
    }
  }

  inner class RowTheaOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowTheaOneBinding = RowTheaOneBinding.bind(itemView)
  }
}
