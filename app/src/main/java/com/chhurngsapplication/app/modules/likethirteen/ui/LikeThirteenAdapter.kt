package com.chhurngsapplication.app.modules.likethirteen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowLikeThirteenBinding
import com.chhurngsapplication.app.modules.likethirteen.`data`.model.LikeThirteenRowModel
import kotlin.Int
import kotlin.collections.List

class LikeThirteenAdapter(
  var list: List<LikeThirteenRowModel>
) : RecyclerView.Adapter<LikeThirteenAdapter.RowLikeThirteenVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowLikeThirteenVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_like_thirteen,parent,false)
    return RowLikeThirteenVH(view)
  }

  override fun onBindViewHolder(holder: RowLikeThirteenVH, position: Int) {
    val likeThirteenRowModel = LikeThirteenRowModel()
    // TODO uncomment following line after integration with data source
    // val likeThirteenRowModel = list[position]
    holder.binding.likeThirteenRowModel = likeThirteenRowModel
  }

  override fun getItemCount(): Int = 10
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<LikeThirteenRowModel>) {
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
      item: LikeThirteenRowModel
    ) {
    }
  }

  inner class RowLikeThirteenVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowLikeThirteenBinding = RowLikeThirteenBinding.bind(itemView)
  }
}
