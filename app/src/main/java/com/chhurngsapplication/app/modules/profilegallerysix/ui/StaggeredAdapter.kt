package com.chhurngsapplication.app.modules.profilegallerysix.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowStaggered19Binding
import com.chhurngsapplication.app.modules.profilegallerysix.`data`.model.Staggered19RowModel
import kotlin.Int
import kotlin.collections.List

class StaggeredAdapter(
  var list: List<Staggered19RowModel>
) : RecyclerView.Adapter<StaggeredAdapter.RowStaggered19VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowStaggered19VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_staggered19,parent,false)
    return RowStaggered19VH(view)
  }

  override fun onBindViewHolder(holder: RowStaggered19VH, position: Int) {
    val staggered19RowModel = Staggered19RowModel()
    // TODO uncomment following line after integration with data source
    // val staggered19RowModel = list[position]
    holder.binding.staggered19RowModel = staggered19RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Staggered19RowModel>) {
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
      item: Staggered19RowModel
    ) {
    }
  }

  inner class RowStaggered19VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowStaggered19Binding = RowStaggered19Binding.bind(itemView)
  }
}
