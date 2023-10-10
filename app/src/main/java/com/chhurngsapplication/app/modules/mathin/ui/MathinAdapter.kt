package com.chhurngsapplication.app.modules.mathin.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowMathinBinding
import com.chhurngsapplication.app.modules.mathin.`data`.model.MathinRowModel
import kotlin.Int
import kotlin.collections.List

class MathinAdapter(
  var list: List<MathinRowModel>
) : RecyclerView.Adapter<MathinAdapter.RowMathinVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMathinVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_mathin,parent,false)
    return RowMathinVH(view)
  }

  override fun onBindViewHolder(holder: RowMathinVH, position: Int) {
    val mathinRowModel = MathinRowModel()
    // TODO uncomment following line after integration with data source
    // val mathinRowModel = list[position]
    holder.binding.mathinRowModel = mathinRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<MathinRowModel>) {
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
      item: MathinRowModel
    ) {
    }
  }

  inner class RowMathinVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowMathinBinding = RowMathinBinding.bind(itemView)
  }
}
