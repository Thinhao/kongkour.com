package com.chhurngsapplication.app.modules.like.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowLikeBinding
import com.chhurngsapplication.app.modules.like.`data`.model.LikeRowModel
import kotlin.Int
import kotlin.collections.List

class LikeAdapter(
  var list: List<LikeRowModel>
) : RecyclerView.Adapter<LikeAdapter.RowLikeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowLikeVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_like,parent,false)
    return RowLikeVH(view)
  }

  override fun onBindViewHolder(holder: RowLikeVH, position: Int) {
    val likeRowModel = LikeRowModel()
    // TODO uncomment following line after integration with data source
    // val likeRowModel = list[position]
    holder.binding.likeRowModel = likeRowModel
  }

  override fun getItemCount(): Int = 10
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<LikeRowModel>) {
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
      item: LikeRowModel
    ) {
    }
  }

  inner class RowLikeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowLikeBinding = RowLikeBinding.bind(itemView)
  }
}
