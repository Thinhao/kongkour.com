package com.chhurngsapplication.app.modules.profilegallerythirteen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowStaggered18Binding
import com.chhurngsapplication.app.modules.profilegallerythirteen.`data`.model.Staggered18RowModel
import kotlin.Int
import kotlin.collections.List

class StaggeredAdapter(
  var list: List<Staggered18RowModel>
) : RecyclerView.Adapter<StaggeredAdapter.RowStaggered18VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowStaggered18VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_staggered18,parent,false)
    return RowStaggered18VH(view)
  }

  override fun onBindViewHolder(holder: RowStaggered18VH, position: Int) {
    val staggered18RowModel = Staggered18RowModel()
    // TODO uncomment following line after integration with data source
    // val staggered18RowModel = list[position]
    holder.binding.staggered18RowModel = staggered18RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Staggered18RowModel>) {
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
      item: Staggered18RowModel
    ) {
    }
  }

  inner class RowStaggered18VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowStaggered18Binding = RowStaggered18Binding.bind(itemView)
  }
}
