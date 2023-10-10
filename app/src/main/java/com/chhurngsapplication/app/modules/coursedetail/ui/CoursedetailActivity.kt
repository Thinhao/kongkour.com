package com.chhurngsapplication.app.modules.coursedetail.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityCoursedetailBinding
import com.chhurngsapplication.app.modules.coursedetail.`data`.model.Datalist4RowModel
import com.chhurngsapplication.app.modules.coursedetail.`data`.viewmodel.CoursedetailVM
import com.chhurngsapplication.app.modules.sixteen.ui.SixteenActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CoursedetailActivity :
    BaseActivity<ActivityCoursedetailBinding>(R.layout.activity_coursedetail) {
  private val viewModel: CoursedetailVM by viewModels<CoursedetailVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val dataListAdapter = DataListAdapter(viewModel.dataListList.value?:mutableListOf())
    binding.recyclerDataList.adapter = dataListAdapter
    dataListAdapter.setOnItemClickListener(
    object : DataListAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Datalist4RowModel) {
        onClickRecyclerDataList(view, position, item)
      }
    }
    )
    viewModel.dataListList.observe(this) {
      dataListAdapter.updateData(it)
    }
    binding.coursedetailVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearBOTTOMNAV.setOnClickListener {
      val destIntent = SixteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerDataList(
    view: View,
    position: Int,
    item: Datalist4RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "COURSEDETAIL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CoursedetailActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
