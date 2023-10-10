package com.chhurngsapplication.app.modules.mathinone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowMathinOneBinding
import com.chhurngsapplication.app.modules.mathinone.`data`.model.MathinOneRowModel
import kotlin.Int
import kotlin.collections.List

class MathinOneAdapter(
  var list: List<MathinOneRowModel>
) : RecyclerView.Adapter<MathinOneAdapter.RowMathinOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMathinOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_mathin_one,parent,false)
    return RowMathinOneVH(view)
  }

  override fun onBindViewHolder(holder: RowMathinOneVH, position: Int) {
    val mathinOneRowModel = MathinOneRowModel()
    // TODO uncomment following line after integration with data source
    // val mathinOneRowModel = list[position]
    holder.binding.mathinOneRowModel = mathinOneRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<MathinOneRowModel>) {
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
      item: MathinOneRowModel
    ) {
    }
  }

  inner class RowMathinOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowMathinOneBinding = RowMathinOneBinding.bind(itemView)
  }
}
