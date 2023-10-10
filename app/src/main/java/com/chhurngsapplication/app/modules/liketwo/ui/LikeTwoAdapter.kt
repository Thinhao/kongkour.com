package com.chhurngsapplication.app.modules.liketwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowLikeTwoBinding
import com.chhurngsapplication.app.modules.liketwo.`data`.model.LikeTwoRowModel
import kotlin.Int
import kotlin.collections.List

class LikeTwoAdapter(
  var list: List<LikeTwoRowModel>
) : RecyclerView.Adapter<LikeTwoAdapter.RowLikeTwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowLikeTwoVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_like_two,parent,false)
    return RowLikeTwoVH(view)
  }

  override fun onBindViewHolder(holder: RowLikeTwoVH, position: Int) {
    val likeTwoRowModel = LikeTwoRowModel()
    // TODO uncomment following line after integration with data source
    // val likeTwoRowModel = list[position]
    holder.binding.likeTwoRowModel = likeTwoRowModel
  }

  override fun getItemCount(): Int = 10
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<LikeTwoRowModel>) {
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
      item: LikeTwoRowModel
    ) {
    }
  }

  inner class RowLikeTwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowLikeTwoBinding = RowLikeTwoBinding.bind(itemView)
  }
}
