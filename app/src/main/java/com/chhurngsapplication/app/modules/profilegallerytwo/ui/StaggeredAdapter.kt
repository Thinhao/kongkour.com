package com.chhurngsapplication.app.modules.profilegallerytwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowStaggered10Binding
import com.chhurngsapplication.app.modules.profilegallerytwo.`data`.model.Staggered10RowModel
import kotlin.Int
import kotlin.collections.List

class StaggeredAdapter(
  var list: List<Staggered10RowModel>
) : RecyclerView.Adapter<StaggeredAdapter.RowStaggered10VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowStaggered10VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_staggered10,parent,false)
    return RowStaggered10VH(view)
  }

  override fun onBindViewHolder(holder: RowStaggered10VH, position: Int) {
    val staggered10RowModel = Staggered10RowModel()
    // TODO uncomment following line after integration with data source
    // val staggered10RowModel = list[position]
    holder.binding.staggered10RowModel = staggered10RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Staggered10RowModel>) {
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
      item: Staggered10RowModel
    ) {
    }
  }

  inner class RowStaggered10VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowStaggered10Binding = RowStaggered10Binding.bind(itemView)
  }
}
