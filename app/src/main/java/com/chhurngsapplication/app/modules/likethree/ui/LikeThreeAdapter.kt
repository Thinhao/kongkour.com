package com.chhurngsapplication.app.modules.likethree.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowLikeThreeBinding
import com.chhurngsapplication.app.modules.likethree.`data`.model.LikeThreeRowModel
import kotlin.Int
import kotlin.collections.List

class LikeThreeAdapter(
  var list: List<LikeThreeRowModel>
) : RecyclerView.Adapter<LikeThreeAdapter.RowLikeThreeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowLikeThreeVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_like_three,parent,false)
    return RowLikeThreeVH(view)
  }

  override fun onBindViewHolder(holder: RowLikeThreeVH, position: Int) {
    val likeThreeRowModel = LikeThreeRowModel()
    // TODO uncomment following line after integration with data source
    // val likeThreeRowModel = list[position]
    holder.binding.likeThreeRowModel = likeThreeRowModel
  }

  override fun getItemCount(): Int = 10
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<LikeThreeRowModel>) {
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
      item: LikeThreeRowModel
    ) {
    }
  }

  inner class RowLikeThreeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowLikeThreeBinding = RowLikeThreeBinding.bind(itemView)
  }
}
