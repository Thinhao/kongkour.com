package com.chhurngsapplication.app.modules.sophea.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowSopheaBinding
import com.chhurngsapplication.app.modules.sophea.`data`.model.SopheaRowModel
import kotlin.Int
import kotlin.collections.List

class SopheaAdapter(
  var list: List<SopheaRowModel>
) : RecyclerView.Adapter<SopheaAdapter.RowSopheaVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSopheaVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_sophea,parent,false)
    return RowSopheaVH(view)
  }

  override fun onBindViewHolder(holder: RowSopheaVH, position: Int) {
    val sopheaRowModel = SopheaRowModel()
    // TODO uncomment following line after integration with data source
    // val sopheaRowModel = list[position]
    holder.binding.sopheaRowModel = sopheaRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SopheaRowModel>) {
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
      item: SopheaRowModel
    ) {
    }
  }

  inner class RowSopheaVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowSopheaBinding = RowSopheaBinding.bind(itemView)
  }
}
