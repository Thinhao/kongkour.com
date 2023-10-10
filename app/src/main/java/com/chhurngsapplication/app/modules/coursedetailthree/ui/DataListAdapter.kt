package com.chhurngsapplication.app.modules.coursedetailthree.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowDatalist5Binding
import com.chhurngsapplication.app.modules.coursedetailthree.`data`.model.Datalist5RowModel
import kotlin.Int
import kotlin.collections.List

class DataListAdapter(
  var list: List<Datalist5RowModel>
) : RecyclerView.Adapter<DataListAdapter.RowDatalist5VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDatalist5VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_datalist5,parent,false)
    return RowDatalist5VH(view)
  }

  override fun onBindViewHolder(holder: RowDatalist5VH, position: Int) {
    val datalist5RowModel = Datalist5RowModel()
    // TODO uncomment following line after integration with data source
    // val datalist5RowModel = list[position]
    holder.binding.datalist5RowModel = datalist5RowModel
  }

  override fun getItemCount(): Int = 7
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Datalist5RowModel>) {
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
      item: Datalist5RowModel
    ) {
    }
  }

  inner class RowDatalist5VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowDatalist5Binding = RowDatalist5Binding.bind(itemView)
    init {
      binding.btn1.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Datalist5RowModel())
      }
    }
  }
}
