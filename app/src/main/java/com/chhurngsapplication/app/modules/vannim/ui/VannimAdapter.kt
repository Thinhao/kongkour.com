package com.chhurngsapplication.app.modules.vannim.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowVannimBinding
import com.chhurngsapplication.app.modules.vannim.`data`.model.VannimRowModel
import kotlin.Int
import kotlin.collections.List

class VannimAdapter(
  var list: List<VannimRowModel>
) : RecyclerView.Adapter<VannimAdapter.RowVannimVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowVannimVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_vannim,parent,false)
    return RowVannimVH(view)
  }

  override fun onBindViewHolder(holder: RowVannimVH, position: Int) {
    val vannimRowModel = VannimRowModel()
    // TODO uncomment following line after integration with data source
    // val vannimRowModel = list[position]
    holder.binding.vannimRowModel = vannimRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<VannimRowModel>) {
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
      item: VannimRowModel
    ) {
    }
  }

  inner class RowVannimVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowVannimBinding = RowVannimBinding.bind(itemView)
  }
}
