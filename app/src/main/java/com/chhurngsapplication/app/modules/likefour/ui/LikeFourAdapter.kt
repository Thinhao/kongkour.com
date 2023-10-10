package com.chhurngsapplication.app.modules.likefour.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowLikeFourBinding
import com.chhurngsapplication.app.modules.likefour.`data`.model.LikeFourRowModel
import kotlin.Int
import kotlin.collections.List

class LikeFourAdapter(
  var list: List<LikeFourRowModel>
) : RecyclerView.Adapter<LikeFourAdapter.RowLikeFourVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowLikeFourVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_like_four,parent,false)
    return RowLikeFourVH(view)
  }

  override fun onBindViewHolder(holder: RowLikeFourVH, position: Int) {
    val likeFourRowModel = LikeFourRowModel()
    // TODO uncomment following line after integration with data source
    // val likeFourRowModel = list[position]
    holder.binding.likeFourRowModel = likeFourRowModel
  }

  override fun getItemCount(): Int = 10
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<LikeFourRowModel>) {
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
      item: LikeFourRowModel
    ) {
    }
  }

  inner class RowLikeFourVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowLikeFourBinding = RowLikeFourBinding.bind(itemView)
  }
}
