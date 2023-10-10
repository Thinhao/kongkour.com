package com.chhurngsapplication.app.modules.coursedetailone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityCoursedetailOneBinding
import com.chhurngsapplication.app.modules.coursedetailone.`data`.model.DatalistRowModel
import com.chhurngsapplication.app.modules.coursedetailone.`data`.viewmodel.CoursedetailOneVM
import com.chhurngsapplication.app.modules.one.ui.OneActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CoursedetailOneActivity :
    BaseActivity<ActivityCoursedetailOneBinding>(R.layout.activity_coursedetail_one) {
  private val viewModel: CoursedetailOneVM by viewModels<CoursedetailOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val dataListAdapter = DataListAdapter(viewModel.dataListList.value?:mutableListOf())
    binding.recyclerDataList.adapter = dataListAdapter
    dataListAdapter.setOnItemClickListener(
    object : DataListAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : DatalistRowModel) {
        onClickRecyclerDataList(view, position, item)
      }
    }
    )
    viewModel.dataListList.observe(this) {
      dataListAdapter.updateData(it)
    }
    binding.coursedetailOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.viewRectangle914.setOnClickListener {
      val destIntent = OneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerDataList(
    view: View,
    position: Int,
    item: DatalistRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "COURSEDETAIL_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CoursedetailOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
