package com.chhurngsapplication.app.modules.nathan.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowNathanBinding
import com.chhurngsapplication.app.modules.nathan.`data`.model.NathanRowModel
import kotlin.Int
import kotlin.collections.List

class NathanAdapter(
  var list: List<NathanRowModel>
) : RecyclerView.Adapter<NathanAdapter.RowNathanVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowNathanVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_nathan,parent,false)
    return RowNathanVH(view)
  }

  override fun onBindViewHolder(holder: RowNathanVH, position: Int) {
    val nathanRowModel = NathanRowModel()
    // TODO uncomment following line after integration with data source
    // val nathanRowModel = list[position]
    holder.binding.nathanRowModel = nathanRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<NathanRowModel>) {
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
      item: NathanRowModel
    ) {
    }
  }

  inner class RowNathanVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowNathanBinding = RowNathanBinding.bind(itemView)
  }
}
