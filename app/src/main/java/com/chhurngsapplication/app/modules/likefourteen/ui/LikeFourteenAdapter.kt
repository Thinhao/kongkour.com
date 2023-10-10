package com.chhurngsapplication.app.modules.likefourteen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowLikeFourteenBinding
import com.chhurngsapplication.app.modules.likefourteen.`data`.model.LikeFourteenRowModel
import kotlin.Int
import kotlin.collections.List

class LikeFourteenAdapter(
  var list: List<LikeFourteenRowModel>
) : RecyclerView.Adapter<LikeFourteenAdapter.RowLikeFourteenVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowLikeFourteenVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_like_fourteen,parent,false)
    return RowLikeFourteenVH(view)
  }

  override fun onBindViewHolder(holder: RowLikeFourteenVH, position: Int) {
    val likeFourteenRowModel = LikeFourteenRowModel()
    // TODO uncomment following line after integration with data source
    // val likeFourteenRowModel = list[position]
    holder.binding.likeFourteenRowModel = likeFourteenRowModel
  }

  override fun getItemCount(): Int = 10
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<LikeFourteenRowModel>) {
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
      item: LikeFourteenRowModel
    ) {
    }
  }

  inner class RowLikeFourteenVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowLikeFourteenBinding = RowLikeFourteenBinding.bind(itemView)
  }
}
