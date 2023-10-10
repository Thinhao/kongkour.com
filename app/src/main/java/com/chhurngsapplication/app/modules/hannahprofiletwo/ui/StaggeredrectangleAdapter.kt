package com.chhurngsapplication.app.modules.hannahprofiletwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowStaggeredrectangle1Binding
import com.chhurngsapplication.app.modules.hannahprofiletwo.`data`.model.Staggeredrectangle1RowModel
import kotlin.Int
import kotlin.collections.List

class StaggeredrectangleAdapter(
  var list: List<Staggeredrectangle1RowModel>
) : RecyclerView.Adapter<StaggeredrectangleAdapter.RowStaggeredrectangle1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowStaggeredrectangle1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_staggeredrectangle1,parent,false)
    return RowStaggeredrectangle1VH(view)
  }

  override fun onBindViewHolder(holder: RowStaggeredrectangle1VH, position: Int) {
    val staggeredrectangle1RowModel = Staggeredrectangle1RowModel()
    // TODO uncomment following line after integration with data source
    // val staggeredrectangle1RowModel = list[position]
    holder.binding.staggeredrectangle1RowModel = staggeredrectangle1RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Staggeredrectangle1RowModel>) {
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
      item: Staggeredrectangle1RowModel
    ) {
    }
  }

  inner class RowStaggeredrectangle1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowStaggeredrectangle1Binding = RowStaggeredrectangle1Binding.bind(itemView)
  }
}
