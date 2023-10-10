package com.chhurngsapplication.app.modules.profilegallerytwentyone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowStaggered20Binding
import com.chhurngsapplication.app.modules.profilegallerytwentyone.`data`.model.Staggered20RowModel
import kotlin.Int
import kotlin.collections.List

class StaggeredAdapter(
  var list: List<Staggered20RowModel>
) : RecyclerView.Adapter<StaggeredAdapter.RowStaggered20VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowStaggered20VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_staggered20,parent,false)
    return RowStaggered20VH(view)
  }

  override fun onBindViewHolder(holder: RowStaggered20VH, position: Int) {
    val staggered20RowModel = Staggered20RowModel()
    // TODO uncomment following line after integration with data source
    // val staggered20RowModel = list[position]
    holder.binding.staggered20RowModel = staggered20RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Staggered20RowModel>) {
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
      item: Staggered20RowModel
    ) {
    }
  }

  inner class RowStaggered20VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowStaggered20Binding = RowStaggered20Binding.bind(itemView)
  }
}
