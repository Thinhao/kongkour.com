package com.chhurngsapplication.app.modules.likenine.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowLikeNineBinding
import com.chhurngsapplication.app.modules.likenine.`data`.model.LikeNineRowModel
import kotlin.Int
import kotlin.collections.List

class LikeNineAdapter(
  var list: List<LikeNineRowModel>
) : RecyclerView.Adapter<LikeNineAdapter.RowLikeNineVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowLikeNineVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_like_nine,parent,false)
    return RowLikeNineVH(view)
  }

  override fun onBindViewHolder(holder: RowLikeNineVH, position: Int) {
    val likeNineRowModel = LikeNineRowModel()
    // TODO uncomment following line after integration with data source
    // val likeNineRowModel = list[position]
    holder.binding.likeNineRowModel = likeNineRowModel
  }

  override fun getItemCount(): Int = 10
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<LikeNineRowModel>) {
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
      item: LikeNineRowModel
    ) {
    }
  }

  inner class RowLikeNineVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowLikeNineBinding = RowLikeNineBinding.bind(itemView)
  }
}
