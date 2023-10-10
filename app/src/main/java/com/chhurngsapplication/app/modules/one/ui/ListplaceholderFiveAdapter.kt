package com.chhurngsapplication.app.modules.one.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowListplaceholderFiveBinding
import com.chhurngsapplication.app.modules.one.`data`.model.ListplaceholderFiveRowModel
import kotlin.Int
import kotlin.collections.List

class ListplaceholderFiveAdapter(
  var list: List<ListplaceholderFiveRowModel>
) : RecyclerView.Adapter<ListplaceholderFiveAdapter.RowListplaceholderFiveVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListplaceholderFiveVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listplaceholder_five,parent,false)
    return RowListplaceholderFiveVH(view)
  }

  override fun onBindViewHolder(holder: RowListplaceholderFiveVH, position: Int) {
    val listplaceholderFiveRowModel = ListplaceholderFiveRowModel()
    // TODO uncomment following line after integration with data source
    // val listplaceholderFiveRowModel = list[position]
    holder.binding.listplaceholderFiveRowModel = listplaceholderFiveRowModel
  }

  override fun getItemCount(): Int = 9
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListplaceholderFiveRowModel>) {
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
      item: ListplaceholderFiveRowModel
    ) {
    }
  }

  inner class RowListplaceholderFiveVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListplaceholderFiveBinding = RowListplaceholderFiveBinding.bind(itemView)
    init {
      binding.btn45.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListplaceholderFiveRowModel())
      }
    }
  }
}
