package com.chhurngsapplication.app.modules.profilegallerynineteen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowStaggered4Binding
import com.chhurngsapplication.app.modules.profilegallerynineteen.`data`.model.Staggered4RowModel
import kotlin.Int
import kotlin.collections.List

class StaggeredAdapter(
  var list: List<Staggered4RowModel>
) : RecyclerView.Adapter<StaggeredAdapter.RowStaggered4VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowStaggered4VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_staggered4,parent,false)
    return RowStaggered4VH(view)
  }

  override fun onBindViewHolder(holder: RowStaggered4VH, position: Int) {
    val staggered4RowModel = Staggered4RowModel()
    // TODO uncomment following line after integration with data source
    // val staggered4RowModel = list[position]
    holder.binding.staggered4RowModel = staggered4RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Staggered4RowModel>) {
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
      item: Staggered4RowModel
    ) {
    }
  }

  inner class RowStaggered4VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowStaggered4Binding = RowStaggered4Binding.bind(itemView)
  }
}
