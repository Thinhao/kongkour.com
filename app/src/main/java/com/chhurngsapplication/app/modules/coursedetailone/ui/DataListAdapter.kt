package com.chhurngsapplication.app.modules.coursedetailone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowDatalistBinding
import com.chhurngsapplication.app.modules.coursedetailone.`data`.model.DatalistRowModel
import kotlin.Int
import kotlin.collections.List

class DataListAdapter(
  var list: List<DatalistRowModel>
) : RecyclerView.Adapter<DataListAdapter.RowDatalistVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDatalistVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_datalist,parent,false)
    return RowDatalistVH(view)
  }

  override fun onBindViewHolder(holder: RowDatalistVH, position: Int) {
    val datalistRowModel = DatalistRowModel()
    // TODO uncomment following line after integration with data source
    // val datalistRowModel = list[position]
    holder.binding.datalistRowModel = datalistRowModel
  }

  override fun getItemCount(): Int = 7
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<DatalistRowModel>) {
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
      item: DatalistRowModel
    ) {
    }
  }

  inner class RowDatalistVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowDatalistBinding = RowDatalistBinding.bind(itemView)
    init {
      binding.btn1.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, DatalistRowModel())
      }
    }
  }
}
