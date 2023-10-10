package com.chhurngsapplication.app.modules.likesixteen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowLikeSixteenBinding
import com.chhurngsapplication.app.modules.likesixteen.`data`.model.LikeSixteenRowModel
import kotlin.Int
import kotlin.collections.List

class LikeSixteenAdapter(
  var list: List<LikeSixteenRowModel>
) : RecyclerView.Adapter<LikeSixteenAdapter.RowLikeSixteenVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowLikeSixteenVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_like_sixteen,parent,false)
    return RowLikeSixteenVH(view)
  }

  override fun onBindViewHolder(holder: RowLikeSixteenVH, position: Int) {
    val likeSixteenRowModel = LikeSixteenRowModel()
    // TODO uncomment following line after integration with data source
    // val likeSixteenRowModel = list[position]
    holder.binding.likeSixteenRowModel = likeSixteenRowModel
  }

  override fun getItemCount(): Int = 10
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<LikeSixteenRowModel>) {
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
      item: LikeSixteenRowModel
    ) {
    }
  }

  inner class RowLikeSixteenVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowLikeSixteenBinding = RowLikeSixteenBinding.bind(itemView)
  }
}
