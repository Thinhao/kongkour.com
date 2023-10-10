package com.chhurngsapplication.app.modules.likesix.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowLikeSixBinding
import com.chhurngsapplication.app.modules.likesix.`data`.model.LikeSixRowModel
import kotlin.Int
import kotlin.collections.List

class LikeSixAdapter(
  var list: List<LikeSixRowModel>
) : RecyclerView.Adapter<LikeSixAdapter.RowLikeSixVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowLikeSixVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_like_six,parent,false)
    return RowLikeSixVH(view)
  }

  override fun onBindViewHolder(holder: RowLikeSixVH, position: Int) {
    val likeSixRowModel = LikeSixRowModel()
    // TODO uncomment following line after integration with data source
    // val likeSixRowModel = list[position]
    holder.binding.likeSixRowModel = likeSixRowModel
  }

  override fun getItemCount(): Int = 10
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<LikeSixRowModel>) {
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
      item: LikeSixRowModel
    ) {
    }
  }

  inner class RowLikeSixVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowLikeSixBinding = RowLikeSixBinding.bind(itemView)
  }
}
