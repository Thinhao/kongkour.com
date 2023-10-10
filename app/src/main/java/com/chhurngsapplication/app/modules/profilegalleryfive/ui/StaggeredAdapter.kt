package com.chhurngsapplication.app.modules.profilegalleryfive.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowStaggered5Binding
import com.chhurngsapplication.app.modules.profilegalleryfive.`data`.model.Staggered5RowModel
import kotlin.Int
import kotlin.collections.List

class StaggeredAdapter(
  var list: List<Staggered5RowModel>
) : RecyclerView.Adapter<StaggeredAdapter.RowStaggered5VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowStaggered5VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_staggered5,parent,false)
    return RowStaggered5VH(view)
  }

  override fun onBindViewHolder(holder: RowStaggered5VH, position: Int) {
    val staggered5RowModel = Staggered5RowModel()
    // TODO uncomment following line after integration with data source
    // val staggered5RowModel = list[position]
    holder.binding.staggered5RowModel = staggered5RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Staggered5RowModel>) {
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
      item: Staggered5RowModel
    ) {
    }
  }

  inner class RowStaggered5VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowStaggered5Binding = RowStaggered5Binding.bind(itemView)
  }
}
