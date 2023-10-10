package com.chhurngsapplication.app.modules.likeeleven.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowLikeElevenBinding
import com.chhurngsapplication.app.modules.likeeleven.`data`.model.LikeElevenRowModel
import kotlin.Int
import kotlin.collections.List

class LikeElevenAdapter(
  var list: List<LikeElevenRowModel>
) : RecyclerView.Adapter<LikeElevenAdapter.RowLikeElevenVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowLikeElevenVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_like_eleven,parent,false)
    return RowLikeElevenVH(view)
  }

  override fun onBindViewHolder(holder: RowLikeElevenVH, position: Int) {
    val likeElevenRowModel = LikeElevenRowModel()
    // TODO uncomment following line after integration with data source
    // val likeElevenRowModel = list[position]
    holder.binding.likeElevenRowModel = likeElevenRowModel
  }

  override fun getItemCount(): Int = 10
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<LikeElevenRowModel>) {
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
      item: LikeElevenRowModel
    ) {
    }
  }

  inner class RowLikeElevenVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowLikeElevenBinding = RowLikeElevenBinding.bind(itemView)
  }
}
