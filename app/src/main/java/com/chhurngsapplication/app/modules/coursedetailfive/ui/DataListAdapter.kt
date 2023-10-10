package com.chhurngsapplication.app.modules.coursedetailfive.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowDatalist3Binding
import com.chhurngsapplication.app.modules.coursedetailfive.`data`.model.Datalist3RowModel
import kotlin.Int
import kotlin.collections.List

class DataListAdapter(
  var list: List<Datalist3RowModel>
) : RecyclerView.Adapter<DataListAdapter.RowDatalist3VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDatalist3VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_datalist3,parent,false)
    return RowDatalist3VH(view)
  }

  override fun onBindViewHolder(holder: RowDatalist3VH, position: Int) {
    val datalist3RowModel = Datalist3RowModel()
    // TODO uncomment following line after integration with data source
    // val datalist3RowModel = list[position]
    holder.binding.datalist3RowModel = datalist3RowModel
  }

  override fun getItemCount(): Int = 7
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Datalist3RowModel>) {
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
      item: Datalist3RowModel
    ) {
    }
  }

  inner class RowDatalist3VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowDatalist3Binding = RowDatalist3Binding.bind(itemView)
    init {
      binding.btn1.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Datalist3RowModel())
      }
    }
  }
}
