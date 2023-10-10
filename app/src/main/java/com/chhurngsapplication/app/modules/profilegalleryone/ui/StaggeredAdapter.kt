package com.chhurngsapplication.app.modules.profilegalleryone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowStaggered22Binding
import com.chhurngsapplication.app.modules.profilegalleryone.`data`.model.Staggered22RowModel
import kotlin.Int
import kotlin.collections.List

class StaggeredAdapter(
  var list: List<Staggered22RowModel>
) : RecyclerView.Adapter<StaggeredAdapter.RowStaggered22VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowStaggered22VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_staggered22,parent,false)
    return RowStaggered22VH(view)
  }

  override fun onBindViewHolder(holder: RowStaggered22VH, position: Int) {
    val staggered22RowModel = Staggered22RowModel()
    // TODO uncomment following line after integration with data source
    // val staggered22RowModel = list[position]
    holder.binding.staggered22RowModel = staggered22RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Staggered22RowModel>) {
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
      item: Staggered22RowModel
    ) {
    }
  }

  inner class RowStaggered22VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowStaggered22Binding = RowStaggered22Binding.bind(itemView)
  }
}
