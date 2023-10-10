package com.chhurngsapplication.app.modules.profilegalleryseventeen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowStaggered16Binding
import com.chhurngsapplication.app.modules.profilegalleryseventeen.`data`.model.Staggered16RowModel
import kotlin.Int
import kotlin.collections.List

class StaggeredAdapter(
  var list: List<Staggered16RowModel>
) : RecyclerView.Adapter<StaggeredAdapter.RowStaggered16VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowStaggered16VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_staggered16,parent,false)
    return RowStaggered16VH(view)
  }

  override fun onBindViewHolder(holder: RowStaggered16VH, position: Int) {
    val staggered16RowModel = Staggered16RowModel()
    // TODO uncomment following line after integration with data source
    // val staggered16RowModel = list[position]
    holder.binding.staggered16RowModel = staggered16RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Staggered16RowModel>) {
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
      item: Staggered16RowModel
    ) {
    }
  }

  inner class RowStaggered16VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowStaggered16Binding = RowStaggered16Binding.bind(itemView)
  }
}
