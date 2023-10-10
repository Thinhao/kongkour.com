package com.chhurngsapplication.app.modules.sixteen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowListplaceholderFour1Binding
import com.chhurngsapplication.app.modules.sixteen.`data`.model.ListplaceholderFour1RowModel
import kotlin.Int
import kotlin.collections.List

class ListplaceholderFourAdapter(
  var list: List<ListplaceholderFour1RowModel>
) : RecyclerView.Adapter<ListplaceholderFourAdapter.RowListplaceholderFour1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListplaceholderFour1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listplaceholder_four1,parent,false)
    return RowListplaceholderFour1VH(view)
  }

  override fun onBindViewHolder(holder: RowListplaceholderFour1VH, position: Int) {
    val listplaceholderFour1RowModel = ListplaceholderFour1RowModel()
    // TODO uncomment following line after integration with data source
    // val listplaceholderFour1RowModel = list[position]
    holder.binding.listplaceholderFour1RowModel = listplaceholderFour1RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListplaceholderFour1RowModel>) {
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
      item: ListplaceholderFour1RowModel
    ) {
    }
  }

  inner class RowListplaceholderFour1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListplaceholderFour1Binding = RowListplaceholderFour1Binding.bind(itemView)
    init {
      binding.linearColumnplaceholderFour.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListplaceholderFour1RowModel())
      }
    }
  }
}
