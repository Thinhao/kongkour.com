package com.chhurngsapplication.app.modules.hannahprofile.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowHannahProfileBinding
import com.chhurngsapplication.app.modules.hannahprofile.`data`.model.HannahProfileRowModel
import kotlin.Int
import kotlin.collections.List

class HannahProfileAdapter(
  var list: List<HannahProfileRowModel>
) : RecyclerView.Adapter<HannahProfileAdapter.RowHannahProfileVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHannahProfileVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_hannah_profile,parent,false)
    return RowHannahProfileVH(view)
  }

  override fun onBindViewHolder(holder: RowHannahProfileVH, position: Int) {
    val hannahProfileRowModel = HannahProfileRowModel()
    // TODO uncomment following line after integration with data source
    // val hannahProfileRowModel = list[position]
    holder.binding.hannahProfileRowModel = hannahProfileRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<HannahProfileRowModel>) {
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
      item: HannahProfileRowModel
    ) {
    }
  }

  inner class RowHannahProfileVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowHannahProfileBinding = RowHannahProfileBinding.bind(itemView)
  }
}
