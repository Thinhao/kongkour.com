package com.chhurngsapplication.app.modules.likeone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowLikeOneBinding
import com.chhurngsapplication.app.modules.likeone.`data`.model.LikeOneRowModel
import kotlin.Int
import kotlin.collections.List

class LikeOneAdapter(
  var list: List<LikeOneRowModel>
) : RecyclerView.Adapter<LikeOneAdapter.RowLikeOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowLikeOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_like_one,parent,false)
    return RowLikeOneVH(view)
  }

  override fun onBindViewHolder(holder: RowLikeOneVH, position: Int) {
    val likeOneRowModel = LikeOneRowModel()
    // TODO uncomment following line after integration with data source
    // val likeOneRowModel = list[position]
    holder.binding.likeOneRowModel = likeOneRowModel
  }

  override fun getItemCount(): Int = 10
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<LikeOneRowModel>) {
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
      item: LikeOneRowModel
    ) {
    }
  }

  inner class RowLikeOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowLikeOneBinding = RowLikeOneBinding.bind(itemView)
  }
}
