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
  * @note JavaScript name: <code>series&lt;ohlc&gt;-point</code>
  */
@js.annotation.ScalaJSDefined
class SeriesOhlcPoint extends js.Object {

  /**
    * Events for each single point
    */
  val events: js.UndefOr[CleanJsObject[SeriesOhlcPointEvents]] = js.undefined
}

object SeriesOhlcPoint {
  /**
    * @param events Events for each single point
    */
  def apply(events: js.UndefOr[CleanJsObject[SeriesOhlcPointEvents]] = js.undefined): SeriesOhlcPoint = {
    val eventsOuter: js.UndefOr[CleanJsObject[SeriesOhlcPointEvents]] = events
    new SeriesOhlcPoint {
      override val events: js.UndefOr[CleanJsObject[SeriesOhlcPointEvents]] = eventsOuter
    }
  }
}
