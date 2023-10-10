package com.chhurngsapplication.app.modules.profilegalleryseven.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowStaggered13Binding
import com.chhurngsapplication.app.modules.profilegalleryseven.`data`.model.Staggered13RowModel
import kotlin.Int
import kotlin.collections.List

class StaggeredAdapter(
  var list: List<Staggered13RowModel>
) : RecyclerView.Adapter<StaggeredAdapter.RowStaggered13VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowStaggered13VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_staggered13,parent,false)
    return RowStaggered13VH(view)
  }

  override fun onBindViewHolder(holder: RowStaggered13VH, position: Int) {
    val staggered13RowModel = Staggered13RowModel()
    // TODO uncomment following line after integration with data source
    // val staggered13RowModel = list[position]
    holder.binding.staggered13RowModel = staggered13RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Staggered13RowModel>) {
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
      item: Staggered13RowModel
    ) {
    }
  }

  inner class RowStaggered13VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowStaggered13Binding = RowStaggered13Binding.bind(itemView)
  }
}
