package com.chhurngsapplication.app.modules.profilegallerynine.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowStaggered8Binding
import com.chhurngsapplication.app.modules.profilegallerynine.`data`.model.Staggered8RowModel
import kotlin.Int
import kotlin.collections.List

class StaggeredAdapter(
  var list: List<Staggered8RowModel>
) : RecyclerView.Adapter<StaggeredAdapter.RowStaggered8VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowStaggered8VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_staggered8,parent,false)
    return RowStaggered8VH(view)
  }

  override fun onBindViewHolder(holder: RowStaggered8VH, position: Int) {
    val staggered8RowModel = Staggered8RowModel()
    // TODO uncomment following line after integration with data source
    // val staggered8RowModel = list[position]
    holder.binding.staggered8RowModel = staggered8RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Staggered8RowModel>) {
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
      item: Staggered8RowModel
    ) {
    }
  }

  inner class RowStaggered8VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowStaggered8Binding = RowStaggered8Binding.bind(itemView)
  }
}
