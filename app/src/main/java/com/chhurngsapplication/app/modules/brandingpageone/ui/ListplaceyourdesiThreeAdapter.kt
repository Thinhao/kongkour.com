package com.chhurngsapplication.app.modules.brandingpageone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowListplaceyourdesiThreeBinding
import com.chhurngsapplication.app.modules.brandingpageone.`data`.model.ListplaceyourdesiThreeRowModel
import kotlin.Int
import kotlin.collections.List

class ListplaceyourdesiThreeAdapter(
  var list: List<ListplaceyourdesiThreeRowModel>
) : RecyclerView.Adapter<ListplaceyourdesiThreeAdapter.RowListplaceyourdesiThreeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListplaceyourdesiThreeVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listplaceyourdesi_three,parent,false)
    return RowListplaceyourdesiThreeVH(view)
  }

  override fun onBindViewHolder(holder: RowListplaceyourdesiThreeVH, position: Int) {
    val listplaceyourdesiThreeRowModel = ListplaceyourdesiThreeRowModel()
    // TODO uncomment following line after integration with data source
    // val listplaceyourdesiThreeRowModel = list[position]
    holder.binding.listplaceyourdesiThreeRowModel = listplaceyourdesiThreeRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListplaceyourdesiThreeRowModel>) {
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
      item: ListplaceyourdesiThreeRowModel
    ) {
    }
  }

  inner class RowListplaceyourdesiThreeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListplaceyourdesiThreeBinding = RowListplaceyourdesiThreeBinding.bind(itemView)
  }
}
