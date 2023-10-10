package com.chhurngsapplication.app.modules.hannahprofileone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowStaggeredrectangle2Binding
import com.chhurngsapplication.app.modules.hannahprofileone.`data`.model.Staggeredrectangle2RowModel
import kotlin.Int
import kotlin.collections.List

class StaggeredrectangleAdapter(
  var list: List<Staggeredrectangle2RowModel>
) : RecyclerView.Adapter<StaggeredrectangleAdapter.RowStaggeredrectangle2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowStaggeredrectangle2VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_staggeredrectangle2,parent,false)
    return RowStaggeredrectangle2VH(view)
  }

  override fun onBindViewHolder(holder: RowStaggeredrectangle2VH, position: Int) {
    val staggeredrectangle2RowModel = Staggeredrectangle2RowModel()
    // TODO uncomment following line after integration with data source
    // val staggeredrectangle2RowModel = list[position]
    holder.binding.staggeredrectangle2RowModel = staggeredrectangle2RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Staggeredrectangle2RowModel>) {
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
      item: Staggeredrectangle2RowModel
    ) {
    }
  }

  inner class RowStaggeredrectangle2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowStaggeredrectangle2Binding = RowStaggeredrectangle2Binding.bind(itemView)
  }
}
