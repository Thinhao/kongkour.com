package com.chhurngsapplication.app.modules.profilegallerytwelve.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowStaggered14Binding
import com.chhurngsapplication.app.modules.profilegallerytwelve.`data`.model.Staggered14RowModel
import kotlin.Int
import kotlin.collections.List

class StaggeredAdapter(
  var list: List<Staggered14RowModel>
) : RecyclerView.Adapter<StaggeredAdapter.RowStaggered14VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowStaggered14VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_staggered14,parent,false)
    return RowStaggered14VH(view)
  }

  override fun onBindViewHolder(holder: RowStaggered14VH, position: Int) {
    val staggered14RowModel = Staggered14RowModel()
    // TODO uncomment following line after integration with data source
    // val staggered14RowModel = list[position]
    holder.binding.staggered14RowModel = staggered14RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Staggered14RowModel>) {
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
      item: Staggered14RowModel
    ) {
    }
  }

  inner class RowStaggered14VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowStaggered14Binding = RowStaggered14Binding.bind(itemView)
  }
}
