package com.chhurngsapplication.app.modules.surveyone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.databinding.RowSurveyOneBinding
import com.chhurngsapplication.app.modules.surveyone.`data`.model.SurveyOneRowModel
import kotlin.Int
import kotlin.collections.List

class SurveyOneAdapter(
  var list: List<SurveyOneRowModel>
) : RecyclerView.Adapter<SurveyOneAdapter.RowSurveyOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSurveyOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_survey_one,parent,false)
    return RowSurveyOneVH(view)
  }

  override fun onBindViewHolder(holder: RowSurveyOneVH, position: Int) {
    val surveyOneRowModel = SurveyOneRowModel()
    // TODO uncomment following line after integration with data source
    // val surveyOneRowModel = list[position]
    holder.binding.surveyOneRowModel = surveyOneRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SurveyOneRowModel>) {
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
      item: SurveyOneRowModel
    ) {
    }
  }

  inner class RowSurveyOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowSurveyOneBinding = RowSurveyOneBinding.bind(itemView)
  }
}
