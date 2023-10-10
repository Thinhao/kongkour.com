package com.chhurngsapplication.app.modules.exploreone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowExploreOneBinding
import com.chhurngsapplication.app.modules.exploreone.`data`.model.ExploreOneRowModel
import kotlin.Int
import kotlin.collections.List

class ExploreOneAdapter(
  var list: List<ExploreOneRowModel>
) : RecyclerView.Adapter<ExploreOneAdapter.RowExploreOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowExploreOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_explore_one,parent,false)
    return RowExploreOneVH(view)
  }

  override fun onBindViewHolder(holder: RowExploreOneVH, position: Int) {
    val exploreOneRowModel = ExploreOneRowModel()
    // TODO uncomment following line after integration with data source
    // val exploreOneRowModel = list[position]
    holder.binding.exploreOneRowModel = exploreOneRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ExploreOneRowModel>) {
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
      item: ExploreOneRowModel
    ) {
    }
  }

  inner class RowExploreOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowExploreOneBinding = RowExploreOneBinding.bind(itemView)
  }
}
