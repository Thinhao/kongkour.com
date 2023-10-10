package com.chhurngsapplication.app.modules.coursedetailfour.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityCoursedetailFourBinding
import com.chhurngsapplication.app.modules.coursedetailfour.`data`.model.Datalist1RowModel
import com.chhurngsapplication.app.modules.coursedetailfour.`data`.viewmodel.CoursedetailFourVM
import com.chhurngsapplication.app.modules.one.ui.OneActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CoursedetailFourActivity :
    BaseActivity<ActivityCoursedetailFourBinding>(R.layout.activity_coursedetail_four) {
  private val viewModel: CoursedetailFourVM by viewModels<CoursedetailFourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val dataListAdapter = DataListAdapter(viewModel.dataListList.value?:mutableListOf())
    binding.recyclerDataList.adapter = dataListAdapter
    dataListAdapter.setOnItemClickListener(
    object : DataListAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Datalist1RowModel) {
        onClickRecyclerDataList(view, position, item)
      }
    }
    )
    viewModel.dataListList.observe(this) {
      dataListAdapter.updateData(it)
    }
    binding.coursedetailFourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearBOTTOMNAV.setOnClickListener {
      val destIntent = OneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerDataList(
    view: View,
    position: Int,
    item: Datalist1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "COURSEDETAIL_FOUR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CoursedetailFourActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
