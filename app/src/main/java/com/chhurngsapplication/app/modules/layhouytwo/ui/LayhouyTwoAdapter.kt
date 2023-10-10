package com.chhurngsapplication.app.modules.layhouytwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowLayhouyTwoBinding
import com.chhurngsapplication.app.modules.layhouytwo.`data`.model.LayhouyTwoRowModel
import kotlin.Int
import kotlin.collections.List

class LayhouyTwoAdapter(
  var list: List<LayhouyTwoRowModel>
) : RecyclerView.Adapter<LayhouyTwoAdapter.RowLayhouyTwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowLayhouyTwoVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_layhouy_two,parent,false)
    return RowLayhouyTwoVH(view)
  }

  override fun onBindViewHolder(holder: RowLayhouyTwoVH, position: Int) {
    val layhouyTwoRowModel = LayhouyTwoRowModel()
    // TODO uncomment following line after integration with data source
    // val layhouyTwoRowModel = list[position]
    holder.binding.layhouyTwoRowModel = layhouyTwoRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<LayhouyTwoRowModel>) {
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
      item: LayhouyTwoRowModel
    ) {
    }
  }

  inner class RowLayhouyTwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowLayhouyTwoBinding = RowLayhouyTwoBinding.bind(itemView)
  }
}
