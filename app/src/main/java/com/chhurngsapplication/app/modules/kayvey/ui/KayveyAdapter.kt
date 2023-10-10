package com.chhurngsapplication.app.modules.kayvey.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowKayveyBinding
import com.chhurngsapplication.app.modules.kayvey.`data`.model.KayveyRowModel
import kotlin.Int
import kotlin.collections.List

class KayveyAdapter(
  var list: List<KayveyRowModel>
) : RecyclerView.Adapter<KayveyAdapter.RowKayveyVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowKayveyVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_kayvey,parent,false)
    return RowKayveyVH(view)
  }

  override fun onBindViewHolder(holder: RowKayveyVH, position: Int) {
    val kayveyRowModel = KayveyRowModel()
    // TODO uncomment following line after integration with data source
    // val kayveyRowModel = list[position]
    holder.binding.kayveyRowModel = kayveyRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<KayveyRowModel>) {
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
      item: KayveyRowModel
    ) {
    }
  }

  inner class RowKayveyVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowKayveyBinding = RowKayveyBinding.bind(itemView)
  }
}
