package com.chhurngsapplication.app.modules.reione.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowReiOneBinding
import com.chhurngsapplication.app.modules.reione.`data`.model.ReiOneRowModel
import kotlin.Int
import kotlin.collections.List

class ReiOneAdapter(
  var list: List<ReiOneRowModel>
) : RecyclerView.Adapter<ReiOneAdapter.RowReiOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowReiOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_rei_one,parent,false)
    return RowReiOneVH(view)
  }

  override fun onBindViewHolder(holder: RowReiOneVH, position: Int) {
    val reiOneRowModel = ReiOneRowModel()
    // TODO uncomment following line after integration with data source
    // val reiOneRowModel = list[position]
    holder.binding.reiOneRowModel = reiOneRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ReiOneRowModel>) {
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
      item: ReiOneRowModel
    ) {
    }
  }

  inner class RowReiOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowReiOneBinding = RowReiOneBinding.bind(itemView)
  }
}
