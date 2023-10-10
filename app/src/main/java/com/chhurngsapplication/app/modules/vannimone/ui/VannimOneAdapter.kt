package com.chhurngsapplication.app.modules.vannimone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowVannimOneBinding
import com.chhurngsapplication.app.modules.vannimone.`data`.model.VannimOneRowModel
import kotlin.Int
import kotlin.collections.List

class VannimOneAdapter(
  var list: List<VannimOneRowModel>
) : RecyclerView.Adapter<VannimOneAdapter.RowVannimOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowVannimOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_vannim_one,parent,false)
    return RowVannimOneVH(view)
  }

  override fun onBindViewHolder(holder: RowVannimOneVH, position: Int) {
    val vannimOneRowModel = VannimOneRowModel()
    // TODO uncomment following line after integration with data source
    // val vannimOneRowModel = list[position]
    holder.binding.vannimOneRowModel = vannimOneRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<VannimOneRowModel>) {
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
      item: VannimOneRowModel
    ) {
    }
  }

  inner class RowVannimOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowVannimOneBinding = RowVannimOneBinding.bind(itemView)
  }
}
