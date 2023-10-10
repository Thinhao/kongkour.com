package com.chhurngsapplication.app.modules.profilegallerytwentythree.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowStaggeredBinding
import com.chhurngsapplication.app.modules.profilegallerytwentythree.`data`.model.StaggeredRowModel
import kotlin.Int
import kotlin.collections.List

class StaggeredAdapter(
  var list: List<StaggeredRowModel>
) : RecyclerView.Adapter<StaggeredAdapter.RowStaggeredVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowStaggeredVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_staggered,parent,false)
    return RowStaggeredVH(view)
  }

  override fun onBindViewHolder(holder: RowStaggeredVH, position: Int) {
    val staggeredRowModel = StaggeredRowModel()
    // TODO uncomment following line after integration with data source
    // val staggeredRowModel = list[position]
    holder.binding.staggeredRowModel = staggeredRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<StaggeredRowModel>) {
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
      item: StaggeredRowModel
    ) {
    }
  }

  inner class RowStaggeredVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowStaggeredBinding = RowStaggeredBinding.bind(itemView)
  }
}
