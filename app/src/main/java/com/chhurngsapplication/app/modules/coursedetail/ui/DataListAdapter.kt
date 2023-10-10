package com.chhurngsapplication.app.modules.coursedetail.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowDatalist4Binding
import com.chhurngsapplication.app.modules.coursedetail.`data`.model.Datalist4RowModel
import kotlin.Int
import kotlin.collections.List

class DataListAdapter(
  var list: List<Datalist4RowModel>
) : RecyclerView.Adapter<DataListAdapter.RowDatalist4VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDatalist4VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_datalist4,parent,false)
    return RowDatalist4VH(view)
  }

  override fun onBindViewHolder(holder: RowDatalist4VH, position: Int) {
    val datalist4RowModel = Datalist4RowModel()
    // TODO uncomment following line after integration with data source
    // val datalist4RowModel = list[position]
    holder.binding.datalist4RowModel = datalist4RowModel
  }

  override fun getItemCount(): Int = 7
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Datalist4RowModel>) {
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
      item: Datalist4RowModel
    ) {
    }
  }

  inner class RowDatalist4VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowDatalist4Binding = RowDatalist4Binding.bind(itemView)
    init {
      binding.btn1.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Datalist4RowModel())
      }
    }
  }
}
