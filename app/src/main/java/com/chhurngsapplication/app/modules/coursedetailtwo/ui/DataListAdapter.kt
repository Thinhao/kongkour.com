package com.chhurngsapplication.app.modules.coursedetailtwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowDatalist2Binding
import com.chhurngsapplication.app.modules.coursedetailtwo.`data`.model.Datalist2RowModel
import kotlin.Int
import kotlin.collections.List

class DataListAdapter(
  var list: List<Datalist2RowModel>
) : RecyclerView.Adapter<DataListAdapter.RowDatalist2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDatalist2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_datalist2,parent,false)
    return RowDatalist2VH(view)
  }

  override fun onBindViewHolder(holder: RowDatalist2VH, position: Int) {
    val datalist2RowModel = Datalist2RowModel()
    // TODO uncomment following line after integration with data source
    // val datalist2RowModel = list[position]
    holder.binding.datalist2RowModel = datalist2RowModel
  }

  override fun getItemCount(): Int = 7
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Datalist2RowModel>) {
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
      item: Datalist2RowModel
    ) {
    }
  }

  inner class RowDatalist2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowDatalist2Binding = RowDatalist2Binding.bind(itemView)
    init {
      binding.btn1.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Datalist2RowModel())
      }
    }
  }
}
