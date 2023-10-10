package com.chhurngsapplication.app.modules.profilegalleryeleven.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowStaggered17Binding
import com.chhurngsapplication.app.modules.profilegalleryeleven.`data`.model.Staggered17RowModel
import kotlin.Int
import kotlin.collections.List

class StaggeredAdapter(
  var list: List<Staggered17RowModel>
) : RecyclerView.Adapter<StaggeredAdapter.RowStaggered17VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowStaggered17VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_staggered17,parent,false)
    return RowStaggered17VH(view)
  }

  override fun onBindViewHolder(holder: RowStaggered17VH, position: Int) {
    val staggered17RowModel = Staggered17RowModel()
    // TODO uncomment following line after integration with data source
    // val staggered17RowModel = list[position]
    holder.binding.staggered17RowModel = staggered17RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Staggered17RowModel>) {
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
      item: Staggered17RowModel
    ) {
    }
  }

  inner class RowStaggered17VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowStaggered17Binding = RowStaggered17Binding.bind(itemView)
  }
}
