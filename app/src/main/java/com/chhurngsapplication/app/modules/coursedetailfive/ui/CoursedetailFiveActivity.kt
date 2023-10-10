package com.chhurngsapplication.app.modules.coursedetailfive.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityCoursedetailFiveBinding
import com.chhurngsapplication.app.modules.coursedetailfive.`data`.model.Datalist3RowModel
import com.chhurngsapplication.app.modules.coursedetailfive.`data`.viewmodel.CoursedetailFiveVM
import com.chhurngsapplication.app.modules.sixteen.ui.SixteenActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CoursedetailFiveActivity :
    BaseActivity<ActivityCoursedetailFiveBinding>(R.layout.activity_coursedetail_five) {
  private val viewModel: CoursedetailFiveVM by viewModels<CoursedetailFiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val dataListAdapter = DataListAdapter(viewModel.dataListList.value?:mutableListOf())
    binding.recyclerDataList.adapter = dataListAdapter
    dataListAdapter.setOnItemClickListener(
    object : DataListAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Datalist3RowModel) {
        onClickRecyclerDataList(view, position, item)
      }
    }
    )
    viewModel.dataListList.observe(this) {
      dataListAdapter.updateData(it)
    }
    binding.coursedetailFiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.viewRectangle914.setOnClickListener {
      val destIntent = SixteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerDataList(
    view: View,
    position: Int,
    item: Datalist3RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "COURSEDETAIL_FIVE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CoursedetailFiveActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
