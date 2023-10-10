package com.chhurngsapplication.app.modules.sixteen.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.chhurngsapplication.app.databinding.SlideritemSixteen1Binding
import com.chhurngsapplication.app.modules.sixteen.`data`.model.ImageSliderSliderlanguageModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SliderlanguageAdapter(
  val dataList: ArrayList<ImageSliderSliderlanguageModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSliderlanguageModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemSixteen1Binding) {
      binding.imageSliderSliderlanguageModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemSixteen1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
