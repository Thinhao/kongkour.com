package com.chhurngsapplication.app.modules.likefive.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowLikeFiveBinding
import com.chhurngsapplication.app.modules.likefive.`data`.model.LikeFiveRowModel
import kotlin.Int
import kotlin.collections.List

class LikeFiveAdapter(
  var list: List<LikeFiveRowModel>
) : RecyclerView.Adapter<LikeFiveAdapter.RowLikeFiveVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowLikeFiveVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_like_five,parent,false)
    return RowLikeFiveVH(view)
  }

  override fun onBindViewHolder(holder: RowLikeFiveVH, position: Int) {
    val likeFiveRowModel = LikeFiveRowModel()
    // TODO uncomment following line after integration with data source
    // val likeFiveRowModel = list[position]
    holder.binding.likeFiveRowModel = likeFiveRowModel
  }

  override fun getItemCount(): Int = 10
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<LikeFiveRowModel>) {
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
      item: LikeFiveRowModel
    ) {
    }
  }

  inner class RowLikeFiveVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowLikeFiveBinding = RowLikeFiveBinding.bind(itemView)
  }
}
