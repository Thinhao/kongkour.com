package com.chhurngsapplication.app.modules.profilegalleryeighteen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowStaggered11Binding
import com.chhurngsapplication.app.modules.profilegalleryeighteen.`data`.model.Staggered11RowModel
import kotlin.Int
import kotlin.collections.List

class StaggeredAdapter(
  var list: List<Staggered11RowModel>
) : RecyclerView.Adapter<StaggeredAdapter.RowStaggered11VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowStaggered11VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_staggered11,parent,false)
    return RowStaggered11VH(view)
  }

  override fun onBindViewHolder(holder: RowStaggered11VH, position: Int) {
    val staggered11RowModel = Staggered11RowModel()
    // TODO uncomment following line after integration with data source
    // val staggered11RowModel = list[position]
    holder.binding.staggered11RowModel = staggered11RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Staggered11RowModel>) {
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
      item: Staggered11RowModel
    ) {
    }
  }

  inner class RowStaggered11VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowStaggered11Binding = RowStaggered11Binding.bind(itemView)
  }
}
