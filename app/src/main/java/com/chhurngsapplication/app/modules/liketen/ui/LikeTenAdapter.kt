package com.chhurngsapplication.app.modules.liketen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowLikeTenBinding
import com.chhurngsapplication.app.modules.liketen.`data`.model.LikeTenRowModel
import kotlin.Int
import kotlin.collections.List

class LikeTenAdapter(
  var list: List<LikeTenRowModel>
) : RecyclerView.Adapter<LikeTenAdapter.RowLikeTenVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowLikeTenVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_like_ten,parent,false)
    return RowLikeTenVH(view)
  }

  override fun onBindViewHolder(holder: RowLikeTenVH, position: Int) {
    val likeTenRowModel = LikeTenRowModel()
    // TODO uncomment following line after integration with data source
    // val likeTenRowModel = list[position]
    holder.binding.likeTenRowModel = likeTenRowModel
  }

  override fun getItemCount(): Int = 10
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<LikeTenRowModel>) {
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
      item: LikeTenRowModel
    ) {
    }
  }

  inner class RowLikeTenVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowLikeTenBinding = RowLikeTenBinding.bind(itemView)
  }
}
