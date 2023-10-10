package com.chhurngsapplication.app.modules.thearithone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowThearithOneBinding
import com.chhurngsapplication.app.modules.thearithone.`data`.model.ThearithOneRowModel
import kotlin.Int
import kotlin.collections.List

class ThearithOneAdapter(
  var list: List<ThearithOneRowModel>
) : RecyclerView.Adapter<ThearithOneAdapter.RowThearithOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowThearithOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_thearith_one,parent,false)
    return RowThearithOneVH(view)
  }

  override fun onBindViewHolder(holder: RowThearithOneVH, position: Int) {
    val thearithOneRowModel = ThearithOneRowModel()
    // TODO uncomment following line after integration with data source
    // val thearithOneRowModel = list[position]
    holder.binding.thearithOneRowModel = thearithOneRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ThearithOneRowModel>) {
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
      item: ThearithOneRowModel
    ) {
    }
  }

  inner class RowThearithOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowThearithOneBinding = RowThearithOneBinding.bind(itemView)
  }
}
