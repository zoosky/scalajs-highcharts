/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;bubble&gt;-point</code>
  */
@js.annotation.ScalaJSDefined
class SeriesBubblePoint extends js.Object {

  /**
    * Events for each single point
    */
  val events: js.UndefOr[CleanJsObject[SeriesBubblePointEvents]] = js.undefined
}

object SeriesBubblePoint {
  /**
    * @param events Events for each single point
    */
  def apply(events: js.UndefOr[CleanJsObject[SeriesBubblePointEvents]] = js.undefined): SeriesBubblePoint = {
    val eventsOuter: js.UndefOr[CleanJsObject[SeriesBubblePointEvents]] = events
    new SeriesBubblePoint {
      override val events: js.UndefOr[CleanJsObject[SeriesBubblePointEvents]] = eventsOuter
    }
  }
}
