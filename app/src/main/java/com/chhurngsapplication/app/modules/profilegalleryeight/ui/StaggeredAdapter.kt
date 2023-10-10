package com.chhurngsapplication.app.modules.profilegalleryeight.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowStaggered2Binding
import com.chhurngsapplication.app.modules.profilegalleryeight.`data`.model.Staggered2RowModel
import kotlin.Int
import kotlin.collections.List

class StaggeredAdapter(
  var list: List<Staggered2RowModel>
) : RecyclerView.Adapter<StaggeredAdapter.RowStaggered2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowStaggered2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_staggered2,parent,false)
    return RowStaggered2VH(view)
  }

  override fun onBindViewHolder(holder: RowStaggered2VH, position: Int) {
    val staggered2RowModel = Staggered2RowModel()
    // TODO uncomment following line after integration with data source
    // val staggered2RowModel = list[position]
    holder.binding.staggered2RowModel = staggered2RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Staggered2RowModel>) {
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
      item: Staggered2RowModel
    ) {
    }
  }

  inner class RowStaggered2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowStaggered2Binding = RowStaggered2Binding.bind(itemView)
  }
}
