package com.chhurngsapplication.app.modules.theaone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityTheaOneBinding
import com.chhurngsapplication.app.modules.theaone.`data`.model.TheaOneRowModel
import com.chhurngsapplication.app.modules.theaone.`data`.viewmodel.TheaOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class TheaOneActivity : BaseActivity<ActivityTheaOneBinding>(R.layout.activity_thea_one) {
  private val viewModel: TheaOneVM by viewModels<TheaOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val theaOneAdapter = TheaOneAdapter(viewModel.theaOneList.value?:mutableListOf())
    binding.recyclerTheaOne.adapter = theaOneAdapter
    theaOneAdapter.setOnItemClickListener(
    object : TheaOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : TheaOneRowModel) {
        onClickRecyclerTheaOne(view, position, item)
      }
    }
    )
    viewModel.theaOneList.observe(this) {
      theaOneAdapter.updateData(it)
    }
    binding.theaOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerTheaOne(
    view: View,
    position: Int,
    item: TheaOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "THEA_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TheaOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
