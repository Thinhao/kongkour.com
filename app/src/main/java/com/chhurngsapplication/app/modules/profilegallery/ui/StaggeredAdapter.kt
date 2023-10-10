package com.chhurngsapplication.app.modules.profilegallery.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowStaggered1Binding
import com.chhurngsapplication.app.modules.profilegallery.`data`.model.Staggered1RowModel
import kotlin.Int
import kotlin.collections.List

class StaggeredAdapter(
  var list: List<Staggered1RowModel>
) : RecyclerView.Adapter<StaggeredAdapter.RowStaggered1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowStaggered1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_staggered1,parent,false)
    return RowStaggered1VH(view)
  }

  override fun onBindViewHolder(holder: RowStaggered1VH, position: Int) {
    val staggered1RowModel = Staggered1RowModel()
    // TODO uncomment following line after integration with data source
    // val staggered1RowModel = list[position]
    holder.binding.staggered1RowModel = staggered1RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Staggered1RowModel>) {
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
      item: Staggered1RowModel
    ) {
    }
  }

  inner class RowStaggered1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowStaggered1Binding = RowStaggered1Binding.bind(itemView)
  }
}
