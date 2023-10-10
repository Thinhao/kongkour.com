package com.chhurngsapplication.app.modules.liketwelve.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowLikeTwelveBinding
import com.chhurngsapplication.app.modules.liketwelve.`data`.model.LikeTwelveRowModel
import kotlin.Int
import kotlin.collections.List

class LikeTwelveAdapter(
  var list: List<LikeTwelveRowModel>
) : RecyclerView.Adapter<LikeTwelveAdapter.RowLikeTwelveVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowLikeTwelveVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_like_twelve,parent,false)
    return RowLikeTwelveVH(view)
  }

  override fun onBindViewHolder(holder: RowLikeTwelveVH, position: Int) {
    val likeTwelveRowModel = LikeTwelveRowModel()
    // TODO uncomment following line after integration with data source
    // val likeTwelveRowModel = list[position]
    holder.binding.likeTwelveRowModel = likeTwelveRowModel
  }

  override fun getItemCount(): Int = 10
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<LikeTwelveRowModel>) {
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
      item: LikeTwelveRowModel
    ) {
    }
  }

  inner class RowLikeTwelveVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowLikeTwelveBinding = RowLikeTwelveBinding.bind(itemView)
  }
}
