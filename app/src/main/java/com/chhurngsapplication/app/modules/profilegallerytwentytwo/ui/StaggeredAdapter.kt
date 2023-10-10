package com.chhurngsapplication.app.modules.profilegallerytwentytwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowStaggered7Binding
import com.chhurngsapplication.app.modules.profilegallerytwentytwo.`data`.model.Staggered7RowModel
import kotlin.Int
import kotlin.collections.List

class StaggeredAdapter(
  var list: List<Staggered7RowModel>
) : RecyclerView.Adapter<StaggeredAdapter.RowStaggered7VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowStaggered7VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_staggered7,parent,false)
    return RowStaggered7VH(view)
  }

  override fun onBindViewHolder(holder: RowStaggered7VH, position: Int) {
    val staggered7RowModel = Staggered7RowModel()
    // TODO uncomment following line after integration with data source
    // val staggered7RowModel = list[position]
    holder.binding.staggered7RowModel = staggered7RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Staggered7RowModel>) {
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
      item: Staggered7RowModel
    ) {
    }
  }

  inner class RowStaggered7VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowStaggered7Binding = RowStaggered7Binding.bind(itemView)
  }
}
