package com.chhurngsapplication.app.modules.rei.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowReiBinding
import com.chhurngsapplication.app.modules.rei.`data`.model.ReiRowModel
import kotlin.Int
import kotlin.collections.List

class ReiAdapter(
  var list: List<ReiRowModel>
) : RecyclerView.Adapter<ReiAdapter.RowReiVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowReiVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_rei,parent,false)
    return RowReiVH(view)
  }

  override fun onBindViewHolder(holder: RowReiVH, position: Int) {
    val reiRowModel = ReiRowModel()
    // TODO uncomment following line after integration with data source
    // val reiRowModel = list[position]
    holder.binding.reiRowModel = reiRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ReiRowModel>) {
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
      item: ReiRowModel
    ) {
    }
  }

  inner class RowReiVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowReiBinding = RowReiBinding.bind(itemView)
  }
}
