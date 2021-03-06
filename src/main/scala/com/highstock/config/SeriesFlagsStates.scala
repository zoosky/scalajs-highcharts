/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;flags&gt;-states</code>
  */
@js.annotation.ScalaJSDefined
class SeriesFlagsStates extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[CleanJsObject[SeriesFlagsStatesHover]] = js.undefined
}

object SeriesFlagsStates {
  /**
    * @param hover Options for the hovered series
    */
  def apply(hover: js.UndefOr[CleanJsObject[SeriesFlagsStatesHover]] = js.undefined): SeriesFlagsStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[SeriesFlagsStatesHover]] = hover
    new SeriesFlagsStates {
      override val hover: js.UndefOr[CleanJsObject[SeriesFlagsStatesHover]] = hoverOuter
    }
  }
}
