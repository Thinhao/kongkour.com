package com.chhurngsapplication.app.modules.likeseven.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowLikeSevenBinding
import com.chhurngsapplication.app.modules.likeseven.`data`.model.LikeSevenRowModel
import kotlin.Int
import kotlin.collections.List

class LikeSevenAdapter(
  var list: List<LikeSevenRowModel>
) : RecyclerView.Adapter<LikeSevenAdapter.RowLikeSevenVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowLikeSevenVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_like_seven,parent,false)
    return RowLikeSevenVH(view)
  }

  override fun onBindViewHolder(holder: RowLikeSevenVH, position: Int) {
    val likeSevenRowModel = LikeSevenRowModel()
    // TODO uncomment following line after integration with data source
    // val likeSevenRowModel = list[position]
    holder.binding.likeSevenRowModel = likeSevenRowModel
  }

  override fun getItemCount(): Int = 10
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<LikeSevenRowModel>) {
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
      item: LikeSevenRowModel
    ) {
    }
  }

  inner class RowLikeSevenVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowLikeSevenBinding = RowLikeSevenBinding.bind(itemView)
  }
}
