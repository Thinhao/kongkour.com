package com.chhurngsapplication.app.modules.one.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowListplaceholderFourBinding
import com.chhurngsapplication.app.modules.one.`data`.model.ListplaceholderFourRowModel
import kotlin.Int
import kotlin.collections.List

class ListplaceholderFourAdapter(
  var list: List<ListplaceholderFourRowModel>
) : RecyclerView.Adapter<ListplaceholderFourAdapter.RowListplaceholderFourVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListplaceholderFourVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listplaceholder_four,parent,false)
    return RowListplaceholderFourVH(view)
  }

  override fun onBindViewHolder(holder: RowListplaceholderFourVH, position: Int) {
    val listplaceholderFourRowModel = ListplaceholderFourRowModel()
    // TODO uncomment following line after integration with data source
    // val listplaceholderFourRowModel = list[position]
    holder.binding.listplaceholderFourRowModel = listplaceholderFourRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListplaceholderFourRowModel>) {
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
      item: ListplaceholderFourRowModel
    ) {
    }
  }

  inner class RowListplaceholderFourVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListplaceholderFourBinding = RowListplaceholderFourBinding.bind(itemView)
    init {
      binding.linearColumnplaceholderFour.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListplaceholderFourRowModel())
      }
    }
  }
}
