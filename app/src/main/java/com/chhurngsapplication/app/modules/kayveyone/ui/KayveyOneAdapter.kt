package com.chhurngsapplication.app.modules.kayveyone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowKayveyOneBinding
import com.chhurngsapplication.app.modules.kayveyone.`data`.model.KayveyOneRowModel
import kotlin.Int
import kotlin.collections.List

class KayveyOneAdapter(
  var list: List<KayveyOneRowModel>
) : RecyclerView.Adapter<KayveyOneAdapter.RowKayveyOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowKayveyOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_kayvey_one,parent,false)
    return RowKayveyOneVH(view)
  }

  override fun onBindViewHolder(holder: RowKayveyOneVH, position: Int) {
    val kayveyOneRowModel = KayveyOneRowModel()
    // TODO uncomment following line after integration with data source
    // val kayveyOneRowModel = list[position]
    holder.binding.kayveyOneRowModel = kayveyOneRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<KayveyOneRowModel>) {
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
      item: KayveyOneRowModel
    ) {
    }
  }

  inner class RowKayveyOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowKayveyOneBinding = RowKayveyOneBinding.bind(itemView)
  }
}
