package com.chhurngsapplication.app.modules.profilegallerythree.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowStaggered23Binding
import com.chhurngsapplication.app.modules.profilegallerythree.`data`.model.Staggered23RowModel
import kotlin.Int
import kotlin.collections.List

class StaggeredAdapter(
  var list: List<Staggered23RowModel>
) : RecyclerView.Adapter<StaggeredAdapter.RowStaggered23VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowStaggered23VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_staggered23,parent,false)
    return RowStaggered23VH(view)
  }

  override fun onBindViewHolder(holder: RowStaggered23VH, position: Int) {
    val staggered23RowModel = Staggered23RowModel()
    // TODO uncomment following line after integration with data source
    // val staggered23RowModel = list[position]
    holder.binding.staggered23RowModel = staggered23RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Staggered23RowModel>) {
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
      item: Staggered23RowModel
    ) {
    }
  }

  inner class RowStaggered23VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowStaggered23Binding = RowStaggered23Binding.bind(itemView)
  }
}
