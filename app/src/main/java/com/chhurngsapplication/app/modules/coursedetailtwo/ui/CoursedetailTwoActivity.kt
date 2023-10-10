package com.chhurngsapplication.app.modules.coursedetailtwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityCoursedetailTwoBinding
import com.chhurngsapplication.app.modules.coursedetailtwo.`data`.model.Datalist2RowModel
import com.chhurngsapplication.app.modules.coursedetailtwo.`data`.viewmodel.CoursedetailTwoVM
import com.chhurngsapplication.app.modules.one.ui.OneActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CoursedetailTwoActivity :
    BaseActivity<ActivityCoursedetailTwoBinding>(R.layout.activity_coursedetail_two) {
  private val viewModel: CoursedetailTwoVM by viewModels<CoursedetailTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val dataListAdapter = DataListAdapter(viewModel.dataListList.value?:mutableListOf())
    binding.recyclerDataList.adapter = dataListAdapter
    dataListAdapter.setOnItemClickListener(
    object : DataListAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Datalist2RowModel) {
        onClickRecyclerDataList(view, position, item)
      }
    }
    )
    viewModel.dataListList.observe(this) {
      dataListAdapter.updateData(it)
    }
    binding.coursedetailTwoVM = viewModel
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
    item: Datalist2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "COURSEDETAIL_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CoursedetailTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
