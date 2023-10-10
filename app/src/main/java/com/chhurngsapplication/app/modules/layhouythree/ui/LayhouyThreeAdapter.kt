package com.chhurngsapplication.app.modules.layhouythree.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowLayhouyThreeBinding
import com.chhurngsapplication.app.modules.layhouythree.`data`.model.LayhouyThreeRowModel
import kotlin.Int
import kotlin.collections.List

class LayhouyThreeAdapter(
  var list: List<LayhouyThreeRowModel>
) : RecyclerView.Adapter<LayhouyThreeAdapter.RowLayhouyThreeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowLayhouyThreeVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_layhouy_three,parent,false)
    return RowLayhouyThreeVH(view)
  }

  override fun onBindViewHolder(holder: RowLayhouyThreeVH, position: Int) {
    val layhouyThreeRowModel = LayhouyThreeRowModel()
    // TODO uncomment following line after integration with data source
    // val layhouyThreeRowModel = list[position]
    holder.binding.layhouyThreeRowModel = layhouyThreeRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<LayhouyThreeRowModel>) {
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
      item: LayhouyThreeRowModel
    ) {
    }
  }

  inner class RowLayhouyThreeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowLayhouyThreeBinding = RowLayhouyThreeBinding.bind(itemView)
  }
}
