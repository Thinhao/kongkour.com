package com.chhurngsapplication.app.modules.kayveyone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityKayveyOneBinding
import com.chhurngsapplication.app.modules.kayveyone.`data`.model.KayveyOneRowModel
import com.chhurngsapplication.app.modules.kayveyone.`data`.viewmodel.KayveyOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class KayveyOneActivity : BaseActivity<ActivityKayveyOneBinding>(R.layout.activity_kayvey_one) {
  private val viewModel: KayveyOneVM by viewModels<KayveyOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val kayveyOneAdapter = KayveyOneAdapter(viewModel.kayveyOneList.value?:mutableListOf())
    binding.recyclerKayveyOne.adapter = kayveyOneAdapter
    kayveyOneAdapter.setOnItemClickListener(
    object : KayveyOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : KayveyOneRowModel) {
        onClickRecyclerKayveyOne(view, position, item)
      }
    }
    )
    viewModel.kayveyOneList.observe(this) {
      kayveyOneAdapter.updateData(it)
    }
    binding.kayveyOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerKayveyOne(
    view: View,
    position: Int,
    item: KayveyOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "KAYVEY_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, KayveyOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
