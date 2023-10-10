package com.chhurngsapplication.app.modules.nathanone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowNathanOneBinding
import com.chhurngsapplication.app.modules.nathanone.`data`.model.NathanOneRowModel
import kotlin.Int
import kotlin.collections.List

class NathanOneAdapter(
  var list: List<NathanOneRowModel>
) : RecyclerView.Adapter<NathanOneAdapter.RowNathanOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowNathanOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_nathan_one,parent,false)
    return RowNathanOneVH(view)
  }

  override fun onBindViewHolder(holder: RowNathanOneVH, position: Int) {
    val nathanOneRowModel = NathanOneRowModel()
    // TODO uncomment following line after integration with data source
    // val nathanOneRowModel = list[position]
    holder.binding.nathanOneRowModel = nathanOneRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<NathanOneRowModel>) {
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
      item: NathanOneRowModel
    ) {
    }
  }

  inner class RowNathanOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowNathanOneBinding = RowNathanOneBinding.bind(itemView)
  }
}
