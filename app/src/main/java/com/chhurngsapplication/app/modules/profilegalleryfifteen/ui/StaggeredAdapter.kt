package com.chhurngsapplication.app.modules.profilegalleryfifteen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowStaggered9Binding
import com.chhurngsapplication.app.modules.profilegalleryfifteen.`data`.model.Staggered9RowModel
import kotlin.Int
import kotlin.collections.List

class StaggeredAdapter(
  var list: List<Staggered9RowModel>
) : RecyclerView.Adapter<StaggeredAdapter.RowStaggered9VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowStaggered9VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_staggered9,parent,false)
    return RowStaggered9VH(view)
  }

  override fun onBindViewHolder(holder: RowStaggered9VH, position: Int) {
    val staggered9RowModel = Staggered9RowModel()
    // TODO uncomment following line after integration with data source
    // val staggered9RowModel = list[position]
    holder.binding.staggered9RowModel = staggered9RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Staggered9RowModel>) {
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
      item: Staggered9RowModel
    ) {
    }
  }

  inner class RowStaggered9VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowStaggered9Binding = RowStaggered9Binding.bind(itemView)
  }
}
