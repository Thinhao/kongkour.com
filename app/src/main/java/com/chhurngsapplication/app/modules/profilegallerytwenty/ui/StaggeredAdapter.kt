package com.chhurngsapplication.app.modules.profilegallerytwenty.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowStaggered6Binding
import com.chhurngsapplication.app.modules.profilegallerytwenty.`data`.model.Staggered6RowModel
import kotlin.Int
import kotlin.collections.List

class StaggeredAdapter(
  var list: List<Staggered6RowModel>
) : RecyclerView.Adapter<StaggeredAdapter.RowStaggered6VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowStaggered6VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_staggered6,parent,false)
    return RowStaggered6VH(view)
  }

  override fun onBindViewHolder(holder: RowStaggered6VH, position: Int) {
    val staggered6RowModel = Staggered6RowModel()
    // TODO uncomment following line after integration with data source
    // val staggered6RowModel = list[position]
    holder.binding.staggered6RowModel = staggered6RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Staggered6RowModel>) {
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
      item: Staggered6RowModel
    ) {
    }
  }

  inner class RowStaggered6VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowStaggered6Binding = RowStaggered6Binding.bind(itemView)
  }
}
