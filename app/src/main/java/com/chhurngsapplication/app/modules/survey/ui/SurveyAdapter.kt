package com.chhurngsapplication.app.modules.survey.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowSurveyBinding
import com.chhurngsapplication.app.modules.survey.`data`.model.SurveyRowModel
import kotlin.Int
import kotlin.collections.List

class SurveyAdapter(
  var list: List<SurveyRowModel>
) : RecyclerView.Adapter<SurveyAdapter.RowSurveyVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSurveyVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_survey,parent,false)
    return RowSurveyVH(view)
  }

  override fun onBindViewHolder(holder: RowSurveyVH, position: Int) {
    val surveyRowModel = SurveyRowModel()
    // TODO uncomment following line after integration with data source
    // val surveyRowModel = list[position]
    holder.binding.surveyRowModel = surveyRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SurveyRowModel>) {
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
      item: SurveyRowModel
    ) {
    }
  }

  inner class RowSurveyVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowSurveyBinding = RowSurveyBinding.bind(itemView)
  }
}
