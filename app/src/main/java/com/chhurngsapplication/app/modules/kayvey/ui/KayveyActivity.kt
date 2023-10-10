package com.chhurngsapplication.app.modules.kayvey.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityKayveyBinding
import com.chhurngsapplication.app.modules.kayvey.`data`.model.KayveyRowModel
import com.chhurngsapplication.app.modules.kayvey.`data`.viewmodel.KayveyVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class KayveyActivity : BaseActivity<ActivityKayveyBinding>(R.layout.activity_kayvey) {
  private val viewModel: KayveyVM by viewModels<KayveyVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val kayveyAdapter = KayveyAdapter(viewModel.kayveyList.value?:mutableListOf())
    binding.recyclerKayvey.adapter = kayveyAdapter
    kayveyAdapter.setOnItemClickListener(
    object : KayveyAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : KayveyRowModel) {
        onClickRecyclerKayvey(view, position, item)
      }
    }
    )
    viewModel.kayveyList.observe(this) {
      kayveyAdapter.updateData(it)
    }
    binding.kayveyVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerKayvey(
    view: View,
    position: Int,
    item: KayveyRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "KAYVEY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, KayveyActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
