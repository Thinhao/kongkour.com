package com.chhurngsapplication.app.modules.sixteen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowListplaceholderFive1Binding
import com.chhurngsapplication.app.modules.sixteen.`data`.model.ListplaceholderFive1RowModel
import kotlin.Int
import kotlin.collections.List

class ListplaceholderFiveAdapter(
  var list: List<ListplaceholderFive1RowModel>
) : RecyclerView.Adapter<ListplaceholderFiveAdapter.RowListplaceholderFive1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListplaceholderFive1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listplaceholder_five1,parent,false)
    return RowListplaceholderFive1VH(view)
  }

  override fun onBindViewHolder(holder: RowListplaceholderFive1VH, position: Int) {
    val listplaceholderFive1RowModel = ListplaceholderFive1RowModel()
    // TODO uncomment following line after integration with data source
    // val listplaceholderFive1RowModel = list[position]
    holder.binding.listplaceholderFive1RowModel = listplaceholderFive1RowModel
  }

  override fun getItemCount(): Int = 9
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListplaceholderFive1RowModel>) {
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
      item: ListplaceholderFive1RowModel
    ) {
    }
  }

  inner class RowListplaceholderFive1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListplaceholderFive1Binding = RowListplaceholderFive1Binding.bind(itemView)
    init {
      binding.btn45.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListplaceholderFive1RowModel())
      }
    }
  }
}
