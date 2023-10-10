package com.chhurngsapplication.app.modules.thearith.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowThearithBinding
import com.chhurngsapplication.app.modules.thearith.`data`.model.ThearithRowModel
import kotlin.Int
import kotlin.collections.List

class ThearithAdapter(
  var list: List<ThearithRowModel>
) : RecyclerView.Adapter<ThearithAdapter.RowThearithVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowThearithVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_thearith,parent,false)
    return RowThearithVH(view)
  }

  override fun onBindViewHolder(holder: RowThearithVH, position: Int) {
    val thearithRowModel = ThearithRowModel()
    // TODO uncomment following line after integration with data source
    // val thearithRowModel = list[position]
    holder.binding.thearithRowModel = thearithRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ThearithRowModel>) {
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
      item: ThearithRowModel
    ) {
    }
  }

  inner class RowThearithVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowThearithBinding = RowThearithBinding.bind(itemView)
  }
}
