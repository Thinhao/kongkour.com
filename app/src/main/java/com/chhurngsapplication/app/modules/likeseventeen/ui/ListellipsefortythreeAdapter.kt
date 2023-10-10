package com.chhurngsapplication.app.modules.likeseventeen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowListellipsefortythreeBinding
import com.chhurngsapplication.app.modules.likeseventeen.`data`.model.ListellipsefortythreeRowModel
import kotlin.Int
import kotlin.collections.List

class ListellipsefortythreeAdapter(
  var list: List<ListellipsefortythreeRowModel>
) : RecyclerView.Adapter<ListellipsefortythreeAdapter.RowListellipsefortythreeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListellipsefortythreeVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listellipsefortythree,parent,false)
    return RowListellipsefortythreeVH(view)
  }

  override fun onBindViewHolder(holder: RowListellipsefortythreeVH, position: Int) {
    val listellipsefortythreeRowModel = ListellipsefortythreeRowModel()
    // TODO uncomment following line after integration with data source
    // val listellipsefortythreeRowModel = list[position]
    holder.binding.listellipsefortythreeRowModel = listellipsefortythreeRowModel
  }

  override fun getItemCount(): Int = 10
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListellipsefortythreeRowModel>) {
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
      item: ListellipsefortythreeRowModel
    ) {
    }
  }

  inner class RowListellipsefortythreeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListellipsefortythreeBinding = RowListellipsefortythreeBinding.bind(itemView)
  }
}
