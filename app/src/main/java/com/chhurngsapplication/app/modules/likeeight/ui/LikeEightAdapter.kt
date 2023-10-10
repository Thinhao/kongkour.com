package com.chhurngsapplication.app.modules.likeeight.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowLikeEightBinding
import com.chhurngsapplication.app.modules.likeeight.`data`.model.LikeEightRowModel
import kotlin.Int
import kotlin.collections.List

class LikeEightAdapter(
  var list: List<LikeEightRowModel>
) : RecyclerView.Adapter<LikeEightAdapter.RowLikeEightVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowLikeEightVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_like_eight,parent,false)
    return RowLikeEightVH(view)
  }

  override fun onBindViewHolder(holder: RowLikeEightVH, position: Int) {
    val likeEightRowModel = LikeEightRowModel()
    // TODO uncomment following line after integration with data source
    // val likeEightRowModel = list[position]
    holder.binding.likeEightRowModel = likeEightRowModel
  }

  override fun getItemCount(): Int = 10
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<LikeEightRowModel>) {
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
      item: LikeEightRowModel
    ) {
    }
  }

  inner class RowLikeEightVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowLikeEightBinding = RowLikeEightBinding.bind(itemView)
  }
}
