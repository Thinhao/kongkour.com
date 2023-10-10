package com.chhurngsapplication.app.modules.brandingpage.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowBrandingPageBinding
import com.chhurngsapplication.app.modules.brandingpage.`data`.model.BrandingPageRowModel
import kotlin.Int
import kotlin.collections.List

class BrandingPageAdapter(
  var list: List<BrandingPageRowModel>
) : RecyclerView.Adapter<BrandingPageAdapter.RowBrandingPageVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowBrandingPageVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_branding_page,parent,false)
    return RowBrandingPageVH(view)
  }

  override fun onBindViewHolder(holder: RowBrandingPageVH, position: Int) {
    val brandingPageRowModel = BrandingPageRowModel()
    // TODO uncomment following line after integration with data source
    // val brandingPageRowModel = list[position]
    holder.binding.brandingPageRowModel = brandingPageRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<BrandingPageRowModel>) {
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
      item: BrandingPageRowModel
    ) {
    }
  }

  inner class RowBrandingPageVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowBrandingPageBinding = RowBrandingPageBinding.bind(itemView)
  }
}
