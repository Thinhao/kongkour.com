package com.chhurngsapplication.app.modules.sopheaone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowSopheaOneBinding
import com.chhurngsapplication.app.modules.sopheaone.`data`.model.SopheaOneRowModel
import kotlin.Int
import kotlin.collections.List

class SopheaOneAdapter(
  var list: List<SopheaOneRowModel>
) : RecyclerView.Adapter<SopheaOneAdapter.RowSopheaOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSopheaOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_sophea_one,parent,false)
    return RowSopheaOneVH(view)
  }

  override fun onBindViewHolder(holder: RowSopheaOneVH, position: Int) {
    val sopheaOneRowModel = SopheaOneRowModel()
    // TODO uncomment following line after integration with data source
    // val sopheaOneRowModel = list[position]
    holder.binding.sopheaOneRowModel = sopheaOneRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SopheaOneRowModel>) {
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
      item: SopheaOneRowModel
    ) {
    }
  }

  inner class RowSopheaOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowSopheaOneBinding = RowSopheaOneBinding.bind(itemView)
  }
}
