package com.chhurngsapplication.app.modules.profilegalleryfourteen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowStaggered3Binding
import com.chhurngsapplication.app.modules.profilegalleryfourteen.`data`.model.Staggered3RowModel
import kotlin.Int
import kotlin.collections.List

class StaggeredAdapter(
  var list: List<Staggered3RowModel>
) : RecyclerView.Adapter<StaggeredAdapter.RowStaggered3VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowStaggered3VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_staggered3,parent,false)
    return RowStaggered3VH(view)
  }

  override fun onBindViewHolder(holder: RowStaggered3VH, position: Int) {
    val staggered3RowModel = Staggered3RowModel()
    // TODO uncomment following line after integration with data source
    // val staggered3RowModel = list[position]
    holder.binding.staggered3RowModel = staggered3RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Staggered3RowModel>) {
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
      item: Staggered3RowModel
    ) {
    }
  }

  inner class RowStaggered3VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowStaggered3Binding = RowStaggered3Binding.bind(itemView)
  }
}
