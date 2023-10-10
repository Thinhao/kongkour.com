package com.chhurngsapplication.app.modules.likefifteen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowLikeFifteenBinding
import com.chhurngsapplication.app.modules.likefifteen.`data`.model.LikeFifteenRowModel
import kotlin.Int
import kotlin.collections.List

class LikeFifteenAdapter(
  var list: List<LikeFifteenRowModel>
) : RecyclerView.Adapter<LikeFifteenAdapter.RowLikeFifteenVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowLikeFifteenVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_like_fifteen,parent,false)
    return RowLikeFifteenVH(view)
  }

  override fun onBindViewHolder(holder: RowLikeFifteenVH, position: Int) {
    val likeFifteenRowModel = LikeFifteenRowModel()
    // TODO uncomment following line after integration with data source
    // val likeFifteenRowModel = list[position]
    holder.binding.likeFifteenRowModel = likeFifteenRowModel
  }

  override fun getItemCount(): Int = 10
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<LikeFifteenRowModel>) {
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
      item: LikeFifteenRowModel
    ) {
    }
  }

  inner class RowLikeFifteenVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowLikeFifteenBinding = RowLikeFifteenBinding.bind(itemView)
  }
}
