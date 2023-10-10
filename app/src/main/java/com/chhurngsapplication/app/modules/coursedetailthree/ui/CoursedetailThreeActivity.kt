package com.chhurngsapplication.app.modules.coursedetailthree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityCoursedetailThreeBinding
import com.chhurngsapplication.app.modules.coursedetailthree.`data`.model.Datalist5RowModel
import com.chhurngsapplication.app.modules.coursedetailthree.`data`.viewmodel.CoursedetailThreeVM
import com.chhurngsapplication.app.modules.sixteen.ui.SixteenActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CoursedetailThreeActivity :
    BaseActivity<ActivityCoursedetailThreeBinding>(R.layout.activity_coursedetail_three) {
  private val viewModel: CoursedetailThreeVM by viewModels<CoursedetailThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val dataListAdapter = DataListAdapter(viewModel.dataListList.value?:mutableListOf())
    binding.recyclerDataList.adapter = dataListAdapter
    dataListAdapter.setOnItemClickListener(
    object : DataListAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Datalist5RowModel) {
        onClickRecyclerDataList(view, position, item)
      }
    }
    )
    viewModel.dataListList.observe(this) {
      dataListAdapter.updateData(it)
    }
    binding.coursedetailThreeVM = viewModel
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
    item: Datalist5RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "COURSEDETAIL_THREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CoursedetailThreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
