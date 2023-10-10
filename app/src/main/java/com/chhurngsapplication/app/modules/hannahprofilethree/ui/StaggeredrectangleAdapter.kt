package com.chhurngsapplication.app.modules.hannahprofilethree.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowStaggeredrectangleBinding
import com.chhurngsapplication.app.modules.hannahprofilethree.`data`.model.StaggeredrectangleRowModel
import kotlin.Int
import kotlin.collections.List

class StaggeredrectangleAdapter(
  var list: List<StaggeredrectangleRowModel>
) : RecyclerView.Adapter<StaggeredrectangleAdapter.RowStaggeredrectangleVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowStaggeredrectangleVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_staggeredrectangle,parent,false)
    return RowStaggeredrectangleVH(view)
  }

  override fun onBindViewHolder(holder: RowStaggeredrectangleVH, position: Int) {
    val staggeredrectangleRowModel = StaggeredrectangleRowModel()
    // TODO uncomment following line after integration with data source
    // val staggeredrectangleRowModel = list[position]
    holder.binding.staggeredrectangleRowModel = staggeredrectangleRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<StaggeredrectangleRowModel>) {
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
      item: StaggeredrectangleRowModel
    ) {
    }
  }

  inner class RowStaggeredrectangleVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowStaggeredrectangleBinding = RowStaggeredrectangleBinding.bind(itemView)
  }
}
