package com.chhurngsapplication.app.modules.layhouyone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowLayhouyOneBinding
import com.chhurngsapplication.app.modules.layhouyone.`data`.model.LayhouyOneRowModel
import kotlin.Int
import kotlin.collections.List

class LayhouyOneAdapter(
  var list: List<LayhouyOneRowModel>
) : RecyclerView.Adapter<LayhouyOneAdapter.RowLayhouyOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowLayhouyOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_layhouy_one,parent,false)
    return RowLayhouyOneVH(view)
  }

  override fun onBindViewHolder(holder: RowLayhouyOneVH, position: Int) {
    val layhouyOneRowModel = LayhouyOneRowModel()
    // TODO uncomment following line after integration with data source
    // val layhouyOneRowModel = list[position]
    holder.binding.layhouyOneRowModel = layhouyOneRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<LayhouyOneRowModel>) {
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
      item: LayhouyOneRowModel
    ) {
    }
  }

  inner class RowLayhouyOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowLayhouyOneBinding = RowLayhouyOneBinding.bind(itemView)
  }
}
