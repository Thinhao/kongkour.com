package com.chhurngsapplication.app.modules.profilegalleryten.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowStaggered21Binding
import com.chhurngsapplication.app.modules.profilegalleryten.`data`.model.Staggered21RowModel
import kotlin.Int
import kotlin.collections.List

class StaggeredAdapter(
  var list: List<Staggered21RowModel>
) : RecyclerView.Adapter<StaggeredAdapter.RowStaggered21VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowStaggered21VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_staggered21,parent,false)
    return RowStaggered21VH(view)
  }

  override fun onBindViewHolder(holder: RowStaggered21VH, position: Int) {
    val staggered21RowModel = Staggered21RowModel()
    // TODO uncomment following line after integration with data source
    // val staggered21RowModel = list[position]
    holder.binding.staggered21RowModel = staggered21RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Staggered21RowModel>) {
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
      item: Staggered21RowModel
    ) {
    }
  }

  inner class RowStaggered21VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowStaggered21Binding = RowStaggered21Binding.bind(itemView)
  }
}
