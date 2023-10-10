package com.chhurngsapplication.app.modules.profilegallerysixteen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowStaggered12Binding
import com.chhurngsapplication.app.modules.profilegallerysixteen.`data`.model.Staggered12RowModel
import kotlin.Int
import kotlin.collections.List

class StaggeredAdapter(
  var list: List<Staggered12RowModel>
) : RecyclerView.Adapter<StaggeredAdapter.RowStaggered12VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowStaggered12VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_staggered12,parent,false)
    return RowStaggered12VH(view)
  }

  override fun onBindViewHolder(holder: RowStaggered12VH, position: Int) {
    val staggered12RowModel = Staggered12RowModel()
    // TODO uncomment following line after integration with data source
    // val staggered12RowModel = list[position]
    holder.binding.staggered12RowModel = staggered12RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Staggered12RowModel>) {
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
      item: Staggered12RowModel
    ) {
    }
  }

  inner class RowStaggered12VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowStaggered12Binding = RowStaggered12Binding.bind(itemView)
  }
}
