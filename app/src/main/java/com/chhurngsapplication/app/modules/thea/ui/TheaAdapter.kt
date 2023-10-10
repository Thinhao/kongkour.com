package com.chhurngsapplication.app.modules.thea.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowTheaBinding
import com.chhurngsapplication.app.modules.thea.`data`.model.TheaRowModel
import kotlin.Int
import kotlin.collections.List

class TheaAdapter(
  var list: List<TheaRowModel>
) : RecyclerView.Adapter<TheaAdapter.RowTheaVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowTheaVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_thea,parent,false)
    return RowTheaVH(view)
  }

  override fun onBindViewHolder(holder: RowTheaVH, position: Int) {
    val theaRowModel = TheaRowModel()
    // TODO uncomment following line after integration with data source
    // val theaRowModel = list[position]
    holder.binding.theaRowModel = theaRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<TheaRowModel>) {
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
      item: TheaRowModel
    ) {
    }
  }

  inner class RowTheaVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowTheaBinding = RowTheaBinding.bind(itemView)
  }
}
