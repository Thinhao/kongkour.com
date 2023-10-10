package com.chhurngsapplication.app.modules.layhouy.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowLayhouyBinding
import com.chhurngsapplication.app.modules.layhouy.`data`.model.LayhouyRowModel
import kotlin.Int
import kotlin.collections.List

class LayhouyAdapter(
  var list: List<LayhouyRowModel>
) : RecyclerView.Adapter<LayhouyAdapter.RowLayhouyVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowLayhouyVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_layhouy,parent,false)
    return RowLayhouyVH(view)
  }

  override fun onBindViewHolder(holder: RowLayhouyVH, position: Int) {
    val layhouyRowModel = LayhouyRowModel()
    // TODO uncomment following line after integration with data source
    // val layhouyRowModel = list[position]
    holder.binding.layhouyRowModel = layhouyRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<LayhouyRowModel>) {
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
      item: LayhouyRowModel
    ) {
    }
  }

  inner class RowLayhouyVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowLayhouyBinding = RowLayhouyBinding.bind(itemView)
  }
}
