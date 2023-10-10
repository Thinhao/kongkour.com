package com.chhurngsapplication.app.modules.profilegalleryfour.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowStaggered15Binding
import com.chhurngsapplication.app.modules.profilegalleryfour.`data`.model.Staggered15RowModel
import kotlin.Int
import kotlin.collections.List

class StaggeredAdapter(
  var list: List<Staggered15RowModel>
) : RecyclerView.Adapter<StaggeredAdapter.RowStaggered15VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowStaggered15VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_staggered15,parent,false)
    return RowStaggered15VH(view)
  }

  override fun onBindViewHolder(holder: RowStaggered15VH, position: Int) {
    val staggered15RowModel = Staggered15RowModel()
    // TODO uncomment following line after integration with data source
    // val staggered15RowModel = list[position]
    holder.binding.staggered15RowModel = staggered15RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Staggered15RowModel>) {
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
      item: Staggered15RowModel
    ) {
    }
  }

  inner class RowStaggered15VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowStaggered15Binding = RowStaggered15Binding.bind(itemView)
  }
}
